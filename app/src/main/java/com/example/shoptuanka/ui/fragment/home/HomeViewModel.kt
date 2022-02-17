package com.example.shoptuanka.ui.fragment.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoptuanka.model.ShoeModel

class HomeViewModel : ViewModel() {
    val listShoe: MutableList<ShoeModel> = mutableListOf()
    val listShoes: MutableLiveData<MutableList<ShoeModel>> = MutableLiveData()

    init {
        listShoe.add(
            ShoeModel(1, "Jodan", "", "giày đẹp lắm", 10, 20000.0, 99,4.0, false)
        )
        listShoe.add(
            ShoeModel(2, "Nike", "", "giày đẹp lắm", 10, 20000.0, 99,4.0, false)
        )
        listShoe.add(
            ShoeModel(3, "Adidas", "", "giày đẹp lắm", 10, 20000.0, 99,4.0, false)
        )
        listShoe.add(
            ShoeModel(4, "Jodan", "", "giày đẹp lắm", 10, 20000.0, 99,4.0, false)
        )
        listShoe.add(
            ShoeModel(5, "Jodan", "", "giày đẹp lắm", 10, 20000.0, 99,4.0, false)
        )
        listShoe.add(
            ShoeModel(1, "Jodan", "", "giày đẹp lắm", 10, 20000.0, 99,4.0, false)
        )
        listShoe.add(
            ShoeModel(2, "Jodan", "", "giày đẹp lắm", 10, 20000.0, 99,4.0, false)
        )
        listShoe.add(
            ShoeModel(3, "Jodan", "", "giày đẹp lắm", 10, 20000.0, 99,4.0, false)
        )
        listShoe.add(
            ShoeModel(4, "Jodan", "", "giày đẹp lắm", 10, 20000.0, 99,4.0, false)
        )
        listShoe.add(
            ShoeModel(5, "Jodan", "", "giày đẹp lắm", 10, 20000.0, 99,4.0, false)
        )
        listShoe.add(
            ShoeModel(1, "Jodan", "", "giày đẹp lắm", 10, 20000.0, 99,4.0, false)
        )
        listShoe.add(
            ShoeModel(2, "Jodan", "", "giày đẹp lắm", 10, 20000.0, 99,4.0, false)
        )
        listShoe.add(
            ShoeModel(3, "Jodan", "", "giày đẹp lắm", 10, 20000.0, 99,4.0, false)
        )
        listShoe.add(
            ShoeModel(4, "Jodan", "", "giày đẹp lắm", 10, 20000.0, 99,4.0, false)
        )
        listShoe.add(
            ShoeModel(5, "Jodan", "", "giày đẹp lắm", 10, 20000.0, 99,4.0, false)
        )
    }

    fun updateData(listUpdateShoes: MutableList<ShoeModel>){
        listShoes.value = listUpdateShoes
    }
}