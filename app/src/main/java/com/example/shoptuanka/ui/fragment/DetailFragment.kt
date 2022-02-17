package com.example.shoptuanka.ui.fragment


import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.shoptuanka.R
import com.example.shoptuanka.base.BaseFragment
import com.example.shoptuanka.databinding.FragmentDetailBinding
import com.example.shoptuanka.model.ShoeModel
import com.example.shoptuanka.ui.callback.OnButtonListener
import com.example.shoptuanka.ui.dialog.AddCartDialogFragment
import com.example.shoptuanka.ui.dialog.BuyProductDialogFragment
import com.example.shoptuanka.utils.Constants


class DetailFragment : BaseFragment<FragmentDetailBinding>() , OnButtonListener{
    private lateinit var shoe: ShoeModel
    private lateinit var bundle : Bundle
    private lateinit var buyProductDialogFragment : BuyProductDialogFragment
    private lateinit var addCartDialogFragment : AddCartDialogFragment

    override fun createView(): FragmentDetailBinding {
        binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding
    }

    override fun initializeView() {
        bundle = arguments!!
        shoe = bundle.getSerializable(Constants.KEY) as ShoeModel
        buyProductDialogFragment = BuyProductDialogFragment(shoe)
        addCartDialogFragment = AddCartDialogFragment(shoe)
        AddCartDialogFragment.callback = this
        BuyProductDialogFragment.callback = this
    }

    override fun initializeComponent() {
        binding.tvContent.text = shoe.describe
        binding.tvProductName.text = shoe.name


    }
    override fun initializeEvent() {
        binding.ivBack.setOnClickListener(this)
        binding.btnBuy.setOnClickListener(this)
        binding.btnAddCart.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0) {
            binding.ivBack -> back()
            binding.btnBuy -> showBuyProductDialogFragment()
            binding.btnAddCart->showAddCartDialogFragment()
        }
    }
    private fun showBuyProductDialogFragment(){
        buyProductDialogFragment.show(parentFragmentManager , "")

    }
    private fun showAddCartDialogFragment(){
        addCartDialogFragment.show(parentFragmentManager , "")
    }

    override fun onYesClicked() {
        Toast.makeText(requireContext(), " Thêm thành công", Toast.LENGTH_LONG).show()
        createNavController(R.id.actHome , bundle)
    }


}