package com.example.demo.controller.imp;

import com.example.demo.bean.Dynamic;
import com.example.demo.bean.DynamicAndSort;
import com.example.demo.bean.DynamicAndUser;
import com.example.demo.controller.DynamicController;
import com.example.demo.service.imp.DynamicServiceImpl;
import com.util.ResponseData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public ResponseData<List<DynamicAndSort>> myDynamic(String id) {
        System.out.println(id);
        return dynamicService.myDynamic(id);
    }
    @ResponseBody
    @ApiOperation(value = "deleteDynamic",notes = "删除动态")
    @PostMapping("/deleteDynamic")
    @Override
    public ResponseData<Integer> deleteDynamic(String id) {
        return dynamicService.deleteDynamic(id);

    }
    @ResponseBody
    @ApiOperation(value = "newDynamic",notes = "最新动态")
    @PostMapping("/newDynamic")
    @Override
    public ResponseData<List<DynamicAndSort>> newDynamic(String sortId, int minute) {
        return dynamicService.newDynamic(sortId, minute);
    }
    @ResponseBody
    @ApiOperation(value = "hotDynamic",notes = "热门动态")
    @PostMapping("/hotDynamic")
    @Override
    public ResponseData<List<DynamicAndSort>> hotDynamic(String sortId) {
        return dynamicService.hotDynamic(sortId);
    }
    @ResponseBody
    @ApiOperation(value = "likeKeyDynamic",notes = "输入关键字搜索")
    @PostMapping("/likeKeyDynamic")
    @Override
    public ResponseData<List<DynamicAndSort>> likeKeyDynamic(String keyWords) {
        return dynamicService.likeKeyDynamic(keyWords);
    }
    @ResponseBody
    @ApiOperation(value = "getAllDynamic",notes = "查询全部动态")
    @GetMapping("/getAllDynamic")
    @Override
    public ResponseData<List<Dynamic>> getAllDynamic() {
        return dynamicService.getAllDynamic();
    }

    @ResponseBody
    @ApiOperation(value = "getDynamicById",notes = "查询当前动态")
    @PostMapping("/getDynamicById")
    @Override
    public ResponseData<List<DynamicAndUser>> getDynamicById(String dId) {
        return dynamicService.getDynamicById(dId);
    }
}
