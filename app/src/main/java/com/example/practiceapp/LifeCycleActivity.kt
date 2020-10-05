package com.example.practiceapp

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import timber.log.Timber

class LifeCycleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)

        Timber.i("OnCreate Called")
    }

    override fun onStart() {
        super.onStart()

        Timber.i("OnStart Called")
    }

    override fun onStop() {
        super.onStop()

        Timber.i("OnStop Called")
    }

    override fun onRestart() {
        super.onRestart()

        Timber.i("OnRestart Called")
    }

    override fun onPause() {
        super.onPause()

        Timber.i("OnPause Called")
    }

    override fun onResume() {
        super.onResume()

        Timber.i("OnResume Called")
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)

        Timber.i("OnSaveInstanceState Called")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        Timber.i("OnRestoreInstanceState Called")
    }

    override fun onDestroy() {
        super.onDestroy()

        Timber.i("OnDestroy Called")
    }
}