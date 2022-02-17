package com.example.shoptuanka.ui.fragment

import com.example.shoptuanka.base.BaseFragment
import com.example.shoptuanka.databinding.FragmentPaymentSuccessBinding

class PaymentSuccessFragment : BaseFragment<FragmentPaymentSuccessBinding>() {

    override fun createView(): FragmentPaymentSuccessBinding {
        binding = FragmentPaymentSuccessBinding.inflate(layoutInflater)
        return binding
    }
}


