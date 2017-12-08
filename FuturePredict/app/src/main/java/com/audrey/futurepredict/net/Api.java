package com.audrey.futurepredict.net;

/**
 * Created by dell on 2017/12/5.
 */

public class Api {

    //true 测试 false线上
    public static boolean isDebug = true;
    //https://pretty.f8cam.com:17211/app/v1/first_hand
    public static final String onTestUrl ="https://pretty.f8cam.com:17211/";
    public static final String onLineUrl  ="https://pretty.f8cam.com:17211/";

    public static final String url = isDebug ? onTestUrl : onLineUrl;

}
