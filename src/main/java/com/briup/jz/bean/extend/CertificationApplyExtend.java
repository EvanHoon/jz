package com.briup.jz.bean.extend;

import com.briup.jz.bean.BaseUser;
import com.briup.jz.bean.CertificationApply;

/**
 * Created by IntelliJ IDEA.
 * author: 11721-任文豪
 * 2021年06月05日 下午 09:27:59
 */

public class CertificationApplyExtend extends CertificationApply {

    private BaseUser baseUser;

    public BaseUser getBaseUser() {
        return baseUser;
    }

    public void setBaseUser(BaseUser baseUser) {
        this.baseUser = baseUser;
    }
}
