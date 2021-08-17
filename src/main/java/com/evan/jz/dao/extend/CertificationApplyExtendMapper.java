package com.evan.jz.dao.extend;

import com.evan.jz.bean.CertificationApply;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * author: 11721-任文豪
 * 2021年06月05日 下午 09:29:48
 */

public interface CertificationApplyExtendMapper {

    List<CertificationApply> select(String realname, String status);

}
