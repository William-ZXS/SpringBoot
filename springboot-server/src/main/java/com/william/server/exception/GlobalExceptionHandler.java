package com.william.server.exception;

import com.william.server.entity.response.ApiResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.rmi.ServerException;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CommonException.class)
    public ApiResp<String> APIExceptionHandler(CommonException e) {
        log.warn(e.getMsg());
        return new ApiResp<>(e.getCode(),  e.getMsg(), null);
    }
}
