package com.example.demo.mapper;

import com.example.demo.bean.Comment;
import com.example.demo.bean.CommentAndLike;
import com.example.demo.bean.CommentAndUser;
import org.apache.ibatis.annotations.Mapper;

import javax.xml.ws.Response;
import java.util.List;
@Mapper
public interface CommentMapper {
    /**
     * 发布评论
     * 评论id，被评论动态id，被评论人id，本人id，评论内容，评论时间
     * @param comment comment对象
     * @return
     */
    int Comment(Comment comment);

    /**查询本人评论的动态以及评论的内容
     * 通过传入的动态表id
     * @param userId
     * @return
     */
    List myCommentAndDynamic(String userId);

    /**
     * 通过本人用户id删除评论
     * @param commentId
     * @return
     */
    int deleteComment(String commentId);

    /**
     * 动态查询根据动态id查询 评论和点赞数
     * @param dId 动态id
     * @return
     */
    List<CommentAndLike> getCommentAndLike(String dId);
//    根据评论表信息获取用户信息
    List<CommentAndUser> getCommentUserMessage(String dId);
}
