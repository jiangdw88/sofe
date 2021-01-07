package com.example.demo.controller;

import com.example.demo.bean.Comment;
import com.example.demo.bean.CommentAndLike;
import com.example.demo.bean.CommentAndUser;
import com.util.ResponseData;

import javax.xml.ws.Response;
import java.util.List;

public interface CommentController {
    //    评论id，被评论动态id，被评论人id，本人id，评论内容，评论时间
    ResponseData<Integer> Comment(Comment comment);
    //    查看本人评论和评论动态
    ResponseData<List> myCommentAndDynamic(String userId);
    //    通过本人用户id删除本人评论
    ResponseData<Integer> deleteComment(String commentId);
    //   通过动态id 获取评论和点赞数
    ResponseData<List<CommentAndLike>> getCommentAndLike(String dId);
    //    根据评论表信息获取用户信息
    ResponseData<List<CommentAndUser>> getCommentUserMessage(String dId);
}
