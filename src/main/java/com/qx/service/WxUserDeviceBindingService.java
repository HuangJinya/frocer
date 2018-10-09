package com.qx.service;

import com.qx.bean.WxUserDeviceBinding;

import java.util.List;

public interface WxUserDeviceBindingService {
    List<WxUserDeviceBinding> findWxUserDeviceBindingByWxOpenId(String WxOpenId);
}
