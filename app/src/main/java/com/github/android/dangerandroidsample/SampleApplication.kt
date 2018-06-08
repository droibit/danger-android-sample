package com.github.android.dangerandroidsample

import android.app.Application
import timber.log.Timber

class SampleApplication : Application() {

  override fun onCreate() {
    super.onCreate()

    if (BuildConfig.DEBUG) {
      Timber.plant(Timber.DebugTree())
    }
  }
}
