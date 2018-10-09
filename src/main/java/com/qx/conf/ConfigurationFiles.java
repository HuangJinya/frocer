package com.qx.conf;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class ConfigurationFiles {

    @Value("${WX_MP_APPID}")
    private String wxMpAppId;

    @Value("${MP_MCH_ID}")
    private String mpMchId;

    @Value("${WX_MP_SECRET}")
    private String wxMpSceRet;
}
