package com.briup.jz.web.controller;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.jz.bean.BaseUser;
import com.briup.jz.service.IBaseUserService;
import com.briup.jz.utils.Message;
import com.briup.jz.utils.MessageUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(description = "用户表")
@Validated
@RestController
@RequestMapping("/baseUser")
public class BaseUserController {
	
	@Autowired
	private IBaseUserService baseUserService;
	  @ApiOperation(value = "查询所有用户")
	    @GetMapping("/findAll")
	    public Message findAll(String name) {
	       List<BaseUser>list = baseUserService.findAll();
	        return MessageUtil.success(list);
	    }
	  @ApiOperation(value = "通过id删除")
	    @GetMapping("/deleteById")
	    @ApiImplicitParams({
	    @ApiImplicitParam(name = "id", value = "主键", paramType = "form", required = true),
	    })
	    public Message deleteById(@NotNull Long id) {
	        baseUserService.deleteById(id);
	        return MessageUtil.success("删除成功");
	    }
	  
	  @ApiOperation(value = "保存或更新用户信息")
	    @PostMapping("/saveOrUpdate")
	    public Message saveOrUpdate(BaseUser baseUser) {
	        baseUserService.saveOrUpdate(baseUser);
	        return MessageUtil.success("更新成功");
	    }
	  @ApiOperation("根据id查询用户信息")
		@ApiImplicitParam(name="id",value="用户id",required=true,dataType="Long",paramType="query")
	    @GetMapping("findById")
	    public Message findById(Long id) {
	  	 return MessageUtil.success(baseUserService.findById(id));
	    }
	  
}
