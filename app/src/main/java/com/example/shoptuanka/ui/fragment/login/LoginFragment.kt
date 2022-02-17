package com.example.shoptuanka.ui.fragment.login

import android.view.View
import android.widget.Toast
import com.example.shoptuanka.R
import com.example.shoptuanka.base.BaseFragment
import com.example.shoptuanka.databinding.FragmentLoginBinding
import com.example.shoptuanka.model.LoginModel

class LoginFragment : BaseFragment<FragmentLoginBinding>() {
    val loginViewModel = LoginViewModel()
    override fun createView(): FragmentLoginBinding {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        return binding
    }

    override fun initializeEvent() {
        binding.btnLogin.setOnClickListener(this)
        binding.tvRegister.setOnClickListener(this)
        binding.ivBack.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        var loginModel = LoginModel(binding.edtUsername.text.toString(),binding.edtPassword.text.toString())
        when (p0) {
            binding.btnLogin -> {
//                val isValidate = loginViewModel.validate("phucvt", "abc123")
                val isValidate = loginViewModel.validate(loginModel)
                if (isValidate) {
                    var isLoginSuccess = loginViewModel.getUserTokenLogin(loginModel)
                    if (isLoginSuccess) {
                        createNavController(R.id.actHome)
                    } else {
                        Toast.makeText(requireContext(),"Khong dang nhap duoc",Toast.LENGTH_LONG).show()
                    }
                } else {
                    Toast.makeText(requireContext(),"Tai khoan mat khau khong dung",Toast.LENGTH_LONG).show()
                }
            }
            binding.tvRegister -> createNavController(R.id.actRegister)
            binding.ivBack -> back()
        }
    }


}