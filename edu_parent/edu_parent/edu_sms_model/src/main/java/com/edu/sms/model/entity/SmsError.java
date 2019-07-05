package com.edu.sms.model.entity;

/**
 * @program: edu_parent
 * @description: 发送短信失败记录表
 * @author: BaronLi
 * @create: 2019-07-05 11:19
 */
public class SmsError extends SmsBase {
    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
