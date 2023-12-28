package com.questions.answers.fast.thefirstqa.base

import android.app.Application
import com.questions.answers.fast.thefirstqa.utils.ClockHelp
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class App : Application() {
    companion object {
        lateinit var instance: App
        const val TAG = "FQA"
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        GlobalScope.launch {
            ClockHelp.sendRequest(this@App)
        }

    }
}