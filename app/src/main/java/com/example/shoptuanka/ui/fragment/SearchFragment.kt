package com.example.shoptuanka.ui.fragment

import com.example.shoptuanka.base.BaseFragment
import com.example.shoptuanka.databinding.FragmentSearchBinding

class SearchFragment: BaseFragment<FragmentSearchBinding>() {

    override fun createView(): FragmentSearchBinding {
        binding = FragmentSearchBinding.inflate(layoutInflater)
        return binding
    }


}