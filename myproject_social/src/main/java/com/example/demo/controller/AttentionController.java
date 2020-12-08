package com.example.demo.controller;

import com.example.demo.bean.Attention;
import com.util.ResponseData;

import java.util.List;

public interface AttentionController {
    //    关注功能
    ResponseData<Integer> attention(Attention attention);

    //    我关注的人数量(关注数量)
    int myAttention(String userId);

    //我被关注的数量(我的粉丝数)
    int beAttention(String uId);

    //我关注的用户(返回用户列表)
    List myAttentionList(String userId);
}
