package com.briup.jz.web.controller;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.jz.bean.ProductCategory;
import com.briup.jz.service.IProductCategoryService;
import com.briup.jz.utils.Message;
import com.briup.jz.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Api(description = "产品分类相关接口")
@Validated
@RestController
@RequestMapping("/productCategory")
public class ProductCategoryController {
	
	@Autowired
	private IProductCategoryService productCategoryService;
	
	@ApiOperation(value="保存或更新产品类信息",notes="如果id为空是保存，否则是更新")
	@PostMapping("/saveOrUpdate")
	public Message saveOrUpdate(ProductCategory productCategory){
		productCategoryService.saveOrUpdate(productCategory);
		return MessageUtil.success("保存成功");
	}
	
	
	@ApiOperation("通过id删除")
	@ApiImplicitParam(name="id",value="主键",paramType="query",required=true)
	@DeleteMapping("/deleteById")
	public Message deleteByid(@NotNull Long id) {
		productCategoryService.deleteById(id);
		return MessageUtil.success("删除成功");
	}
	
	@ApiOperation("查询所有产品分类信息")
	@GetMapping("/findAll")
	public Message findAll() {
		return MessageUtil.success(productCategoryService.findAll());
	}
	
	
    @ApiOperation("根据id查询产品类别信息")
	@ApiImplicitParam(name="id",value="产品类别id",required=true,dataType="long",paramType="query")
	@GetMapping("/findById")
	public Message findById(@NotNull Long id) {
		return MessageUtil.success(productCategoryService.findById(id));
	}
}
