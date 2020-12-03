package com.example.demo.mapper;

import com.example.demo.bean.Dynamic;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DynamicMapper {
//    发布动态
    int releaseNews(Dynamic dynamic);
//    查询本人发布的动态
    List<Dynamic> myDynamic(String id);
//    删除本人动态假删除
    int deleteDynamic(String id);
}
