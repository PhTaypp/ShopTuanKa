package com.example.shoptuanka.ui.fragment.register

import android.view.View
import com.example.shoptuanka.R
import com.example.shoptuanka.base.BaseFragment
import com.example.shoptuanka.databinding.FragmentRegisterBinding

class RegisterFragment : BaseFragment<FragmentRegisterBinding>() {
    val registerViewModel = RegisterViewModel()
    override fun createView(): FragmentRegisterBinding {
        binding = FragmentRegisterBinding.inflate(layoutInflater)
        return binding
    }

    override fun initializeEvent() {
        binding.btnRegister.setOnClickListener(this)
        binding.tvLogin.setOnClickListener(this)
        binding.ivBack.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0) {
            binding.btnRegister -> {
                registerViewModel.getUserToken()
                print("TOKEN: ${registerViewModel.userToken}")
                createNavController(R.id.actRegisterSuccess)
            }
            binding.tvLogin -> createNavController(R.id.actLogin)
            binding.ivBack -> back()
        }
    }




}