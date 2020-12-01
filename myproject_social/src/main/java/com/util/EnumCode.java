package com.util;

public enum EnumCode {
    // 定义成功的枚举常量，状态码，和描述
    SUCCESS(0, "ok"),
    // 定义系统异常的枚举常量，状态码，和描述
    SYSTEM_ERROR(5001, "服务器系统异常，请稍后..."),
    // 定义参数异常的枚举常量，状态码，和描述
    PARAMETER_ERROR(5002, "参数异常，认证失败..."),
    // 定义用户名存在异常的枚举常量，状态码，和描述
    USER_HAS_ERROR(5003, "用户名已存在...."),
//    密码错误
    PASSWORD_ERROR(5005,"密码错误"),
//  账户名密码格式不正确
    USERORPASSWORD_ERROR(5004,"账户名或密码格式不正确");
    // 定义的枚举常量属性。
    private int code;// 状态码
    private String message;// 描述

    /**
     * 私有构造,防止被外部调用
     */
    private EnumCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * 定义方法,返回描述,跟常规类的定义get没区别
     *
     * @return
     */
    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
