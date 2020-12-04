package com.example.demo.service;

import com.example.demo.bean.Like;
import com.util.ResponseData;

import javax.xml.ws.Response;
import java.util.List;

public interface LikeService {
//    查询本人点赞的动态
 List  myLikeDynamic(String userId);
//    我的id在点赞表中的数量 被点赞人的id在点赞表中的数量
int myCountByLike(String likePersonId);
// 我点赞的数量
int myCountLike(String userId);
//点赞表
ResponseData<Integer> Like(Like like);
//取消点赞动态
 ResponseData<Integer> deleteLike(String likeId,String userId);
}
