package com.example.demo.mapper;

import com.example.demo.bean.Attention;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AttentionMapper {
    /**
     * 关注表
     * 存入 关注人id 被关注人id 关注时间 状态
     * @param attention
     * @return
     */
    int attention(Attention attention);
}
