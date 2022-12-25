package com.restaurantapp.app
import android.app.Application
import com.restaurantapp.app.data.db.AppDatabase
import com.restaurantapp.app.data.network.BrokenAPI
import com.restaurantapp.app.data.network.NetworkConnectionInterceptor
import com.restaurantapp.app.data.repositories.UserRepository
import com.restaurantapp.app.ui.auth.AuthViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

class MyRestaurant : Application(), KodeinAware {

    override val kodein = Kodein.lazy {

        import(androidXModule(this@MyRestaurant))

        bind() from singleton { NetworkConnectionInterceptor(instance()) }

        bind() from singleton { BrokenAPI(instance()) }

        bind() from singleton { AppDatabase(instance()) }

        bind() from singleton { UserRepository(instance(), instance()) }

        bind() from provider { AuthViewModelFactory(instance()) }
    }


}