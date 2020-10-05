package com.example.practiceapp.data

import android.app.Application
import timber.log.Timber

class ApplicationState : Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}