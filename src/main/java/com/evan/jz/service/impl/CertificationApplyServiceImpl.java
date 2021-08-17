package com.evan.jz.service.impl;

import com.evan.jz.bean.CertificationApply;
import com.evan.jz.bean.CertificationApplyExample;
import com.evan.jz.dao.CertificationApplyMapper;
import com.evan.jz.dao.extend.CertificationApplyExtendMapper;
import com.evan.jz.service.ICertificationApplyService;
import com.evan.jz.utils.CustomerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * author: 11721-任文豪
 * 2021年06月03日 下午 05:45:35
 */

@Service
public class CertificationApplyServiceImpl implements ICertificationApplyService {

    @Autowired
    private CertificationApplyMapper certificationApplyMapper;

    @Autowired
    private CertificationApplyExtendMapper certificationApplyExtendMapper;

    @Override
    public void saveOrUpdate(CertificationApply certificationApply) {
        if (certificationApply.getId() != null) {
            certificationApplyMapper.updateByPrimaryKey(certificationApply);
        } else {
            certificationApplyMapper.insert(certificationApply);
        }
    }

    @Override
    public List<CertificationApply> queryCascade(String realname, String status) {
        return certificationApplyExtendMapper.select(realname, status);
    }

    @Override
    public List<CertificationApply> findAll() {
        return certificationApplyMapper.selectByExample(new CertificationApplyExample());
    }

    @Override
    public void deleteById(Long id) {
        if (certificationApplyMapper.selectByPrimaryKey(id) == null) {
            throw new CustomerException("要删除的分类信息不存在");
        }
        certificationApplyMapper.deleteByPrimaryKey(id);
    }
}
