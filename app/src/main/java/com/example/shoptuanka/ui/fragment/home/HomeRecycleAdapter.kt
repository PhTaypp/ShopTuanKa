package com.example.shoptuanka.ui.fragment.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shoptuanka.R
import com.example.shoptuanka.databinding.ItemProductHomeFragmentBinding
import com.example.shoptuanka.model.ShoeModel
import com.example.shoptuanka.ui.callback.OnItemListener

class HomeRecycleAdapter(
    private var listShoe: MutableList<ShoeModel>,
    context: Context,
    onClickListener: OnItemListener
) :
    RecyclerView.Adapter<HomeRecycleAdapter.HomeRecycleViewHolder>() {
    private val onClickItemListener = onClickListener
    private lateinit var binding: ItemProductHomeFragmentBinding
    private val layoutInflate: LayoutInflater = LayoutInflater.from(context)
    override fun getItemCount(): Int {
        return listShoe.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeRecycleViewHolder {
        binding = ItemProductHomeFragmentBinding.inflate(layoutInflate, parent, false)
        return HomeRecycleViewHolder(binding.root)
    }


    override fun onBindViewHolder(holder: HomeRecycleViewHolder, position: Int) {
        holder.bindViews(position)
        binding.root.setOnClickListener {
            onClickItemListener.onItemClicked(position)
        }
    }

    fun setData(listShoes: MutableList<ShoeModel>){
        val oldSize = listShoe.size
        listShoe.clear()
        notifyItemRangeRemoved(0, oldSize)
        listShoe = listShoes
        notifyItemRangeInserted(0, listShoe.size)
//        notifyItemChange, notifyItemInserted, notifyItemRemoved
        // notifyItemRangeChange
        notifyDataSetChanged()
    }

    inner class HomeRecycleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindViews(position: Int) {
            val shoes = listShoe[position]
            binding.ivProduct.setImageResource(R.drawable.ic_shoe_2)
            binding.tvCost.text = shoes.cost.toString()
            binding.tvContent.text = shoes.describe

        }

    }
}