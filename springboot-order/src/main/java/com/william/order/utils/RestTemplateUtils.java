package com.william.order.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


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