package com.beer.sell.common.core.ex;


import com.beer.sell.common.core.response.ResponseCode;

/**
 * 利用AOP    异常通知  控制层   RestController
 * 自定异常       继承 RuntimeException
 * 业务代码 不要处理异常,如果处理了一定要抛出异常
 */
public class ControllerException extends BaseException {
    public ControllerException(ResponseCode responseCode) {
        super(responseCode);
    }
}
