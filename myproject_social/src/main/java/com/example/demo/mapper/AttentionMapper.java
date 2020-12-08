package com.example.demo.mapper;

import com.example.demo.bean.Attention;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AttentionMapper {
    /**
     * 关注表
     * 存入 关注人id 被关注人id 关注时间 状态
     * @param attention
     * @return
     */
    int attention(Attention attention);
    /**
     * 我关注的人数量
     * @param userId 我的用户id
     * @return
     */
    int myAttention(String userId);

    /**
     * 我被关注的数量
     * @param uId 传入我的用户id跟关注表中我的被关注数量比对
     * @return
     */
    int beAttention(String uId);

    /**
     * 我关注的人
     * @param userId
     * @return
     */
    List myAttentionList(String userId);
}
