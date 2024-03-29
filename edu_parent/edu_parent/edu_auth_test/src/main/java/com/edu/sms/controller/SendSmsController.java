package com.edu.sms.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.edu.base.ResultVo;
import com.edu.sms.dubbo.service.SendSmsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: edu_parent
 * @description: 短信发送控制器
 * @author: BaronLi
 * @create: 2019-07-11 15:47
 */
@RestController
@RequestMapping("sms")
public class SendSmsController {

    @Reference
    private SendSmsService sendSmsService;

    @RequestMapping(value = "send", method = RequestMethod.POST)
    public ResultVo send(@RequestParam(value = "asid", defaultValue = "") String asid,
                         @RequestParam(value = "templatecode", defaultValue = "") String templatecode,
                         @RequestParam(value = "telephone", defaultValue = "") String telephone,
                         @RequestParam(value = "signName", defaultValue = "") String signName,
                         @RequestParam(value = "templateParam", defaultValue = "") String templateParam,
                         @RequestParam(value = "type", defaultValue = "") String type) {
        return sendSmsService.send(asid, templatecode, telephone, signName, templateParam, type);
    }
}
