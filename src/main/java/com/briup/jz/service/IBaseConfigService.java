package com.briup.jz.service;

import com.briup.jz.bean.BaseConfig;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * author: 11721-任文豪
 * 2021年06月03日 下午 07:43:49
 */

public interface IBaseConfigService {

    void saveOrUpdate(BaseConfig baseConfig);

    BaseConfig findById(Long id);

    List<BaseConfig> findAll();

    void deleteById(Long id);

}
