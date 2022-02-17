package com.example.shoptuanka.data

import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

//const val baseUrl = "https://620377fd4d21c200170b9d76.mockapi.io/api/v1/"
//class ApiClient {
//
//    private var apiService : ApiService
//    private val arrAccount : MutableList<ResponseUser> = mutableListOf()
//    private val TAG = "ApiClient..."
//    init {
//        val h = HttpLoggingInterceptor()
//        h.setLevel(HttpLoggingInterceptor.Level.BODY)
//        val ok = OkHttpClient.Builder().addInterceptor(h).build()
//
//        val retrofit = Retrofit.Builder()
//            .baseUrl(baseUrl)
//            .client(ok)
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//        apiService = retrofit.create(ApiService::class.java)
//
//
//        GlobalScope.launch(Dispatchers.IO) {
//            val response = apiService.getResponseAccount()
//            if (response.awaitResponse().isSuccessful){
//                Log.d(TAG, "" + arrAccount)
//            }
//        }
//    }
//}

object ApiClient {
    private const val BASE_URL = "http://10.0.0.50:5050/api/v1/"
    private val okHttpClient: OkHttpClient by lazy {
        val h = HttpLoggingInterceptor()
        h.setLevel(HttpLoggingInterceptor.Level.BODY)
        OkHttpClient.Builder()
            .addInterceptor(h)
//            .connectTimeout(30, TimeUnit.SECONDS)
//            .writeTimeout(30, TimeUnit.SECONDS)
//            .readTimeout(30, TimeUnit.SECONDS)
            .build()
    }

    private val retrofit: Retrofit by lazy {
        //val gson = Gson().newBuilder().setLenient().create()
        val factory = GsonConverterFactory.create()
        Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl(BASE_URL)
            .addConverterFactory(factory)
            .build()
    }

    val getService: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }
}