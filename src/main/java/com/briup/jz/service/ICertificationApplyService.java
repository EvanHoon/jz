package com.briup.jz.service;

import com.briup.jz.bean.CertificationApply;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * author: 11721-任文豪
 * 2021年06月03日 下午 05:44:57
 */

public interface ICertificationApplyService {

    void saveOrUpdate(CertificationApply certificationApply);

    CertificationApply findById(Long id);

    List<CertificationApply> findAll();

    void deleteById(Long id);

}
