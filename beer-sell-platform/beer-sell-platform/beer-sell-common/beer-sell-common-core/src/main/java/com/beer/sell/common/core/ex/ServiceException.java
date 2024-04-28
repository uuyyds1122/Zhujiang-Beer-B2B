package com.beer.sell.common.core.ex;


import com.beer.sell.common.core.response.ResponseCode;

public class ServiceException extends BaseException {
    public ServiceException(ResponseCode responseCode) {
        super(responseCode);
    }
}
