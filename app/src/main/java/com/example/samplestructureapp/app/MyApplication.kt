package com.example.samplestructureapp.app

import android.app.Activity
import android.app.Application
import com.example.samplestructureapp.config.SharedPreferenceUtils

class MyApplication : Application() {
    private var mCurrentActivity: Activity? = null
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

    fun getCurrentActivity(): Activity? {
        return mCurrentActivity
    }

    fun setCurrentActivity(mCurrentActivity: Activity?) {
        this.mCurrentActivity = mCurrentActivity
    }
}

fun Any.getPref(): SharedPreferenceUtils {
    return MyApplication.getApp().preference
}