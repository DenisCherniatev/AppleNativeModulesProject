package com.applenativemodulesproject

import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import android.util.Log
import com.facebook.react.bridge.Callback

class SimpleNativeModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {
    override fun getName() = "SimpleNativeModule"

    override fun getConstants(): MutableMap<String, Any> = hashMapOf("parrotsAmount" to 38)

    private val privateModuleValue = "some native module secret"

    @ReactMethod
    fun triggerSimpleEvent(name: String, callback: Callback) {
        Log.d("SimpleNativeModule", "triggerSimpleEvent called with name: $name")
        callback.invoke(privateModuleValue)
    }
}
