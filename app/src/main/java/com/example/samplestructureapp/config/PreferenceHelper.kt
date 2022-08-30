package com.example.samplestructureapp.config

import com.example.samplestructureapp.app.MyApplication
import com.example.samplestructureapp.app.getPref
import com.example.samplestructureapp.constant.PrefKey

object PreferenceHelper {
    private val preferences: SharedPreferenceUtils by lazy { MyApplication.getPref() }
    var userId: String
        get() = preferences.get(PrefKey.userId, "")
        set(userId) = preferences.set(PrefKey.userId, userId)
}