package com.example.demo.service;

import com.example.demo.bean.Comment;
import com.util.ResponseData;

import javax.xml.ws.Response;
import java.util.List;

public interface CommentService {
//    发布评论
//    评论id，被评论动态id，被评论人id，本人id，评论内容，评论时间
    ResponseData<Integer> Comment(Comment comment);
//   查询本人评论的动态以及评论的内容
    List myCommentAndDynamic(String userId);
//    通过本人用户id和评论id删除本人评论
    ResponseData<Integer> deleteComment(String commentId);
}
