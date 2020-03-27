package com.lyl.common.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
/**
 * @author admin
 * 描述:     安装工具类
 * 作者:     梁亚龙
 * 时间:     2019/12/28
 * 版本:     1.0
 */
public class InstallUtils {
    /**
     * 静默安装
     * @param apkPath  安装路径
     * @param context
     */
    public static void installApk(String apkPath,Context context) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setDataAndType(Uri.fromFile(new File(apkPath)), "application/vnd.android.package-archive");
        context. startActivity(intent);
        android.os.Process.killProcess(android.os.Process.myPid());
    }


}

