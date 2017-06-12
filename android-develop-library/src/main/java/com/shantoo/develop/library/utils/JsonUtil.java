package com.shantoo.develop.library.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.List;
import java.util.Map;

/**
 * 作者: shantoo on 2017/4/22 14:39.
 */

public class JsonUtil {

    /**
     * 将json转化成map
     *
     * @param jsonStr
     * @return map
     */
    public static Map<String, String> parseJSON2Map(String jsonStr) {
        Map<String, String> map = JSON.parseObject(
                jsonStr, new TypeReference<Map<String, String>>() {});
        return map;
    }

    /**
     * 将json转化成list
     *
     * @param jsonStr
     * @return list
     */
    public static List<Map<String, Object>> parseJSON2List(String jsonStr) {
        List<Map<String, Object>> list = JSON.parseObject(
                jsonStr, new TypeReference<List<Map<String, Object>>>() {});
        return list;
    }
}
