package com.imooc.mall.exception;

/**
 * @author Bixby
 * @create 2021-05-09
 */
/**
 * 描述：     统一异常
 */
public class ImoocMallException extends RuntimeException{
    private final Integer code;
    private final String message;

    public ImoocMallException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ImoocMallException(ImoocMallExceptionEnum exceptionEnum){
        this(exceptionEnum.getCode(), exceptionEnum.getMsg());
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
