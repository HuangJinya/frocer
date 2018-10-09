package com.qx.dao;

import com.qx.bean.WxUserDeviceBinding;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WxUserDeviceBindingRepository extends JpaRepository<WxUserDeviceBinding,Integer>{

    List<WxUserDeviceBinding> findWxUserDeviceBindingByWxOpenId(String WxOpenId);
}
