package com.wangrunxin.demo.interfaces.config;

import okhttp3.Call;
import okhttp3.EventListener;

import java.io.IOException;

/**
 * @author wangrunxin
 * @version 1.0
 * @date 1/11/2023 12:51
 */
public class RequestEventListener extends EventListener {

    private long startTime;

    @Override
    public void callStart(Call call) {
        startTime = System.nanoTime();
    }

    @Override
    public void callEnd(Call call) {
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        double milliseconds = duration / 1e6;

        System.out.println("请求执行时间：" + milliseconds + " 毫秒");
    }

    @Override
    public void callFailed(Call call, IOException ioe) {
        // 处理请求失败的逻辑
    }
}

