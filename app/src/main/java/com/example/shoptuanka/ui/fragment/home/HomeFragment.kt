package com.example.shoptuanka.ui.fragment.home

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.shoptuanka.R
import com.example.shoptuanka.base.BaseFragment
import com.example.shoptuanka.databinding.FragmentHomeBinding
import com.example.shoptuanka.model.ShoeModel
import com.example.shoptuanka.ui.callback.OnItemListener
import com.example.shoptuanka.utils.Constants


class HomeFragment : BaseFragment<FragmentHomeBinding>(), OnItemListener {
    private lateinit var homeAdapter: HomeRecycleAdapter
    private lateinit var viewModel: HomeViewModel
    override fun createView(): FragmentHomeBinding {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding
    }

    override fun initializeView() {
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        homeAdapter = HomeRecycleAdapter(mutableListOf<ShoeModel>(), requireContext(), this)
        val _listShoes = mutableListOf<ShoeModel>()
        viewModel.updateData(viewModel.listShoe)
        viewModel.listShoes.observe(viewLifecycleOwner) { listShoes ->
            homeAdapter.setData(listShoes)
        }

    }

    override fun initializeComponent() {
        binding.rclShoe.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.rclShoe.adapter = homeAdapter
    }

    override fun onItemClicked(position: Int) {
        val shoe = viewModel.listShoe[position]
        val bundle = Bundle()
        bundle.putSerializable(Constants.KEY, shoe)
        createNavController(R.id.actDetail, bundle)
    }


}