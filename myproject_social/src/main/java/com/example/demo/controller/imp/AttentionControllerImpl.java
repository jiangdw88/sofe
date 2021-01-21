package com.example.demo.controller.imp;

import com.example.demo.bean.Attention;
import com.example.demo.controller.AttentionController;
import com.example.demo.service.imp.AttentionServiceImpl;
import com.util.ResponseData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/attention")
@Api(value = "Attention")
public class AttentionControllerImpl implements AttentionController {
    @Autowired
    private AttentionServiceImpl attentionService;


    @ResponseBody
    @ApiOperation(value = "attention",notes = "关注用户")
    @PostMapping("/attention")
    @Override
    public ResponseData<Integer> attention(Attention attention) {
        System.out.println(attention);
        return attentionService.attention(attention);
    }
    @ResponseBody
    @ApiOperation(value = "myAttention",notes = "我关注的人数量")
    @PostMapping("/myAttention")
    @Override
    public ResponseData<Integer> myAttention(String userId) {
        return attentionService.myAttention(userId);
    }
    @ResponseBody
    @ApiOperation(value = "beAttention",notes = "我被关注的数量(粉丝)")
    @PostMapping("/beAttention")
    @Override
    public ResponseData<Integer> beAttention(String uId) {
        return attentionService.beAttention(uId);
    }
    @ResponseBody
    @ApiOperation(value = "myAttentionList",notes = "我关注的人列表")
    @PostMapping("/myAttentionList")
    @Override
    public ResponseData<List> myAttentionList(String userId) {
        return attentionService.myAttentionList(userId);
    }
}
