package com.example.shoptuanka.ui.fragment


import android.view.View
import com.example.shoptuanka.base.BaseFragment
import com.example.shoptuanka.databinding.FragmentPaymentBinding
import com.example.shoptuanka.ui.callback.OnItemListener

class PaymentFragment : BaseFragment<FragmentPaymentBinding>() {
    companion object {
        lateinit var callBack: OnItemListener
    }
    override fun createView(): FragmentPaymentBinding {
        binding = FragmentPaymentBinding.inflate(layoutInflater)
        return binding
    }

    override fun initializeEvent() {
        binding.btnPayment.setOnClickListener(this)
        binding.ivBack.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        when(p0){
            binding.ivBack ->back()
            binding.btnPayment->callBack.onItemClicked()
        }
    }


}