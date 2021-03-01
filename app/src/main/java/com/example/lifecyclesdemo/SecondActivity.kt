package com.example.lifecyclesdemo


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {

    private val TAG = "SecondActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        Log.d(TAG, "onCreate was called")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart was called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume was called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause was called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop was called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy was called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart was called");
    }
}
