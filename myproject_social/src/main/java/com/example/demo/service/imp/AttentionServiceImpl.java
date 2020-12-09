package com.example.demo.service.imp;

import com.example.demo.bean.Attention;
import com.example.demo.mapper.AttentionMapper;
import com.example.demo.service.AttentionService;
import com.util.EnumCode;
import com.util.ResponseData;
import com.util.UUIDAndTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttentionServiceImpl implements AttentionService {
    @Autowired
    private AttentionMapper attentionMapper;
//    关注列表
    @Override
    public ResponseData<Integer> attention(Attention attention) {
        attention.setAttentionId(UUIDAndTime.getUUID());
        attention.setAttentionTime(UUIDAndTime.getTime());
        System.out.println(attention);
        int code = attentionMapper.attention(attention);
        System.out.println(attention);
        if (code >= 1){
            System.out.println("关注成功");
            return ResponseData.success(code);
        }else {
            System.out.println(EnumCode.SYSTEM_ERROR.getMessage());
            return ResponseData.error(EnumCode.SYSTEM_ERROR);
        }
    }
//我的关注
    @Override
    public ResponseData<Integer> myAttention(String userId) {
        int myAttentionCount = attentionMapper.myAttention(userId);
        if (myAttentionCount >= 0){
            System.out.println(myAttentionCount);
            return ResponseData.success(myAttentionCount);
        }else {
            System.out.println(EnumCode.FAIL_SEARCH.getMessage());
            return ResponseData.error(EnumCode.FAIL_SEARCH);
        }
    }
//我的粉丝数
    @Override
    public ResponseData<Integer> beAttention(String uId) {
        int beAttentionCount = attentionMapper.beAttention(uId);
        if (beAttentionCount >= 0){
            System.out.println(beAttentionCount);
            return ResponseData.success(beAttentionCount);
        }else {
            System.out.println(EnumCode.FAIL_SEARCH.getMessage());
            return ResponseData.error(EnumCode.FAIL_SEARCH);
        }
    }
//我关注的人列表
    @Override
    public ResponseData<List> myAttentionList(String userId) {
        List myAttentionList = attentionMapper.myAttentionList(userId);
        if (myAttentionList.size() != 0){
            System.out.println(myAttentionList);
            return ResponseData.success(myAttentionList);
        }else {
            System.out.println(EnumCode.FAIL_SEARCH.getMessage());
            return ResponseData.error(EnumCode.FAIL_SEARCH);
        }
    }
}
