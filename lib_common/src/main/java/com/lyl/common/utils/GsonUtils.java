package com.lyl.common.utils;

import com.google.gson.Gson;

/**
 * Gson 转换类
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
}
