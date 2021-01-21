package com.example.demo.service;

import com.example.demo.bean.Dynamic;
import com.example.demo.bean.DynamicAndSort;
import com.example.demo.bean.DynamicAndUser;
import com.util.ResponseData;

import java.util.List;

public interface DynamicService {
    //    发布动态信息
    ResponseData<Integer> releaseNews(Dynamic dynamic);

    //    查询个人动态
    ResponseData<List<DynamicAndSort>> myDynamic(String id);

    //    删除本人动态
    ResponseData<Integer> deleteDynamic(String id);

    //    按照分类查询10分钟内的最新动态
    ResponseData<List<DynamicAndSort>> newDynamic(String sortId, int minute);

    //按照分类id查询动态并从大到小输出
    ResponseData<List<DynamicAndSort>> hotDynamic(String sortId);

    //    按照分类模糊查询（标题）动态
    ResponseData<List<DynamicAndSort>> likeKeyDynamic(String keyWords);
    //    获取全部动态
    ResponseData<List<Dynamic>> getAllDynamic() ;
    //根据动态id获取当前动态信息
    ResponseData<List<DynamicAndUser>> getDynamicById(String dId);
}
