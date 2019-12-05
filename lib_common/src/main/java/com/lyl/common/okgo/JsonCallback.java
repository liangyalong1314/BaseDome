package com.lyl.common.okgo;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.lzy.okgo.callback.AbsCallback;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import okhttp3.Response;
import okhttp3.ResponseBody;


public abstract class JsonCallback<T> extends AbsCallback<T> {

    @Override
    public T convertResponse(Response response) throws Throwable {
        ResponseBody body = response.body();
        if (body==null){
            return null;
        }
        T data=null;
        JsonReader jsonReader = new JsonReader(body.charStream());
        Type genericSuperclass = getClass().getGenericSuperclass();
        Type genericSuperclass1=((ParameterizedType)genericSuperclass).getActualTypeArguments()[0];
        data=new Gson().fromJson(jsonReader,genericSuperclass1);
        return data ;
    }
}

