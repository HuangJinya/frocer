package com.qx.controller;

import com.qx.bean.WxUserDeviceBinding;
import com.qx.dao.WxUserDeviceBindingRepository;
import com.qx.service.WxUserDeviceBindingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class WxUserDeviceBindingController {

    @Autowired
    WxUserDeviceBindingService wxUserDeviceBindingService;


    @RequestMapping(value ="/findWxUserDeviceBindingByWxOpenId/{openId}",method= RequestMethod.GET)
    public ModelAndView findWxUserDeviceBindingByWxOpenId_ (@PathVariable("openId") String openId){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("wx/wxUserDeviceBindingList");
        modelAndView.addObject("list", wxUserDeviceBindingService.findWxUserDeviceBindingByWxOpenId(openId));
        return modelAndView;
    }
}
