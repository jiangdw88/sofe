package com.util;

public enum EnumCode {
    // 定义成功的枚举常量，状态码，和描述
    SUCCESS(0, "ok"),
    // 定义系统异常的枚举常量，状态码，和描述
    SYSTEM_ERROR(5001, "服务器系统异常，请稍后..."),
    // 定义参数异常的枚举常量，状态码，和描述
    PARAMETER_ERROR(5002, "id不存在或输入错误"),
    // 定义用户名存在异常的枚举常量，状态码，和描述
    USER_HAS_ERROR(5003, "用户名已存在!"),
//    密码错误
    PASSWORD_ERROR(5005,"输入密码错误"),
//  账户名密码格式不正确
    USERORPASSWORD_ERROR(5004,"密码格式不正确以字母开头，长度在6~18之间，只能包含字母、数字和下划线!"),
//    查询没有此用户删除失败
    DELETE_FAIL(5006,"未找到账户或账户无效,删除失败!"),
//    密码修改失败
    CHANGEPASSWORD_FAIL(5007,"密码修改失败请检查输入是否正确"),
//    新旧密码一致
    SAME_PASSWORD(5008,"新密码和原密码输入一致,请重新输入!"),
//    发布动态失败
    ERROR_RELEASE(5009,"发布失败"),
//    评论动态已删除
    ERROR_COMMENT(5010,"动态已删除评论失败");
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
