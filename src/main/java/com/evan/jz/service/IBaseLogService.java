package com.evan.jz.service;

import com.evan.jz.bean.BaseLog;
import com.evan.jz.utils.CustomerException;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * author: 11721-任文豪
 * 2021年06月03日 下午 03:42:44
 */

public interface IBaseLogService {

    void saveOrUpdate(BaseLog baseLog) throws CustomerException;

    BaseLog findById(Long id);

    List<BaseLog> findAll();

    void deleteById(Long id) throws CustomerException;

}
