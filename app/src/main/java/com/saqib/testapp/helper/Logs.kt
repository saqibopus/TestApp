package com.saqib.testapp.helper

import com.saqib.testapp.BuildConfig

object Logs {
    const val TAG = "----**"
    fun p(string: String) {
        if (BuildConfig.DEBUG) {
            println("$TAG $string")
        }
    }
}