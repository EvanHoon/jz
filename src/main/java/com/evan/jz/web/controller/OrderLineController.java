package com.evan.jz.web.controller;

import javax.validation.constraints.NotNull;

import com.evan.jz.bean.OrderLine;
import com.evan.jz.service.IOrderLineService;
import com.evan.jz.utils.Message;
import com.evan.jz.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;


@Api(description = "订单项相关接口")
@Validated
@RestController
@RequestMapping("/orderLine")
public class OrderLineController {
	@Autowired
	private IOrderLineService orderLineService;
	
	@ApiOperation(value="保存或更新订单项信息",notes="如果id为空是保存，否则是更新")
	@PostMapping("/saveOrUpdate")
	public Message saveOrUpdate(OrderLine orderLine){
		orderLineService.saveOrUpdate(orderLine);
		return MessageUtil.success("保存成功");
	}
	
	
	@ApiOperation("通过id删除")
	@ApiImplicitParam(name="id",value="主键",paramType="query",required=true)
	@DeleteMapping("/deleteById")
	public Message deleteByid(@NotNull Long id) {
		orderLineService.deleteById(id);
		return MessageUtil.success("删除成功");
	}
	
	@ApiOperation("查询所有订单项信息")
	@GetMapping("/findAll")
	public Message findAll() {
		return MessageUtil.success(orderLineService.findAll());
	}
	
	
    @ApiOperation("根据id查询订单项信息")
	@ApiImplicitParam(name="id",value="产品类别id",required=true,dataType="long",paramType="query")
	@GetMapping("/findById")
	public Message findById(@NotNull Long id) {
		return MessageUtil.success(orderLineService.findById(id));
	}
}
