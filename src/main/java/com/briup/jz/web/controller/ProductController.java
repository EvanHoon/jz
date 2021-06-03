package com.briup.jz.web.controller;

import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.briup.jz.bean.Product;
import com.briup.jz.service.IProductService;
import com.briup.jz.utils.Message;
import com.briup.jz.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;


@Api(description = "产品信息相关接口")
@Validated
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private IProductService productService;
    
    
    @ApiOperation(value = "插入或更新")
    @PostMapping("/saveOrUpdate")
    public Message saveOrUpdate(Product product) {
    	productService.saveOrUpdate(product);
    	return MessageUtil.success("更新成功");
    }

    @ApiOperation(value = "通过id删除产品")
    @DeleteMapping("/deleteById")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "id", value = "主键", paramType = "form", required = true)
})
    public Message deleteById(@NotNull Long id) {
    	productService.deleteById(id);
    	return MessageUtil.success("删除成功");
    }
    
    
    @ApiOperation("查询所有产品信息")
	@GetMapping("/findAll")
    public Message findAll() {
    	return MessageUtil.success(productService.findAll());
    }
    
    @ApiOperation("根据id查询产品信息")
	@ApiImplicitParam(name="id",value="产品id",required=true,dataType="long",paramType="query")
	@GetMapping("/findById")
    public Message findById(long id) {
    	return MessageUtil.success(productService.findById(id));
    }
    
    @ApiOperation("根据产品名称模糊查询")
	@ApiImplicitParam(name="name",value="产品的名称",required=true,dataType="String",paramType="query")
	@GetMapping("/findNameLike")
	public Message findNameLike(String name){
		return MessageUtil.success(productService.findLikeName(name));
	}
}
