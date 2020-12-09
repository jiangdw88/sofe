package com.example.demo.service.imp;

import com.example.demo.bean.Dynamic;
import com.example.demo.bean.DynamicAndSort;
import com.example.demo.bean.User;
import com.example.demo.mapper.DynamicMapper;
import com.example.demo.service.DynamicService;
import com.util.EnumCode;
import com.util.ResponseData;
import com.util.UUIDAndTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DynamicServiceImpl implements DynamicService {
    @Autowired
    private DynamicMapper dynamicMapper;
//    发布动态信息

    /**
     * 发布动态
     * @param dynamic
     * @return
     */
    @Override
    public ResponseData<Integer> releaseNews(Dynamic dynamic) {
//        设置id
        dynamic.setdId(UUIDAndTime.getUUID());
//      设置更改时间
        dynamic.setReleaseTime(UUIDAndTime.getTime());
//        设置状态
        dynamic.setStatus(0);

    //        发布动态
        int code = dynamicMapper.releaseNews(dynamic);
        if (code >= 1){
            System.out.println("发布成功");
            return ResponseData.success(code);
        }else {
            System.out.println(EnumCode.ERROR_RELEASE.getMessage());
            return ResponseData.error(EnumCode.ERROR_RELEASE);
        }

    }
// 查询我的动态

    /**
     * 根据账号的id查询到 动态表的信息
     * @param id
     * @return
     */
    @Override
    public ResponseData<List<Dynamic>> myDynamic(String id) {
        List<Dynamic> dynamics = dynamicMapper.myDynamic(id);
        if (dynamics.size() != 0){
            System.out.println("查询成功" + dynamics);
            return ResponseData.success(dynamics);
        }else {
            System.out.println(EnumCode.FAIL_SEARCH.getMessage());
            return ResponseData.error(EnumCode.FAIL_SEARCH);
        }

    }
//删除动态
    @Override
    public ResponseData<Integer> deleteDynamic(String id) {
        int code = dynamicMapper.deleteDynamic(id);
        if (code >= 1){
            System.out.println("删除成功");
            return ResponseData.success(code);
        }else {
            System.out.println("删除失败");
            return ResponseData.error(EnumCode.DELETE_FAIL);
        }

    }
// 查询十分钟之内的动态
    @Override
    public ResponseData<List<DynamicAndSort>> newDynamic(String sortId, int minute) {
        List<DynamicAndSort> dynamicAndSorts = dynamicMapper.newDynamic(sortId, minute);
        if (dynamicAndSorts.size() != 0){
            System.out.println(dynamicAndSorts);
            return ResponseData.success(dynamicAndSorts);
        }else {
            System.out.println(EnumCode.SYSTEM_ERROR.getMessage());
            return ResponseData.error(EnumCode.SYSTEM_ERROR);
        }
    }
//
    @Override
    public ResponseData<List<DynamicAndSort>> hotDynamic(String sortId) {
        List<DynamicAndSort> hotDynamicList = dynamicMapper.hotDynamic(sortId);
        if (hotDynamicList.size() != 0){
            System.out.println(hotDynamicList);
           return ResponseData.success(hotDynamicList);
        }else {
            System.out.println(EnumCode.FAIL_SEARCH.getMessage());
            return ResponseData.error(EnumCode.FAIL_SEARCH);
        }
    }

    @Override
    public ResponseData<List<DynamicAndSort>> likeKeyDynamic(String keyWords) {
        List<DynamicAndSort> likeKeyDynamicList = dynamicMapper.likeKeyDynamic(keyWords);
        if (likeKeyDynamicList.size() != 0){
            System.out.println(likeKeyDynamicList);
            return ResponseData.success(likeKeyDynamicList);
        }else {
            System.out.println(EnumCode.FAIL_SEARCH_KEYWORDS.getMessage());
            return ResponseData.error(EnumCode.FAIL_SEARCH_KEYWORDS);
        }

    }
}
