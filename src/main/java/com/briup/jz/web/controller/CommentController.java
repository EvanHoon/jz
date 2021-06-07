package com.briup.jz.web.controller;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.jz.bean.Comment;
import com.briup.jz.service.ICommentService;
import com.briup.jz.utils.Message;
import com.briup.jz.utils.MessageUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;


@Controller
@Api(description = "资讯评论")
@Validated
@RestController
@RequestMapping("/comment")
public class CommentController {
	
	 @Autowired
	  private ICommentService commentService;
	  @ApiOperation(value = "查询所有资讯分类")
	    @GetMapping("/findAll")
	    public Message findAll() {
	      List<Comment>list = commentService.findAll();
	        return MessageUtil.success(list);
	    }
	  @ApiOperation(value = "通过id删除")
	  @DeleteMapping("/deleteById")
	    @ApiImplicitParam(name = "id", value = "主键", paramType = "query", required = true)
	    public Message deleteById(@NotNull Long id) {
	        commentService.deleteById(id);
	        return MessageUtil.success("删除成功");
	    }
	  
	  @ApiOperation(value = "保存或更新资讯分类信息")
	    @PostMapping("/saveOrUpdate")
	    public Message saveOrUpdate(Comment comment) {
	        commentService.saveOrUpdate(comment);
	        return MessageUtil.success("更新成功");
	    }
	  @ApiOperation("根据id查询栏目信息")
		@ApiImplicitParam(name="id",value="栏目id",required=true,dataType="long",paramType="query")
	    @GetMapping("findById")
	    public Message findById(Long id) {
	  	  return MessageUtil.success(commentService.findById(id));
	    }
}
