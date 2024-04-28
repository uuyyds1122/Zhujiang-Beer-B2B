package com.beer.sell.common.core.handler;


import com.beer.sell.common.core.ex.BaseException;
import com.beer.sell.common.core.response.ResponseEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author zhangwei
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handlerException(Exception ex) {
        log.error(ex.getMessage());
        return ResponseEntity.error();
    }

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<Object> handlerException(BaseException ex) {
        return ResponseEntity.error(ex.getResponseCode());
    }
}
