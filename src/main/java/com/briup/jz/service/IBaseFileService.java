package com.briup.jz.service;

import com.briup.jz.bean.BaseFile;
import com.briup.jz.utils.CustomerException;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * author: 11721-任文豪
 * 2021年06月03日 下午 03:42:52
 */

public interface IBaseFileService {

    void save(BaseFile baseFile) throws CustomerException;

    BaseFile findById(String id);

    List<BaseFile> findAll();

    void deleteById(String id) throws CustomerException;
}
