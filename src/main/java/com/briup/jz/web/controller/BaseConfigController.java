package com.briup.jz.web.controller;

import com.briup.jz.bean.BaseConfig;
import com.briup.jz.bean.BaseFile;
import com.briup.jz.service.IBaseConfigService;
import com.briup.jz.service.IBaseFileService;
import com.briup.jz.utils.Message;
import com.briup.jz.utils.MessageUtil;
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
 * 2021年06月03日 下午 07:51:58
 */
@Api(description = "系统配置表相关接口")
@Validated
@RestController
@RequestMapping("/baseConfig")
public class BaseConfigController {

    @Autowired
    private IBaseConfigService baseConfigService;

    @ApiOperation(value = "插入")
    @PostMapping("/saveOrUpdate")
    public Message saveOrUpdate(BaseConfig baseConfig) {
        baseConfigService.saveOrUpdate(baseConfig);
        return MessageUtil.success("更新成功");
    }

    @ApiOperation(value = "根据id查询")
    @GetMapping("/findById")
    public Message findById(Long id) {
        return MessageUtil.success(baseConfigService.findById(id));
    }

    @ApiOperation(value = "查询所有")
    @GetMapping("/findAll")
    public Message findAll() {
        return MessageUtil.success(baseConfigService.findAll());
    }

    @ApiOperation(value = "通过id删除")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键", paramType = "query", required = true),
    })
    @DeleteMapping("/deleteById")
    public Message deleteById(Long id) {
        baseConfigService.deleteById(id);
        return MessageUtil.success("删除成功");
    }


}
