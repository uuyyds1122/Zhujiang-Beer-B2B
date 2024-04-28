package com.beer.sell.common.core.response;

import lombok.Data;

/**
 * 登录
 * 1.  1 账号不存在  2 账号被警用   3 密码错误  4 登录失败
 *
 * @author zhangwei
 */
@Data
public class ResponseEntity<T> {
    private String msg;
    private Integer code;
    private T data;

    public static <T> ResponseEntity<T> success(ResponseCode responseCode, T data) {
        return common(responseCode, data);
    }

    public static <T> ResponseEntity<T> success(T data) {
        return success(ResponseCode.SUCCESS, data);
    }

    public static <T> ResponseEntity<T> error(ResponseCode responseCode) {
        return common(responseCode, null);
    }

    public static <T> ResponseEntity<T> error() {
        return common(ResponseCode.SYS_ERROR, null);
    }

    private static <T> ResponseEntity<T> common(ResponseCode responseCode, T data) {
        ResponseEntity<T> entity = new ResponseEntity<>();
        entity.setMsg(responseCode.getMsg());
        entity.setCode(responseCode.getCode());
        entity.setData(data);
        return entity;
    }
}
