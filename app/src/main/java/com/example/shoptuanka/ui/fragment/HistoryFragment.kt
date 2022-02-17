package com.example.shoptuanka.ui.fragment

import android.view.View
import com.example.shoptuanka.R
import com.example.shoptuanka.base.BaseFragment
import com.example.shoptuanka.databinding.FragmentHistoryBinding

class HistoryFragment : BaseFragment<FragmentHistoryBinding>() {
    private val TAG = "HistoryFragment"
    override fun createView(): FragmentHistoryBinding {
        binding = FragmentHistoryBinding.inflate(layoutInflater)
        return binding
    }
    override fun initializeEvent() {
        binding.ivSetting.setOnClickListener(this);
    }

    override fun onClick(p0: View?) {
        when(p0){
            binding.ivSetting-> createNavController(R.id.actProfile)

        }

    }


}