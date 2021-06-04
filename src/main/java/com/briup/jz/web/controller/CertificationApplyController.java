package com.briup.jz.web.controller;

import com.briup.jz.bean.CertificationApply;
import com.briup.jz.service.ICertificationApplyService;
import com.briup.jz.utils.Message;
import com.briup.jz.utils.MessageUtil;
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

    @ApiOperation("根据id查询栏目信息")
    @ApiImplicitParam(name = "id", value = "栏目id", required = true, dataType = "long", paramType = "query")
    @GetMapping("findById")
    public Message findById(Long id) {
        return MessageUtil.success(certificationApplyService.findById(id));
    }

}
