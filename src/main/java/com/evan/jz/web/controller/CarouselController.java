package com.evan.jz.web.controller;

import com.evan.jz.bean.Carousel;
import com.evan.jz.service.ICarouselService;
import com.evan.jz.utils.Message;
import com.evan.jz.utils.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@Api(description = "系统配置相关接口")
@Validated
@RestController
@RequestMapping("/carousel")
public class CarouselController {
    @Autowired
    private ICarouselService carouselService;

    @ApiOperation(value = "查询所有系统配置分类")
    @GetMapping("/findAll")
    public Message findAll(String name) {
        List<Carousel> list = carouselService.findAll();
        return MessageUtil.success(list);
    }

    @ApiOperation(value = "通过id删除")
    @GetMapping("/deleteById")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "主键", paramType = "query", required = true),
    })
    public Message deleteById(@NotNull Long id) {
        carouselService.deleteById(id);
        return MessageUtil.success("删除成功");
    }

    @PostMapping("/saveOrUpdate")
    @ApiOperation(value = "保存或更新栏目信息", notes = "如果id为空是保存否则更新")
    public Message saveOrUpdate(Carousel carousel) {
        carouselService.saveOrUpdate(carousel);
        return MessageUtil.success("操作成功");
    }

    @ApiOperation("根据Id查询栏目信息")
    @ApiImplicitParam(name = "id", value = "栏目id", required = true, dataType = "long", paramType = "query")
    @GetMapping("findById")
    public Message findById(Long id) {
        return MessageUtil.success(carouselService.findById(id));
    }

}
