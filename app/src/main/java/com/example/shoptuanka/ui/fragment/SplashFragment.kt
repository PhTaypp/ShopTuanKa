package com.example.shoptuanka.ui.fragment
import android.os.Bundle
import android.view.View
import com.example.shoptuanka.R
import com.example.shoptuanka.base.BaseFragment
import com.example.shoptuanka.databinding.FragmentSplashBinding
import kotlinx.coroutines.*

class SplashFragment : BaseFragment<FragmentSplashBinding>() {

    override fun createView(): FragmentSplashBinding {
        binding = FragmentSplashBinding.inflate(layoutInflater)
        return binding
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        moveToWelcomeFragment()
    }

    private fun moveToWelcomeFragment() {

        val scope = CoroutineScope(Dispatchers.Main + Job())
        scope.launch {
            delay(2000)
            createNavController(R.id.actWelcome)
        }
    }


}