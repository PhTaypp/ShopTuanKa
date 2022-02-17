//package com.example.shoptuanka.ui.fragment.cart
//
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.example.shoptuanka.R
//import com.example.shoptuanka.model.ShoeModel
//import com.example.shoptuanka.ui.callback.OnItemListener
//
//class CartRecycleAdapter(
//    private var listShoe: MutableList<ShoeModel>,
//    context: Context,
//    onClickListener: OnItemListener
//) :
//    RecyclerView.Adapter<CartRecycleAdapter.CartRecycleViewHolder>() {
//    private val onClickItemListener = onClickListener
////    private lateinit var binding: ItemProductCartFragmentBinding
//    private val layoutInflate: LayoutInflater = LayoutInflater.from(context)
//    override fun getItemCount(): Int {
//        return listShoe.size
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartRecycleViewHolder {
////        binding = ItemProductCartFragmentBinding.inflate(layoutInflate, parent, false)
////        return CartRecycleViewHolder(binding.root)
//    }
//
//
//    override fun onBindViewHolder(holder: CartRecycleViewHolder, position: Int) {
//        holder.bindViews(position)
////        binding.root.setOnClickListener {
////            onClickItemListener.onItemClicked(position)
////        }
//    }
//
//    fun setData(listShoes: MutableList<ShoeModel>) {
//        val oldSize = listShoe.size
//        listShoe.clear()
//        notifyItemRangeRemoved(0, oldSize)
//        listShoe = listShoes
//        notifyItemRangeInserted(0, listShoe.size)
////        notifyItemChange, notifyItemInserted, notifyItemRemoved
//        // notifyItemRangeChange
//        notifyDataSetChanged()
//    }
//
//    inner class CartRecycleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        fun bindViews(position: Int) {
//            val shoes = listShoe[position]
////            binding.ivProduct.setImageResource(R.drawable.ic_shoe_2)
//
//
//        }
//
//    }
//}