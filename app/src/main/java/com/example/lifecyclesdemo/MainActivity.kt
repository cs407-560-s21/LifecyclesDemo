package com.example.lifecyclesdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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

    fun launchSecondActivity(view: View){

        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState was called")
        outState.putString("name", name_text.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "onRestoreInstanceState was called")
        val name = savedInstanceState.getString("name")
        name_text.setText(name)
    }

}