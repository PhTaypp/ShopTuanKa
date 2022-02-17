package com.example.shoptuanka.data.response

import com.google.gson.annotations.SerializedName

class BaseResponse<T> {
    @SerializedName("data")
    val data: T? = null

//    @SerializedName("error")
//    val error: List<>
}