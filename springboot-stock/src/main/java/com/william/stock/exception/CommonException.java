package com.william.stock.exception;

import lombok.Getter;


@Getter //只要getter方法，无需setter
public class CommonException extends RuntimeException {
    private String code;
    private String msg;

    public CommonException() {
        this(ExceptionEnum.FAILED.getCode(), ExceptionEnum.FAILED.getMsg());
    }

    public CommonException(String msg) {
        this(ExceptionEnum.FAILED.getCode(), msg);
    }

    public CommonException(String code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }
    public CommonException(ExceptionEnum exceptionEnum) {
        this(exceptionEnum.getCode(),exceptionEnum.getMsg());
    }
}