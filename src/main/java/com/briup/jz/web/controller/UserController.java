package com.briup.jz.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.jz.bean.BaseUser;
import com.briup.jz.utils.Message;
import com.briup.jz.utils.MessageUtil;

import io.swagger.annotations.Api;

@Api(description = "用户控制器")
@Validated
@RestController
@RequestMapping("/user")
public class UserController {
	// 这里是假登录
	@PostMapping("login")
	public Message login(String username, String password) {
		Map<String, String> map = new HashMap<>();
		map.put("token", "admin");
		return MessageUtil.success(map);
	}

	// 这里是假获取用户信息
	@GetMapping("info")
	public Message info(String token) {
		BaseUser user = new BaseUser();
		user.setRealname("张三");
		user.setUserFace("http://121.199.29.84:8888/group1/M00/00/16/rBD-SV_EpjyAa0qIAAA-lQCALyU911.jpg");
		return MessageUtil.success(user);
	}

	// 这里是假退出
	@PostMapping("logout")
	public Message logout() {
		return MessageUtil.success(null);
	}
}
