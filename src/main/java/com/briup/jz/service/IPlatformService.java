package com.briup.jz.service;

import com.briup.jz.bean.Platform;
import com.briup.jz.utils.CustomerException;

import java.util.List;

public interface IPlatformService {
    void saveOrUpdate(Platform platform) throws CustomerException;

    List<Platform> findAll();

    Platform findById(Long id);

    void deleteById(Long id) throws CustomerException;
}
