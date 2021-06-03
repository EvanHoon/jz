package com.briup.jz.web.controller;

import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.briup.jz.bean.Address;
import com.briup.jz.service.IAddressService;
import com.briup.jz.utils.Message;
import com.briup.jz.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;


@Api(description = "顾客地址相关接口")
@Validated
@RestController
@RequestMapping("/address")
public class AddressController {
	  @Autowired
	    private IAddressService addressService;

		@ApiOperation(value="保存或更新地址信息",notes="如果id为空是保存，否则是更新")
		@PostMapping("/saveOrUpdate")
		public Message saveOrUpdate(Address address){
			addressService.saveOrUpdate(address);
			return MessageUtil.success("保存成功");
		}
		
		
		@ApiOperation("通过id删除")
		@ApiImplicitParam(name="id",value="主键",paramType="query",required=true)
		@DeleteMapping("/deleteById")
		public Message deleteByid(@NotNull Long id) {
			addressService.deleteById(id);
			return MessageUtil.success("删除成功");
		}
		
		@ApiOperation("查询所有客户地址信息")
		@GetMapping("/findAll")
		public Message findAll() {
			return MessageUtil.success(addressService.findAll());
		}
		
		
	    @ApiOperation("根据id查询客户地址信息")
		@ApiImplicitParam(name="id",value="客户地址id",required=true,dataType="long",paramType="query")
		@GetMapping("/findById")
		public Message findById(@NotNull Long id) {
			return MessageUtil.success(addressService.findById(id));
		}
	    
	    
	    @ApiOperation("根据客户名称模糊查询")
		@ApiImplicitParam(name="name",value="客户的名称",required=true,dataType="String",paramType="query")
		@GetMapping("/findNameLike")
		public Message findNameLike(String name){
			return MessageUtil.success(addressService.findLikeName(name));
	    }
}
	    
