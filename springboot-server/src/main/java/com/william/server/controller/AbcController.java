package com.william.server.controller;

import com.william.server.entity.response.ApiResp;
import com.william.server.utils.RedisUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "测试")
@Slf4j
@RestController
@RequestMapping("/test")
public class AbcController {

    @Autowired
    RedisUtils redisUtils;


    @ApiOperation(value = "测试读取")
    @PostMapping("/test/read")
    public ApiResp<Object> william() {


        try {
            String data = redisUtils.get("william");
            System.out.print("====data==:"+data);
            Thread.sleep(100);
        }catch (Exception e){
            log.error(e.getMessage());
        }


        return ApiResp.ok("ok");
    }
}
