package com.example.demo.controller.imp;

import com.example.demo.bean.Dynamic;
import com.example.demo.controller.DynamicController;
import com.example.demo.service.imp.DynamicServiceImpl;
import com.util.ResponseData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dynamic")
@Api(value = "Dynamic")
public class DynamicControllerImpl implements DynamicController {
    @Autowired
    private DynamicServiceImpl dynamicService;


    @ResponseBody
    @ApiOperation(value = "ReleaseNews",notes = "发布动态")
    @PostMapping("/ReleaseNews")
    @Override
    public ResponseData<Integer> releaseNews(Dynamic dynamic) {
        ResponseData<Integer> integerResponseData = dynamicService.releaseNews(dynamic);
        return integerResponseData;
    }
    @ResponseBody
    @ApiOperation(value = "myDynamic",notes = "我的动态")
    @PostMapping("/myDynamic")
    @Override
    public List<Dynamic> myDynamic(String id) {
        List<Dynamic> dynamicList = dynamicService.myDynamic(id);
        return dynamicList;
    }
    @ResponseBody
    @ApiOperation(value = "deleteDynamic",notes = "删除动态")
    @PostMapping("/deleteDynamic")
    @Override
    public ResponseData<Integer> deleteDynamic(String id) {
        return dynamicService.deleteDynamic(id);

    }
}
