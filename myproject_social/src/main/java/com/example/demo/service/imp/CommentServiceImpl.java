package com.example.demo.service.imp;

import com.example.demo.bean.Comment;
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
//查款评论内容和评论动态
    @Override
    public List myCommentAndDynamic(String userId) {
        List list = commentMapper.myCommentAndDynamic(userId);
        System.out.println(list);
        return list;
    }
//删除评论动态
    @Override
    public ResponseData<Integer> deleteComment(String commentId) {
        int code = commentMapper.deleteComment(commentId);
        if (code >= 1){
            System.out.println("删除成功");
            return ResponseData.success(code);
        }else{
            System.out.println(EnumCode.ERROR_COMMENT.getMessage());
            return ResponseData.error(EnumCode.ERROR_COMMENT);
        }


    }

}
