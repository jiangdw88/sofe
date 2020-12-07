package com.example.demo.service.imp;

import com.example.demo.bean.Attention;
import com.example.demo.mapper.AttentionMapper;
import com.example.demo.service.AttentionService;
import com.util.EnumCode;
import com.util.ResponseData;
import com.util.UUIDAndTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
