package com.qx.service.impl;

import com.qx.bean.WxUserDeviceBinding;
import com.qx.dao.WxUserDeviceBindingRepository;
import com.qx.service.WxUserDeviceBindingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WxUserDeviceBindingServiceImpl  implements WxUserDeviceBindingService{

    @Autowired
    private WxUserDeviceBindingRepository wxUserDeviceBindingRepository;

    @Override
    public List<WxUserDeviceBinding> findWxUserDeviceBindingByWxOpenId(String WxOpenId) {
        return wxUserDeviceBindingRepository.findWxUserDeviceBindingByWxOpenId(WxOpenId);
    }
}
