package com.example.shoptuanka.base

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.viewbinding.ViewBinding
import com.example.shoptuanka.data.ApiClient
import com.example.shoptuanka.data.response.AccountToken
import com.example.shoptuanka.data.response.BaseResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

abstract class BaseFragment<VB : ViewBinding> : Fragment(), BaseView, View.OnClickListener {
    protected lateinit var binding: VB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = createView()
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initializeView()
        initializeComponent()
        initializeEvent()
        initializeData()
    }

    abstract fun createView(): VB
    fun createNavController(actLink: Int) {
        return binding.root.findNavController().navigate(actLink)
    }

    fun back() {
        binding.root.findNavController().popBackStack()
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }

    fun createNavController(actLink: Int, bundle: Bundle) {
        return binding.root.findNavController().navigate(actLink, bundle)
    }



}