package com.example.shoptuanka.ui.fragment

import android.view.View
import com.example.shoptuanka.base.BaseFragment
import com.example.shoptuanka.databinding.FragmentPaymentMethodBinding
import com.example.shoptuanka.ui.callback.OnItemListener

class PaymentMethodFragment : BaseFragment<FragmentPaymentMethodBinding>() {
    companion object{
        lateinit var callBack: OnItemListener

    }
    override fun createView(): FragmentPaymentMethodBinding {
        binding = FragmentPaymentMethodBinding.inflate(layoutInflater)
        return binding
    }

    override fun initializeEvent() {
        binding.btnPayment.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0){
            binding.btnPayment-> callBack.onItemClicked()
        }
    }



}