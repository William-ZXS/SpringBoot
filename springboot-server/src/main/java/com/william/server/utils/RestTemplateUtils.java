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

    private String getToken() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();
        return request.getHeader("Authorization");
    }

    // ----------------------------------GET-------------------------------------------------------

//    /**
//     * GET请求调用方式 (带参数)
//     *
//     * @param url          请求URL
//     * @param responseType 返回对象类型
//     * @return List<T> 响应实体集合
//     */
//    public <T> T getForOneWithParam(String url, Class<T> responseType, Object param) {
//        HttpHeaders requestHeaders = new HttpHeaders();
//        requestHeaders.add("Authorization", getToken());
//        HttpEntity<Object> requestEntity = new HttpEntity<>(param, requestHeaders);
//        ResponseEntity<String> forEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
//        JSONObject jsonResult = JSONObject.parseObject(forEntity.getBody());
//        if (!Objects.equal(jsonResult.getString("code"), RType.SUCCESS.getCode()))
//            throw new CommonException(jsonResult.getString("msg"));
//        String data = jsonResult.getString("data");
//        return JSONObject.parseObject(data, responseType);
//    }
//
//    /**
//     * GET请求调用方式 (带参数)
//     *
//     * @param url          请求URL
//     * @param responseType 返回对象类型
//     * @return List<T> 响应实体集合
//     */
//    public <T> List<T> getForListWithParam(String url, Class<T> responseType, Object param) {
//        HttpHeaders requestHeaders = new HttpHeaders();
//        requestHeaders.add("Authorization", getToken());
//        HttpEntity<Object> requestEntity = new HttpEntity<>(param, requestHeaders);
//        ResponseEntity<String> forEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
//        JSONObject jsonResult = JSONObject.parseObject(forEntity.getBody());
//        if (!Objects.equal(jsonResult.getString("code"), RType.SUCCESS.getCode()))
//            throw new LotteryException(jsonResult.getString("msg"));
//        String data = jsonResult.getString("data");
//        return JSONObject.parseArray(data, responseType);
//    }
//
//    /**
//     * GET请求调用方式 (不带参数)
//     *
//     * @param url          请求URL
//     * @param responseType 返回对象类型
//     * @return List<T> 响应对象集合
//     */
//    public <T> T getForOneWithoutParam(String url, Class<T> responseType) {
//        HttpHeaders requestHeaders = new HttpHeaders();
//        requestHeaders.add("Authorization", getToken());
//        HttpEntity<Object> requestEntity = new HttpEntity<>(requestHeaders);
//        ResponseEntity<String> forEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
//        JSONObject jsonResult = JSONObject.parseObject(forEntity.getBody());
//        if (!Objects.equal(jsonResult.getString("code"), RType.SUCCESS.getCode()))
//            throw new LotteryException(jsonResult.getString("msg"));
//        String data = jsonResult.getString("data");
//        return JSONObject.parseObject(data, responseType);
//    }
//
//    /**
//     * GET请求调用方式 (不带参数)
//     *
//     * @param url          请求URL
//     * @param responseType 返回对象类型
//     * @return List<T> 响应对象集合
//     */
//    public <T> List<T> getForListWithoutParam(String url, Class<T> responseType) {
//        HttpHeaders requestHeaders = new HttpHeaders();
//        requestHeaders.add("Authorization", getToken());
//        HttpEntity<Object> requestEntity = new HttpEntity<>(requestHeaders);
//        ResponseEntity<String> forEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
//        JSONObject jsonResult = JSONObject.parseObject(forEntity.getBody());
//        if (!Objects.equal(jsonResult.getString("code"), RType.SUCCESS.getCode()))
//            throw new LotteryException(jsonResult.getString("msg"));
//        String data = jsonResult.getString("data");
//        return JSONObject.parseArray(data, responseType);
//    }
//
//    /**
//     * GET请求调用方式 (带参数)
//     *
//     * @param url          请求URL
//     * @param responseType 返回对象类型
//     * @return List<T> 响应实体集合
//     */
//    public <T> T getForOneWithParam2(String url, Class<T> responseType, String params) {
//        HttpHeaders requestHeaders = new HttpHeaders();
//        url = url + params;
//        requestHeaders.add("Authorization", getToken());
//        HttpEntity<Object> requestEntity = new HttpEntity<>(null, requestHeaders);
//        ResponseEntity<String> forEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
//        JSONObject jsonResult = JSONObject.parseObject(forEntity.getBody());
//        if (!Objects.equal(jsonResult.getString("code"), RType.SUCCESS.getCode()))
//            throw new LotteryException(jsonResult.getString("msg"));
//        String data = jsonResult.getString("data");
//        return JSONObject.parseObject(data, responseType);
//    }
//
//    /**
//     * GET请求调用方式 (带参数)
//     *
//     * @param url          请求URL
//     * @param responseType 返回对象类型
//     * @return List<T> 响应实体集合
//     */
//    public <T> List<T> getForListWithParam2(String url, Class<T> responseType, String params) {
//        HttpHeaders requestHeaders = new HttpHeaders();
//        url = url + params;
//        requestHeaders.add("Authorization", getToken());
//        HttpEntity<Object> requestEntity = new HttpEntity<>(null, requestHeaders);
//        ResponseEntity<String> forEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
//        JSONObject jsonResult = JSONObject.parseObject(forEntity.getBody());
//        if (!Objects.equal(jsonResult.getString("code"), RType.SUCCESS.getCode()))
//            throw new LotteryException(jsonResult.getString("msg"));
//        String data = jsonResult.getString("data");
//        return JSONObject.parseArray(data, responseType);
//    }
//
//    // ----------------------------------POST-------------------------------------------------------
//
//    /**
//     * POST请求调用方式
//     *
//     * @param url          请求URL
//     * @param requestBody  请求参数体
//     * @param responseType 返回对象类型
//     * @param uriVariables URL中的变量，按顺序依次对应
//     * @return ResponseEntity 响应对象封装类
//     */
//    public <T> T postForOneWithParam(String url, Class<T> responseType, Object param) {
//        HttpHeaders requestHeaders = new HttpHeaders();
//        requestHeaders.add("Authorization", getToken());
//        HttpEntity<Object> requestEntity = new HttpEntity<>(param, requestHeaders);
//        ResponseEntity<String> forEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
//        JSONObject jsonResult = JSONObject.parseObject(forEntity.getBody());
//        if (!Objects.equal(jsonResult.getString("code"), RType.SUCCESS.getCode()))
//            throw new LotteryException(jsonResult.getString("msg"));
//        return JSON.parseObject(jsonResult.getString("data"), responseType);
//    }
//
//    /**
//     * POST请求调用方式
//     *
//     * @param url          请求URL
//     * @param requestBody  请求参数体
//     * @param responseType 返回对象类型
//     * @param uriVariables URL中的变量，按顺序依次对应
//     * @return ResponseEntity 响应对象封装类
//     */
//    public <T> PageUtils<T> postForListWithParam(String url, Class<T> responseType, Object param) {
//        HttpHeaders requestHeaders = new HttpHeaders();
//        requestHeaders.add("Authorization", getToken());
//        HttpEntity<Object> requestEntity = new HttpEntity<>(param, requestHeaders);
//        ResponseEntity<String> forEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
//        JSONObject jsonResult = JSONObject.parseObject(forEntity.getBody());
//        if (!Objects.equal(jsonResult.getString("code"), RType.SUCCESS.getCode()))
//            throw new LotteryException(jsonResult.getString("msg"));
//        PageUtils<T> pageUtils = new PageUtils<>();
//        pageUtils.setTotal(jsonResult.getIntValue("total"));
//        pageUtils.setRows(JSON.parseArray(jsonResult.getString("rows"), responseType));
//        return pageUtils;
//    }
//
//    /**
//     * POST请求调用方式
//     *
//     * @param url
//     * @param responseType
//     * @param param
//     * @param <T>
//     * @return lsit
//     */
//    public <T> List<T> postForListBeanWithParam(String url, Class<T> responseType, Object param) {
//        HttpHeaders requestHeaders = new HttpHeaders();
//        requestHeaders.add("Authorization", getToken());
//        HttpEntity<Object> requestEntity = new HttpEntity<>(param, requestHeaders);
//        ResponseEntity<String> forEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
//        JSONObject jsonResult = JSONObject.parseObject(forEntity.getBody());
//        if (!Objects.equal(jsonResult.getString("code"), RType.SUCCESS.getCode()))
//            throw new LotteryException(jsonResult.getString("msg"));
//        String data = jsonResult.getString("data");
//        return JSONObject.parseArray(data, responseType);
//
//    }
//
//    public OrderRespDO createOrder(String url, LinkedMultiValueMap<String, String> param) {
//        HttpHeaders requestHeaders = new HttpHeaders();
//        requestHeaders.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
//        HttpEntity<Object> requestEntity = new HttpEntity<>(param, requestHeaders);
//        ResponseEntity<String> forEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
//        return XMLUtils.getOrderResult(forEntity.getBody());
//    }
//
//    @SuppressWarnings("deprecation")
//    public SortingCodeRespDO sortingCode(LogisticsSortingCodeConfig config, Map<String, String> params) {
//        try {
//            String result = HttpCaller.doPost(config.getUrl(), config.getApiName(), config.getVersion(), params,
//                    config.getAk(), config.getSk());
//            return JSONObject.parseObject(JSONObject.parseObject(result).getString("body"), SortingCodeRespDO.class);
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new LotteryException("获取四级分拣码失败!");
//        }
//    }
//
//    public LogisticsTraceRespDO getLogistics(String url) {
//        ResponseEntity<String> postForEntity = restTemplate.postForEntity(url, null, String.class);
//        if (!postForEntity.getStatusCode().is2xxSuccessful())
//            throw new LotteryException("请求失败,请稍后重试！");
//        LogisticsTraceRespDO data = JSONObject.parseObject(postForEntity.getBody(), LogisticsTraceRespDO.class);
//        return data;
//    }
//
//    public RestTemplate getTemplate() {
//        return restTemplate;
//    }

}