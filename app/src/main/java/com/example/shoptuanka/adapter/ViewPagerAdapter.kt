package com.example.shoptuanka.ui.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.shoptuanka.ui.fragment.*
import com.example.shoptuanka.ui.fragment.cart.CartFragment
import com.example.shoptuanka.ui.fragment.home.HomeFragment

class ViewPagerAdapter(HomeViewPagerFragment : Fragment) : FragmentStateAdapter(HomeViewPagerFragment) {
    override fun getItemCount(): Int {
        return 8
    }



    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> HomeFragment()
            1-> SearchFragment()
            2-> CartFragment()
            3-> HistoryFragment()
            4-> PaymentFragment()
            5-> DeliveryAddressFragment()
            6->PaymentMethodFragment()
            7->PaymentSuccessFragment()
            else -> HomeFragment()
        }

    }

}