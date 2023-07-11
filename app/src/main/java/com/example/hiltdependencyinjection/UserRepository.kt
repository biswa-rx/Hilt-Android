package com.example.hiltdependencyinjection

import android.util.Log
import javax.inject.Inject

const val TAG = "biswa_rx"
interface UserRepository{
    fun saveUser(email: String, password: String)
}
class SQLRepository @Inject constructor(private val loggerService: LoggerService) : UserRepository {
    override fun saveUser(email: String, password: String) {
        loggerService.log("User save in SQL")
    }
}
class FirebaseRepository : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User saved in firebase")
    }
}