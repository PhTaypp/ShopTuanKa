package com.example.shoptuanka.ui.fragment

import android.view.View
import com.example.shoptuanka.base.BaseFragment
import com.example.shoptuanka.databinding.FragmentDeliveryAddressBinding
import com.example.shoptuanka.ui.callback.OnItemListener

class DeliveryAddressFragment : BaseFragment<FragmentDeliveryAddressBinding>() {
    companion object{
        lateinit var callBack: OnItemListener

    }
    override fun createView(): FragmentDeliveryAddressBinding {
        binding = FragmentDeliveryAddressBinding.inflate(layoutInflater)
        return binding
    }

    override fun initializeEvent() {
        binding.btnConfirm.setOnClickListener(this)
        binding.ivBack.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0){
            binding.btnConfirm-> callBack.onItemClicked()
        }
    }
}