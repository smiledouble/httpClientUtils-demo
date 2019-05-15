package com.cxs.test;

import com.cxs.config.HttpClientUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:chenxiaoshuang
 * @Date:2019/5/15 10:06
 */
public class TestHttpClient {
    public static void main(String[] args) {
//        String s = HttpClientUtils.doGet("https://www.baidu.com/");
//        System.out.println(s);
        Map<String, String> param = new HashMap<>(2);
        param.put("tid", "4bfdde8f-38c4-4e50-9b4a-50d979580918");
        param.put("teamId", "4bfdde8f-38c4-4e50-9b4a-50d979580918");
        String s1 = HttpClientUtils.doGet("https://lanhuapp.com/web/#/item", param);
        System.out.println(s1);

    }
}
