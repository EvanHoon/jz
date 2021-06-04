package com.briup.jz.service.impl;

import com.briup.jz.bean.BaseRolePrivilege;
import com.briup.jz.bean.BaseRolePrivilegeExample;
import com.briup.jz.bean.CertificationApply;
import com.briup.jz.bean.CertificationApplyExample;
import com.briup.jz.dao.CertificationApplyMapper;
import com.briup.jz.service.ICertificationApplyService;
import com.briup.jz.utils.CustomerException;
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

    @Override
    public void saveOrUpdate(CertificationApply certificationApply) {
        if (certificationApply.getId() != null) {
            certificationApplyMapper.updateByPrimaryKey(certificationApply);
        } else {
            certificationApplyMapper.insert(certificationApply);
        }
    }

    @Override
    public CertificationApply findById(Long id) {
        return certificationApplyMapper.selectByPrimaryKey(id);
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
