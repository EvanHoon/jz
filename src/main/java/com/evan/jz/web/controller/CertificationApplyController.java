package com.evan.jz.web.controller;

import com.evan.jz.bean.CertificationApply;
import com.evan.jz.service.ICertificationApplyService;
import com.evan.jz.utils.Message;
import com.evan.jz.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * author: 11721-任文豪
 * 2021年06月03日 下午 05:45:35
 */

@Controller
@Api(description = "实名认证申请表")
@Validated
@RestController
@RequestMapping("/certificationApply")
public class CertificationApplyController {

    @Autowired
    private ICertificationApplyService certificationApplyService;

    @ApiOperation(value = "查询所有资讯分类")
    @GetMapping("/findAll")
    public Message findAll(String name) {
        List<CertificationApply> list = certificationApplyService.findAll();
        return MessageUtil.success(list);
    }

    @ApiOperation(value = "通过id删除")
    @GetMapping("/deleteById")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键", paramType = "query", required = true),
    })
    public Message deleteById(@NotNull Long id) {
        certificationApplyService.deleteById(id);
        return MessageUtil.success("删除成功");
    }

    @ApiOperation(value = "保存或更新资讯分类信息")
    @PostMapping("/saveOrUpdate")
    public Message saveOrUpdate(CertificationApply certificationApply) {
        certificationApplyService.saveOrUpdate(certificationApply);
        return MessageUtil.success("更新成功");
    }

    @ApiOperation("多条件符合级联查询")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "realname", value = "用户名", paramType = "query"),
            @ApiImplicitParam(name = "status", value = "状态", paramType = "query"),
    })
    @GetMapping("/queryCascade")
    public Message queryCascade(String realname, String status) {
        return MessageUtil.success(certificationApplyService.queryCascade(realname, status));
    }

}
