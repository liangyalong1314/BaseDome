package com.lyl.common.eventbus;

import org.greenrobot.eventbus.EventBus;

/**
 * @author admin
 * 描述:     java类作用描述
 * 作者:     梁亚龙
 * 时间:     2019/12/31
 * 版本:     1.0
 */
public class EventBusUtil {

    public static void register(Object subscriber) {
        EventBus.getDefault().register(subscriber);
    }

    public static void unregister(Object subscriber) {
        EventBus.getDefault().unregister(subscriber);
    }

    public static void sendEvent(Event event) {
        EventBus.getDefault().post(event);
    }

    public static void sendStickyEvent(Event event) {
        EventBus.getDefault().postSticky(event);
    }

    // 其他
}