package com.example.shoptuanka.ui.fragment


import android.view.View

import com.example.shoptuanka.R
import com.example.shoptuanka.base.BaseFragment
import com.example.shoptuanka.databinding.FragmentProfileBinding
import com.example.shoptuanka.ui.callback.OnButtonListener
import com.example.shoptuanka.ui.dialog.ConfirmDialog

class ProfileFragment : BaseFragment<FragmentProfileBinding>(), OnButtonListener {
    private lateinit var dialog: ConfirmDialog

    override fun initializeView() {
        dialog = ConfirmDialog(
            "Xác nhận",
            "Bạn có chắc chắn muốn thoát",this
        )

    }



    override fun createView(): FragmentProfileBinding {
        binding = FragmentProfileBinding.inflate(layoutInflater)
        return binding
    }

    override fun initializeEvent() {
        binding.ivBack.setOnClickListener(this)
        binding.btnLogout.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0) {
            binding.ivBack -> back()
            binding.btnLogout ->dialog.show(parentFragmentManager , "")


        }
    }

    override fun onYesClicked() {
        createNavController(R.id.actLogin)
    }

}