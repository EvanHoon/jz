package com.evan.jz.web.controller;

import com.evan.jz.bean.BaseLog;
import com.evan.jz.service.IBaseLogService;
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
 * 2021年06月03日 下午 03:42:44
 */

@Api(description = "日志表相关接口")
@Validated
@RestController
@RequestMapping("/baseLog")
public class BaseLogController {

    @Autowired
    private IBaseLogService baseLogService;

    @ApiOperation(value = "插入")
    @PostMapping("/saveOrUpdate")
    public Message saveOrUpdate(BaseLog baseLog) {
        baseLogService.saveOrUpdate(baseLog);
        return MessageUtil.success("更新成功");
    }

    @ApiOperation(value = "根据id查询")
    @GetMapping("/findById")
    public Message findById(Long id) {
        return MessageUtil.success(baseLogService.findById(id));
    }

    @ApiOperation(value = "查询所有")
    @GetMapping("/findAll")
    public Message findAll() {
        return MessageUtil.success(baseLogService.findAll());
    }

    @ApiOperation(value = "通过id删除")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键", paramType = "query", required = true),
    })
    @DeleteMapping("/deleteById")
    public Message deleteById(Long id) {
        baseLogService.deleteById(id);
        return MessageUtil.success("删除成功");
    }

}
