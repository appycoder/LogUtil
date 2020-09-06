package com.appycoder.errorutil

import android.util.Log

public class ErrorDebug {
    companion object {
        private const val TAG = "AWESOME_APP"

        fun e(message: String) {
            Log.e(TAG, message)
        }
    }
}