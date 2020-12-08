package com.example.demo.service;

import com.example.demo.bean.Attention;
import com.example.demo.bean.User;
import com.util.ResponseData;

import java.util.List;

public interface AttentionService {
    /**
     * 关注表
     * 存入 关注人id 被关注人id 关注时间 状态
     *
     * @param attention
     * @return
     */
    ResponseData<Integer> attention(Attention attention);

    //    我关注的人数量(关注数量)
    int myAttention(String userId);

    //我被关注的数量(我的粉丝数)
    int beAttention(String uId);

    //我关注的用户(返回用户列表)
    List myAttentionList(String userId);
}
