package com.example.shoptuanka.ui.dialog

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.example.shoptuanka.databinding.DialogConfirmBinding
import com.example.shoptuanka.ui.callback.OnButtonListener

class ConfirmDialog(
    var title: String,
    var content: String,
    private val callBack: OnButtonListener
) : DialogFragment() {
    private lateinit var binding: DialogConfirmBinding
    private var callback: OnButtonListener = this.callBack


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        binding = DialogConfirmBinding.inflate(layoutInflater)
        initView()
        return AlertDialog.Builder(requireContext())
            .setView(binding.root)
            .create()
    }


    private fun initView() {

        binding.tvTitle.text = title
        binding.tvContent.text = content
        binding.btnYes.text = "Có"
        binding.btnNo.text = "Không"
        binding.btnYes.setOnClickListener {
            callback.onYesClicked()
            dismiss()
        }
        binding.btnNo.setOnClickListener { dismiss() }
    }
}

