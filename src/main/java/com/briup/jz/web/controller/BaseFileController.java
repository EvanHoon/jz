package com.briup.jz.web.controller;

import com.briup.jz.bean.BaseFile;
import com.briup.jz.service.IBaseFileService;
import com.briup.jz.utils.Message;
import com.briup.jz.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.annotation.MultipartConfig;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * author: 11721-任文豪
 * 2021年06月03日 下午 03:42:52
 */

@Api(description = "附件表相关接口")
@Validated
@RestController
@RequestMapping("/baseFile")
@MultipartConfig(maxFileSize = 1024 * 1024 * 100, maxRequestSize = 1024 * 1024 * 200)
public class BaseFileController {

    @Autowired
    private IBaseFileService baseFileService;

    @ApiOperation(value = "插入")
    @PostMapping("/save")
    public Message save(String fileType, MultipartFile source) throws IOException {
        baseFileService.save(fileType, source);
        return MessageUtil.success("插入成功");
    }

    @ApiOperation(value = "根据id查询")
    @GetMapping("/findById")
    public Message findById(String id) {
        return MessageUtil.success(baseFileService.findById(id));
    }

    @ApiOperation(value = "查询所有")
    @GetMapping("/findAll")
    public Message findAll() {
        return MessageUtil.success(baseFileService.findAll());
    }

    @ApiOperation(value = "通过id删除")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键", paramType = "query", required = true),
    })
    @DeleteMapping("/deleteById")
    public Message deleteById(String id) {
        baseFileService.deleteById(id);
        return MessageUtil.success("删除成功");
    }

}
