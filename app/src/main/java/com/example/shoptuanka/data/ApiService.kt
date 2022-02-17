package com.example.shoptuanka.data

import com.example.shoptuanka.data.response.AccountToken
import com.example.shoptuanka.data.response.BaseResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {
    @POST("register")
    @FormUrlEncoded
    fun registerAccount(
        @Field("username") userName: String = "",
        @Field("password") password: String = "",
        @Field("fullname") fullName: String = "",
        @Field("phone") phone: String = "",
        @Field("email") email: String = "",
    ) : Call<BaseResponse<AccountToken>>

//    @POST("login")
//    @FormUrlEncoded
//    fun login(
//        @Field("username") userName: String = "",
//        @Field("password") password: String = "",
//    ) : Call<BaseResponse<AccountToken>>

    @POST("login")
    @FormUrlEncoded
    fun login(
        @Field("username") userName: String = "",
        @Field("password") password: String = "",
    ) : Call<BaseResponse<AccountToken>>

}