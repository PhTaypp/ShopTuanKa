package com.example.shoptuanka.ui.fragment

import android.os.Bundle
import android.view.View
import com.example.shoptuanka.R
import com.example.shoptuanka.base.BaseFragment
import com.example.shoptuanka.databinding.FragmentRegisterSuccessBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class RegisterSuccessFragment : BaseFragment<FragmentRegisterSuccessBinding>() {

    override fun createView(): FragmentRegisterSuccessBinding {
        binding = FragmentRegisterSuccessBinding.inflate(layoutInflater)
        return binding
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toHomeFrg()
    }

    private fun toHomeFrg() {
        val scope = CoroutineScope(Dispatchers.Main)
        scope.launch {
            delay(2000)
            createNavController(R.id.actHome)
        }
    }


}