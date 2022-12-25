package com.restaurantapp.app.ui.auth
import com.restaurantapp.app.data.db.entities.User

interface AuthListener {

    fun onStarted()

    fun onSuccess(user: User)

    fun onFailure(message: String)

}