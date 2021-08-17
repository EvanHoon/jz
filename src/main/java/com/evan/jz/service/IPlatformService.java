package com.evan.jz.service;

import com.evan.jz.bean.Platform;
import com.evan.jz.utils.CustomerException;

import java.util.List;

public interface IPlatformService {
    void saveOrUpdate(Platform platform) throws CustomerException;

    List<Platform> findAll();

    Platform findById(Long id);

    void deleteById(Long id) throws CustomerException;
}
