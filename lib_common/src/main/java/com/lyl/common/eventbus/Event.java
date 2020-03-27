package com.lyl.common.eventbus;

/**
 * @author admin
 * 描述:     java类作用描述
 * 作者:     梁亚龙
 * 时间:     2019/12/31
 * 版本:     1.0
 */
public class Event<T> {
    private int code;
    private T data;

    public Event(int code) {
        this.code = code;
    }

    public Event(int code, T data) {
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}