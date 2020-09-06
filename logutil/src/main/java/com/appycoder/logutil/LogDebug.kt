package com.appycoder.logutil

import android.util.Log

public class LogDebug {
    companion object {
        private const val TAG = "AWESOME_APP"

        fun d(message: String) {
            Log.d(TAG, message)
        }
    }
}