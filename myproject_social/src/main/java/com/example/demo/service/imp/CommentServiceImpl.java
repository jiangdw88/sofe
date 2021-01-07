package com.example.demo.service.imp;

import com.example.demo.bean.Comment;
import com.example.demo.bean.CommentAndLike;
import com.example.demo.bean.CommentAndUser;
import com.example.demo.mapper.CommentMapper;
import com.example.demo.service.CommentService;
import com.util.EnumCode;
import com.util.ResponseData;
import com.util.UUIDAndTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Response;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;

    @Override
    public ResponseData<Integer> Comment(Comment comment) {
        comment.setCommentTime(UUIDAndTime.getTime());
        comment.setCommentId(UUIDAndTime.getUUID());
        int code = commentMapper.Comment(comment);
        if (code >= 1) {
            System.out.println("发布成功" + comment);
            return ResponseData.success(code);
        } else {
            System.out.println(EnumCode.ERROR_RELEASE.getMessage());
            return ResponseData.error(EnumCode.ERROR_RELEASE);
        }
    }

    //查看评论内容和评论动态
    @Override
    public ResponseData<List> myCommentAndDynamic(String userId) {
        List list = commentMapper.myCommentAndDynamic(userId);
        if (list.size() != 0) {
            System.out.println("查询成功" + list);
            return ResponseData.success(list);
        } else {
            System.out.println(EnumCode.FAIL_SEARCH.getMessage());
            return ResponseData.error(EnumCode.FAIL_SEARCH);
        }
    }

    //删除评论动态
    @Override
    public ResponseData<Integer> deleteComment(String commentId) {
        int code = commentMapper.deleteComment(commentId);
        if (code >= 1) {
            System.out.println("删除成功");
            return ResponseData.success(code);
        } else {
            System.out.println(EnumCode.ERROR_COMMENT.getMessage());
            return ResponseData.error(EnumCode.ERROR_COMMENT);
        }


    }

    @Override
    public ResponseData<List<CommentAndLike>> getCommentAndLike(String dId) {
        List<CommentAndLike> commentAndLikeList = commentMapper.getCommentAndLike(dId);
        if (commentAndLikeList.size() >= 0) {
            System.out.println(commentAndLikeList);
            return ResponseData.success(commentAndLikeList);
        } else {
            System.out.println(EnumCode.FAIL_SEARCH.getMessage());
            return ResponseData.error(EnumCode.FAIL_SEARCH);
        }
    }

    @Override
    public ResponseData<List<CommentAndUser>> getCommentUserMessage(String dId) {
        List<CommentAndUser> commentUserMessage = commentMapper.getCommentUserMessage(dId);
        if (commentUserMessage.size() > 0){
            System.out.println(commentUserMessage);
            return ResponseData.success(commentUserMessage);
        }else {
            System.out.println(EnumCode.FAIL_SEARCH.getMessage());
            return ResponseData.error(EnumCode.FAIL_SEARCH);
        }
    }

}
