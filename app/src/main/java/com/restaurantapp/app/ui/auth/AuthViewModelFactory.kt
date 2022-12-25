package com.restaurantapp.app.ui.auth
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.restaurantapp.app.data.repositories.UserRepository

@Suppress("UNCHECKED_CAST")
class AuthViewModelFactory( private val repository: UserRepository): ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LoginViewModel(repository) as T
    }


}