package com.qx.wx;

import com.qx.conf.ConfigurationFiles;
import com.qx.redis.RedisService;
import com.qx.util.WxUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Map;

/**
 * 初始化微信token凭证 放到REDIS缓存数据库中
 */
@Service
@Slf4j
public class WechatService  implements CommandLineRunner {

    @Autowired
    private RedisService redisService;

    @Autowired
    private ConfigurationFiles configurationFiles;

    /**
     * 替换公众号token
     * @return token
     */
    public String replaceAccessToken(){
        boolean flag=false;
        String accessToken=redisService.getStr("accessToken_"+configurationFiles.getWxMpAppId());
        if(StringUtils.isEmpty(accessToken)){
            flag=true;
        }
        if(flag){
            Map<String,String> tokenResultMap= WxUtil.getAccessToken(configurationFiles.getWxMpAppId(),configurationFiles.getWxMpSceRet());
            Long expiresInMinute=Long.valueOf(tokenResultMap.get("expiresIn"));
            redisService.setStr("accessToken_"+configurationFiles.getWxMpAppId(),tokenResultMap.get("accessToken"),expiresInMinute);
        }
        return  redisService.getStr("accessToken_"+configurationFiles.getWxMpAppId());
    }

    @Override
    public void run(String... args) throws Exception {
//        log.info("get tokenXcxResultMap wechat error info....");
//        Map<String,String> tokenXcxResultMap= WxUtil.getAccessToken(configurationFiles.getWxMpAppId(),configurationFiles.getWxMpSceRet());
//        Long expiresInXcxMinute=Long.valueOf(tokenXcxResultMap.get("expiresIn"));
//        if(tokenXcxResultMap==null){
//            log.error("get tokenXcxResultMap wechat error info....");
//            return;
//        }
//        redisService.setStr("accessToken_"+configurationFiles.getWxMpAppId(),tokenXcxResultMap.get("accessToken"), expiresInXcxMinute);
    }
}
