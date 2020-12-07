package com.example.demo.service;

import com.example.demo.bean.Attention;
import com.util.ResponseData;

public interface AttentionService {
    /**
     * 关注表
     * 存入 关注人id 被关注人id 关注时间 状态
     * @param attention
     * @return
     */
    ResponseData<Integer> attention(Attention attention);
}
