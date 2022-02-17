package com.example.shoptuanka.ui.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import com.example.shoptuanka.databinding.FragmentDialogAddCartBinding
import com.example.shoptuanka.model.ShoeModel
import com.example.shoptuanka.ui.callback.OnButtonListener
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class AddCartDialogFragment(val shoe: ShoeModel) : BottomSheetDialogFragment(), View.OnClickListener {
    companion object{
       lateinit var callback: OnButtonListener
    }


    private lateinit var binding: FragmentDialogAddCartBinding
    private lateinit var listBox: MutableList<CheckBox>
    private var number = 1
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDialogAddCartBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
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
        initView()
        initListener()
    }


    private fun initView() {
        isCancelable = false
        binding.tvCost.text = shoe.cost.toString()
        binding.tvStory.text = shoe.describe
        binding.tvNumCart.setText(number.toString())
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
        binding.btnAddCart.setOnClickListener(this)
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
            binding.ivCancel -> dismiss()
            binding.btnAddCart -> {
                for (i in 0 until listBox.size) {
                    if (listBox[i] == view) {
                        continue
                    }
                    if (listBox[i].isChecked){
                        shoe.size = listBox[i].text.toString().toInt()
                    }
                }
                shoe.number = binding.tvNumCart.text.toString().toInt()
                callback.onYesClicked()
                dismiss()
            }
        }
    }
    private fun increase() {
        number++
        binding.tvNumCart.setText(number.toString())
    }
    private fun reduction() {
        if (number > 1) {
            number--
            binding.tvNumCart.setText(number.toString())
        }
    }

}