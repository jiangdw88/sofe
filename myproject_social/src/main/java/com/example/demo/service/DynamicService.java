package com.example.demo.service;

import com.example.demo.bean.Dynamic;
import com.util.ResponseData;

import java.util.List;

public interface DynamicService {
//    发布动态信息
    ResponseData<Integer> releaseNews(Dynamic dynamic);
//    查询个人动态
    List<Dynamic> myDynamic(String id);
//    删除本人动态
    ResponseData<Integer> deleteDynamic(String id);
}
