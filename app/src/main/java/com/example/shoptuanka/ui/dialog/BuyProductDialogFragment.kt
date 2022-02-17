package com.example.shoptuanka.ui.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import com.example.shoptuanka.databinding.FragmentDialogBuyProductBinding
import com.example.shoptuanka.model.ShoeModel
import com.example.shoptuanka.ui.callback.OnButtonListener
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BuyProductDialogFragment(val shoe: ShoeModel) : BottomSheetDialogFragment(), View.OnClickListener {
    private lateinit var binding: FragmentDialogBuyProductBinding
    private var number = 1
    private lateinit var listBox: MutableList<CheckBox>
    companion object{
        lateinit var callback: OnButtonListener
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDialogBuyProductBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initView()
        initListener()
        listBox = mutableListOf(
            binding.cbkSize36,
            binding.cbkSize37,
            binding.cbkSize38,
            binding.cbkSize39,
            binding.cbkSize40,
            binding.cbkSize41,
            binding.cbkSize42,
            binding.cbkSize43
        )

    }

    private fun initView() {
        isCancelable = false
        binding.tvCost.text = shoe.cost.toString()
        binding.tvStory.text = shoe.describe
        binding.tvNumBuy.setText(number.toString())
    }

    private fun initListener() {
        binding.cbkSize36.setOnClickListener(this)
        binding.cbkSize37.setOnClickListener(this)
        binding.cbkSize38.setOnClickListener(this)
        binding.cbkSize39.setOnClickListener(this)
        binding.cbkSize40.setOnClickListener(this)
        binding.cbkSize41.setOnClickListener(this)
        binding.cbkSize42.setOnClickListener(this)
        binding.cbkSize43.setOnClickListener(this)


        binding.ivAddProduct.setOnClickListener(this)
        binding.ivCancel.setOnClickListener(this)
        binding.ivSubtractProduct.setOnClickListener(this)
        binding.btnBuy.setOnClickListener(this)
    }

    private fun unCheck(view: View) {
        for (i in 0 until listBox.size) {
            if (listBox[i] == view) {
                continue
            }
            listBox[i].isChecked = false
        }

    }

    override fun onClick(p0: View?) {
        if (p0 is CheckBox) {
            unCheck(p0)
        }
        when (p0) {
            binding.ivAddProduct -> increase()
            binding.ivSubtractProduct -> reduction()
            binding.ivCancel->dismiss()
            binding.btnBuy->{

                dismiss()
                callback.onYesClicked()
            }
        }
    }
    private fun increase(){
        number++
        binding.tvNumBuy.setText(number.toString())
    }
    private fun reduction(){
        if (number > 1){
            number--
            binding.tvNumBuy.setText(number.toString())
        }

    }
}