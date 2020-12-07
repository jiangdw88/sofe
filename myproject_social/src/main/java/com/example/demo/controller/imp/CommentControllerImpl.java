package com.example.demo.controller.imp;

import com.example.demo.bean.Comment;
import com.example.demo.controller.CommentController;
import com.example.demo.service.imp.CommentServiceImpl;
import com.util.ResponseData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.List;

@RestController
@RequestMapping("/comment")
@Api(value = "Comment")
public class CommentControllerImpl implements CommentController {
    @Autowired
    private CommentServiceImpl commentService;

    //发布评论内容;
    @ResponseBody
    @ApiOperation(value = "Comment", notes = "发布评论")
    @PostMapping("/Comment")
    @Override
    public ResponseData<Integer> Comment(Comment comment) {
        return commentService.Comment(comment);
    }
//根据用户id查询评论内容和评论动态
    @ResponseBody
    @ApiOperation(value = "myCommentAndDynamic", notes = "我的评论和我评论动态")
    @PostMapping("/myCommentAndDynamic")
    @Override
    public List myCommentAndDynamic(String userId) {
        return commentService.myCommentAndDynamic(userId);
    }
//删除评论
    @ResponseBody
    @ApiOperation(value = "deleteComment", notes = "删除评论")
    @PostMapping("/deleteComment")
    @Override
    public ResponseData<Integer> deleteComment(String commentId) {
        return commentService.deleteComment(commentId);
    }
}
