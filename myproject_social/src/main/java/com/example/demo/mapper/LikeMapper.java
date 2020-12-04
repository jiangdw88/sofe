package com.example.demo.mapper;

import com.example.demo.bean.Like;
import org.apache.ibatis.annotations.Mapper;

import javax.xml.ws.Response;
import java.util.List;

@Mapper
public interface LikeMapper {
    /**
     * 根据被点赞动态id查询动态表中本人的用户id所点赞的动态
     * @param userId 用户id
     * @return
     */
    List myLikeDynamic(String userId);

    /**
     * 查询我的动态有多少条赞
     * @param likePersonId
     * @return
     */
    int myCountByLike(String likePersonId);

    /**
     * 查询点赞表中本人id的数量,传入本人id(我点赞了多少条)
     * @param userId
     * @return
     */
    int myCountLike(String userId);

    /**
     * 点赞 对点赞表id 被点赞人id 点赞用户id 点赞时间 点赞状态进行设置
     * @param like like对象
     * @return
     */
     int Like(Like like);

    /**
     * 删除点赞动态
     * @param likeId 点赞id
     * @param userId 点赞用户id
     * @return
     */
     int deleteLike(String likeId,String userId);


}
