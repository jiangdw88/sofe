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
}
