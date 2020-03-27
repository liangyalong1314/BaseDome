package com.lyl.common.utils;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;
import java.util.Map;

/**
 * @author admin
 * 描述:     Gson 转换类
 * 作者:     梁亚龙
 * 时间:     2019/12/28
 * 版本:     1.0
 */
public class GsonUtils {

    /**
     * 把对象转换为Json数据
     * @param obj 对象
     * @return
     */
    public static String toJson(Object obj) {
        return new Gson().toJson(obj);
    }

    /**
     * 把JSON数据转换为对象
     * @param str  JSON数据
     * @param type  对象
     * @param <T>
     * @return 对象
     */
    public static <T> T fromJson(String str, Class<T> type) {
        return new Gson().fromJson(str, type);
    }
    /**
     * 把JSON数据转换为list
     * @param str  JSON数据
     * @param <T>
     * @return 对象
     */
    public static <T> List<T> fromJsonList(String str, Class<T> type) {

        return new Gson().fromJson(str, new TypeToken<List>() {}.getType());
    }

    /**
     * JSON字符串转Map
     * @param JSONString
     * @return
     */
    public static Map fromJsonMap(String JSONString) {
        if (StringUtils.isEmpty(JSONString)) {
            return null;
        }
        Map t = null;
        try {
            Gson gson = new Gson();
            t = gson.fromJson(JSONString, Map.class);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return t;
    }

}
