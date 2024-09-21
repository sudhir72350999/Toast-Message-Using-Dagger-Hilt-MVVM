package com.example.basicprojectusingdaggerhilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication : Application() {
    // You can override methods here if needed
}