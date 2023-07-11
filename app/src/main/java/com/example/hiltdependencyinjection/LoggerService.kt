package com.example.hiltdependencyinjection

import android.util.Log
import javax.inject.Inject

class LoggerService @Inject constructor() {
    fun log(text: String){
        Log.d(TAG, text)
    }
}