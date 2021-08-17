package com.evan.jz.web.controller;

import com.evan.jz.bean.BaseRolePrivilege;
import com.evan.jz.service.IBaseRolePrivilegeService;
import com.evan.jz.utils.Message;
import com.evan.jz.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Created by IntelliJ IDEA.
 * author: 11721-任文豪
 * 2021年06月03日 下午 03:42:17
 */
@Api(description = "角色权限表相关接口")
@Validated
@RestController
@RequestMapping("/baseRolePrivilege")
public class BaseRolePrivilegeController {

    @Autowired
    private IBaseRolePrivilegeService baseRolePrivilegeService;

    @ApiOperation(value = "插入")
    @PostMapping("/saveOrUpdate")
    public Message saveOrUpdate(BaseRolePrivilege baseRolePrivilege) {
        baseRolePrivilegeService.saveOrUpdate(baseRolePrivilege);
        return MessageUtil.success("更新成功");
    }

    @ApiOperation(value = "根据id查询")
    @GetMapping("/findById")
    public Message findById(Long id) {
        return MessageUtil.success(baseRolePrivilegeService.findById(id));
    }

    @ApiOperation(value = "查询所有")
    @GetMapping("/findAll")
    public Message findAll() {
        return MessageUtil.success(baseRolePrivilegeService.findAll());
    }

    @ApiOperation(value = "通过id删除")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键", paramType = "query", required = true),
    })
    @DeleteMapping("/deleteById")
    public Message deleteById(Long id) {
        baseRolePrivilegeService.deleteById(id);
        return MessageUtil.success("删除成功");
    }

}
