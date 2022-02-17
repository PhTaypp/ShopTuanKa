package com.example.shoptuanka.ui.fragment

import com.example.shoptuanka.R
import com.example.shoptuanka.base.BaseFragment
import com.example.shoptuanka.databinding.FragmentHomeViewpagerBinding
import com.example.shoptuanka.ui.adapter.ViewPagerAdapter
import com.example.shoptuanka.ui.callback.OnItemListener
import com.example.shoptuanka.ui.fragment.cart.CartFragment
import com.example.shoptuanka.utils.Constants

class HomeViewPagerFragment : BaseFragment<FragmentHomeViewpagerBinding>() , OnItemListener {
    override fun createView(): FragmentHomeViewpagerBinding {
        binding = FragmentHomeViewpagerBinding.inflate(layoutInflater)
        return binding
    }

    override fun initializeView() {
        CartFragment.callBack = this
        PaymentFragment.callBack = this
        DeliveryAddressFragment.callBack = this
        PaymentMethodFragment.callBack = this


    }
    override fun initializeComponent() {
        binding.viewPager.isUserInputEnabled = false
        binding.viewPager.adapter = ViewPagerAdapter(this)


    }
    override fun initializeEvent() {
        val bundle = arguments
        val value = bundle?.getString(Constants.KEY)
        if (value != null){
            binding.viewPager.currentItem = 4

        }
        binding.navigationBottom.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.iv_menu_home       ->  binding.viewPager.currentItem = 0
                R.id.iv_menu_lookup     ->  binding.viewPager.currentItem = 1
                R.id.iv_menu_cart       ->  binding.viewPager.currentItem = 2
                R.id.iv_menu_account    ->  binding.viewPager.currentItem = 3

            }
            true
        }
    }


    override fun onItemClicked() {
        when(binding.viewPager.currentItem){
            2-> binding.viewPager.currentItem = 4
            4->binding.viewPager.currentItem = 5
            5-> binding.viewPager.currentItem = 6
            6->binding.viewPager.currentItem = 7
        }


    }


}