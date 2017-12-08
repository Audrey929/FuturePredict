package com.audrey.futurepredict.net;


import com.audrey.futurepredict.bean.JavaBean;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by 郑文杰 on 2017/12/4.
 */

public interface ApiService {

    @POST("app/v1/first_hand")
    @FormUrlEncoded
    Observable<JavaBean> getData(@Field("type") String type, @Field("dev_id") String dev_id, @Field("ver_code") String ver_code, @Field("tick") String tick, @Field("sign") String sign);


}
