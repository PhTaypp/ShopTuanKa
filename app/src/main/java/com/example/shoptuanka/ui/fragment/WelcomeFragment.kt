package com.example.shoptuanka.ui.fragment


import android.view.View
import com.example.shoptuanka.R
import com.example.shoptuanka.base.BaseFragment
import com.example.shoptuanka.databinding.FragmentWelcomeBinding

class WelcomeFragment : BaseFragment<FragmentWelcomeBinding>() {

    override fun createView(): FragmentWelcomeBinding {
        binding = FragmentWelcomeBinding.inflate(layoutInflater)
        return binding
    }

    override fun initializeEvent() {
        binding.btnLogin.setOnClickListener(this)
        binding.btnRegister.setOnClickListener(this)
    }

    override fun initializeData() {


    }

    override fun onClick(p0: View?) {
        when (p0) {
            binding.btnLogin -> createNavController(R.id.actLogin)
            binding.btnRegister -> createNavController(R.id.actRegister)
        }
    }


}