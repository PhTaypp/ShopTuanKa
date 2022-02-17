package com.example.shoptuanka.ui.fragment

import com.example.shoptuanka.base.BaseFragment
import com.example.shoptuanka.databinding.FragmentPaymentFailedBinding

class PaymentFailedFragment : BaseFragment<FragmentPaymentFailedBinding>() {

    override fun createView(): FragmentPaymentFailedBinding {
        binding = FragmentPaymentFailedBinding.inflate(layoutInflater)
        return binding
    }


}