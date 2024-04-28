package com.beer.sell.common.core.response;

import lombok.Getter;

/**
 * 登录
 * 1.  1 账号不存在  2 账号被警用   3 密码错误  4 登录失败
 * 400001
 */
@Getter
public enum ResponseCode {
    SUCCESS(200, "success"),
    /**
     *
     */
    SYS_ERROR(404, "系统错误"),
    /**
     *
     */
    USER_LOGIN_ERROR(400001, "用户登录失败"),
    /**
     *
     */
    USER_EXIST_ERROR(400002, "用户已存在"),
    /**
     *
     */
    USER_REGISTER_SUCCESS(40003, "注册成功"),
    /**
     *
     */
    USER_REGISTER_ERROR(40004, "注册失败"),
    /**
     * 会员未认证
     */
    MEMBER_NO_AUTH(40400, "未认证");

    private final String msg;
    private final Integer code;

    ResponseCode(Integer code, String msg) {
        this.msg = msg;
        this.code = code;
    }
}
