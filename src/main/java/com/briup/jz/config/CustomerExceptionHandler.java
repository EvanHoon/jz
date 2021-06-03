package com.briup.jz.config;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.briup.jz.utils.CustomerException;
import com.briup.jz.utils.Message;
import com.briup.jz.utils.MessageUtil;

/**
 * @program: jz
 * @description: 统一异常处理类
 * @author: charles
 * @create: 2019-03-13 21:03
 **/
@RestControllerAdvice
public class CustomerExceptionHandler {

    @ExceptionHandler(value =  Exception.class) // 捕获 Controller 中抛出的指定类型的异常，也可以指定其他异常
    public <E> Message handler(Exception exception){
        exception.printStackTrace();
        if(exception instanceof CustomerException){
            return MessageUtil.error(exception.getMessage());
        } else if (exception instanceof DataIntegrityViolationException) {
        	return MessageUtil.error("该数据暂时不允许删除！请先删除与当前数据关联的其他数据");
        }
        return MessageUtil.error("后台接口异常！");
    }
}
