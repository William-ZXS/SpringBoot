package com.william.order.exception;

import lombok.Getter;

@Getter
public enum ExceptionEnum {
    SUCCESS("200", "操作成功"),
    FAILED("1", "响应失败");

    private String code;
    private String msg;

    ExceptionEnum(String code,String msg){
        this.code = code;
        this.msg = msg;
    }

}
