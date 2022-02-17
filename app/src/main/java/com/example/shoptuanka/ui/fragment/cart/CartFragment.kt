package com.example.shoptuanka.ui.fragment.cart
import android.view.View
import com.example.shoptuanka.base.BaseFragment
import com.example.shoptuanka.databinding.FragmentCartBinding
import com.example.shoptuanka.ui.callback.OnItemListener

class CartFragment : BaseFragment<FragmentCartBinding>() {


    companion object{
        lateinit var callBack: OnItemListener

    }
    override fun createView(): FragmentCartBinding {
        binding = FragmentCartBinding.inflate(layoutInflater)
        return binding
    }

    override fun initializeEvent() {
        binding.btnBuy.setOnClickListener(this)
        binding.ivBack.setOnClickListener(this)

    }

    override fun onClick(p0: View?) {
        when (p0) {
            binding.btnBuy -> callBack.onItemClicked()
            binding.ivBack -> back()

        }
    }


}