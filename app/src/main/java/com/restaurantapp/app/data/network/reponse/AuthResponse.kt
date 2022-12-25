package com.restaurantapp.app.data.network.reponse

import com.restaurantapp.app.data.db.entities.User

data class AuthResponse (

    val isSuccessful: Boolean?,
    val message : String?,
    val user: User?
)