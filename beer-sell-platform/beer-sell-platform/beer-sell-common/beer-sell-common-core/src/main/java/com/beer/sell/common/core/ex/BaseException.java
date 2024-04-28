package com.beer.sell.common.core.ex;


import com.beer.sell.common.core.response.ResponseCode;
import lombok.Getter;

/**
 * @author zhangwei
 */
@Getter
public class BaseException extends RuntimeException {
    private final ResponseCode responseCode;

    public BaseException(ResponseCode responseCode) {
        this.responseCode = responseCode;
    }
}

