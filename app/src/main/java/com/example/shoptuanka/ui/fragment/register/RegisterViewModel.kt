package com.example.shoptuanka.ui.fragment.register

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.shoptuanka.data.ApiClient
import com.example.shoptuanka.data.response.AccountToken
import com.example.shoptuanka.data.response.BaseResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RegisterViewModel: ViewModel() {
    var userToken = ""
    fun getUserToken() {
        val service = ApiClient.getService
        val call = service.registerAccount("phucvt5", "abc123", "phucvt5", "0368939255", "vutuanphuc01@gmail.com")

        call.enqueue(object : Callback<BaseResponse<AccountToken>> {
            override fun onResponse(
                call: Call<BaseResponse<AccountToken>>,
                response: Response<BaseResponse<AccountToken>>
            ) {
                if (response.isSuccessful) {
                    val token = response.body()
                    userToken = token.toString()
                }
            }

            override fun onFailure(call: Call<BaseResponse<AccountToken>>, t: Throwable) {
                Log.d("phucvt", t.message.toString())
            }
        })
    }


}