package com.lyl.common.utils;
/**
 * @author admin
 * 描述:     String 工具类
 * 作者:     梁亚龙
 * 时间:     2019/12/28
 * 版本:     1.0
 */
public class StringUtils {
    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }
}
