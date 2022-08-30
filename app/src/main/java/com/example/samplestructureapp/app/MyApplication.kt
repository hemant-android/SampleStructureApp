package com.example.samplestructureapp.app

import android.app.Application
import com.example.samplestructureapp.config.SharedPreferenceUtils

class MyApplication : Application() {
    val preference by lazy { SharedPreferenceUtils(this) }

    override fun onCreate() {
        super.onCreate()
        application = this
    }

    companion object {
        lateinit var application: MyApplication

        @JvmStatic
        fun getApp() = application
    }
}

fun Any.getPref(): SharedPreferenceUtils {
    return MyApplication.getApp().preference
}