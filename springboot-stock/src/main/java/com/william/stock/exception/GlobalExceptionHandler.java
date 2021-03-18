package com.william.stock.exception;

import com.william.stock.entity.response.ApiResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CommonException.class)
    public ApiResp<String> APIExceptionHandler(CommonException e) {
        log.warn(e.getMsg());
        return new ApiResp<>(e.getCode(),  e.getMsg(), null);
    }
}
