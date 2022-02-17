package com.example.shoptuanka.model

import java.io.Serializable

data class ShoeModel(
    val id: Int,
    val name: String,
    val linkImage: String,
    val describe: String,
    var size: Int,
    var cost: Double,
    var number: Int,
    var rate: Double,
    var isLike: Boolean
) : Serializable {

}