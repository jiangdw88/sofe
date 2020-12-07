package com.example.demo.controller;

import com.example.demo.bean.Attention;
import com.util.ResponseData;

public interface AttentionController {
    ResponseData<Integer> attention(Attention attention);
}
