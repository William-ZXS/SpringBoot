package com.william.server.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.william.server.exception.CommonException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import sun.security.jgss.HttpCaller;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


@Component
public class RestTemplateUtils {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ContextUtil contextUtil;


    // ----------------------------------GET-------------------------------------------------------

    /**
     * GET请求调用方式 (带参数)
     *
     * @param url          请求URL
     * @param responseType 返回对象类型
     * @return List<T> 响应实体集合
     */
//    public <T> T getForOneWithParam(String url, Class<T> responseType, Object param) {
//
//        HttpHeaders requestHeaders = new HttpHeaders();
//        requestHeaders.add("Authorization", contextUtil.getToken());
//        HttpEntity<Object> requestEntity = new HttpEntity<>(param, requestHeaders);
//        ResponseEntity<String> forEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
//        JSONObject jsonResult = JSONObject.parseObject(forEntity.getBody());
//        if (!Objects.equal(jsonResult.getString("code"), RType.SUCCESS.getCode()))
//            throw new CommonException(jsonResult.getString("msg"));
//        String data = jsonResult.getString("data");
//        return JSONObject.parseObject(data, responseType);
//    }





}