package com.example.demo.controller;

import com.example.demo.bean.Like;
import com.util.ResponseData;

import javax.xml.ws.Response;
import java.util.List;

public interface LikeController {
    //    查询我的点赞动态
    ResponseData<List> myLikeDynamic(String userId);
    //    查询点赞表中本人id的数量
    ResponseData<Integer> myCountByLike(String likePersonId);
    //    我点了多少条赞
    ResponseData<Integer> myCountLike(String userId);
    //点赞表
    ResponseData<Integer> Like(Like like);
//    取消点赞
ResponseData<Integer> deleteLike(String likeId,String userId);

}
