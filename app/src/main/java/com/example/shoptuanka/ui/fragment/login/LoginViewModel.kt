package com.example.shoptuanka.ui.fragment.login

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.shoptuanka.data.ApiClient
import com.example.shoptuanka.data.response.AccountToken
import com.example.shoptuanka.data.response.BaseResponse
import com.example.shoptuanka.databinding.FragmentLoginBinding
import com.example.shoptuanka.model.LoginModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginViewModel : ViewModel() {
    private lateinit var binding: FragmentLoginBinding
    fun getUserTokenLogin(loginModel: LoginModel) : Boolean{
        var isLoginSuccess = false
        val service = ApiClient.getService
//        val call = service.login("phucvt", "abc123")
        val call = service.login(loginModel.userName, loginModel.password)
        call.enqueue(object : Callback<BaseResponse<AccountToken>> {
            override fun onResponse(
                call: Call<BaseResponse<AccountToken>>,
                response: Response<BaseResponse<AccountToken>>
            ) {
                if (response.isSuccessful) {
                    val token = response.body()
                    isLoginSuccess = true
                }
            }

            override fun onFailure(call: Call<BaseResponse<AccountToken>>, t: Throwable) {
                isLoginSuccess = false
                Log.d("phucvt", t.message.toString())
            }
        })
        return isLoginSuccess
    }

    fun validate(loginModel: LoginModel): Boolean {
        return true
    }

}