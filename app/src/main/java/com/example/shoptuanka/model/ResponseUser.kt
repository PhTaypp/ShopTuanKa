package com.example.shoptuanka.model

class ResponseUser(val username: String, val password: String, val id:Int) {
    override fun toString(): String {
        return "$username + $password"
    }

}