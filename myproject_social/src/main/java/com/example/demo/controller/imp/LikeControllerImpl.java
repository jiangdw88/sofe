package com.example.demo.controller.imp;

import com.example.demo.bean.Like;
import com.example.demo.controller.LikeController;
import com.example.demo.service.imp.LikeServiceImpl;
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
@RequestMapping("/like")
@Api(value = "Like")
public class LikeControllerImpl implements LikeController {
//    引入service对象
    @Autowired
    LikeServiceImpl likeService;
//我点赞的动态
    @ResponseBody
    @ApiOperation(value = "myLikeDynamic",notes = "我点赞的动态")
    @PostMapping("/myLikeDynamic")
    @Override
    public List myLikeDynamic(String userId) {
        List likes = likeService.myLikeDynamic(userId);
        return likes;
    }
//我的动态被点赞的数量
    @ResponseBody
    @ApiOperation(value = ("myCountByLike"),notes = "我的动态被点赞数量")
    @PostMapping("/myCountByLike")
    @Override
    public int myCountByLike(String likePersonId) {
        return likeService.myCountByLike(likePersonId);
    }
//    我点赞动态的数量
    @ResponseBody
    @ApiOperation(value = ("myCountLike"),notes = "我的点赞数量")
    @PostMapping("/myCountLike")
    @Override
    public int myCountLike(String userId) {
        return likeService.myCountLike(userId);
    }
//    向点赞表内存储数据
    @ResponseBody
    @ApiOperation(value = ("Like"),notes = "点赞表数据存储")
    @PostMapping("/Like")
    @Override
    public ResponseData<Integer> Like(Like like) {
        return likeService.Like(like);
    }
    //    取消点赞
    @ResponseBody
    @ApiOperation(value = ("deleteLike"),notes = "取消点赞")
    @PostMapping("/deleteLike")
    @Override
    public ResponseData<Integer> deleteLike(String likeId, String userId) {
        return likeService.deleteLike(likeId, userId);
    }


}
