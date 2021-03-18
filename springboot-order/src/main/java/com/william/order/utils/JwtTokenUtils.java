package com.william.order.utils;


import com.william.order.entity.model.JwtData;
import com.william.order.exception.CommonException;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;


@Component
public class JwtTokenUtils {
    /* 从yaml获取公钥 */

    private static String publicStr;

    private static SecretKey publicKey;

    @Value("${token.publicKey}")
    public void setPublicStr(String publicStr) {
        JwtTokenUtils.publicStr = publicStr;
    }

    /* 静态构造方法初始公钥信息 */
    private static void init() {
        if (publicKey != null) {
            return;
        }
        try {
            publicKey = new SecretKeySpec(publicStr.getBytes("UTF-8"), "HS256");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


    /**
     * 验证token
     *
     * @param token 传入token信息
     * @return 返回用户对象信息
     */
    public static Claims getTokenBody(String token) {
        init();
        Claims claims;
        try {
            claims = Jwts.parser().setSigningKey(publicKey).parseClaimsJws(token).getBody();
        } catch (Exception e) {
            throw new CommonException("非法Token!");
        }
        return claims;
    }


    public static JwtData getJwtData(String token){
        Claims claims =  getTokenBody(token);
        return new JwtData().setUserNo(String.valueOf(claims.get("userNo")));
    }
}
