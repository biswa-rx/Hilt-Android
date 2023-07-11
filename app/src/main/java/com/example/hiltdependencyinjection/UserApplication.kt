package com.example.hiltdependencyinjection

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class UserApplication : Application() {

//    @Inject
//    lateinit var userRepository: UserRepository
    override fun onCreate() {
        super.onCreate()

//        userRepository.saveUser("text@gmail.com","123")
    }
}