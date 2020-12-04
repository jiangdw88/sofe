package com.example.demo.service.imp;

import com.example.demo.bean.Like;
import com.example.demo.mapper.LikeMapper;
import com.example.demo.service.LikeService;
import com.util.EnumCode;
import com.util.ResponseData;
import com.util.UUIDAndTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.Response;
import java.util.List;
@Service
public class LikeServiceImpl implements LikeService {
//    引入mapper对象
    @Autowired
    LikeMapper likeMapper;
    @Override
//    查询本人的点赞动态
    public List myLikeDynamic(String userId) {
        List likes = likeMapper.myLikeDynamic(userId);
        System.out.println(likes);
        return likes;
    }
//查询我的动态有多少条赞
    @Override
    public int myCountByLike(String likePersonId) {
        int count = likeMapper.myCountByLike(likePersonId);
        System.out.println(count);
        return count;
    }
//查询我点了多少条赞
    @Override
    public int myCountLike(String userId) {
        int count = likeMapper.myCountLike(userId);
        System.out.println(count);
        return count;
    }
    //点赞表数据
    @Override
    public ResponseData<Integer> Like(Like like) {
        //        设置点赞表id
        like.setLikeId(UUIDAndTime.getUUID());
//        设置点赞时间
        like.setLikeTime(UUIDAndTime.getTime());
        int code = likeMapper.Like(like);
        if (code >= 1){
//            点赞成功
            return ResponseData.success(code);
        }else {
            return ResponseData.error(EnumCode.SYSTEM_ERROR);
        }
    }
//取消点赞动态
    @Override
    public ResponseData<Integer> deleteLike(String likeId, String userId) {
        int code = likeMapper.deleteLike(likeId, userId);
        if (code >= 1){
            System.out.println("成功取消");
            return ResponseData.success(code);
        }else {
            System.out.println(EnumCode.SYSTEM_ERROR.getMessage());
            return ResponseData.error(EnumCode.SYSTEM_ERROR);
        }


    }


}
