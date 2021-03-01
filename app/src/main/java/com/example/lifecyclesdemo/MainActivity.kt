package com.example.lifecyclesdemo


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // The activity is being created.
        Log.d(TAG, "onCreate was called")
    }

    override fun onStart() {
        super.onStart()
        // The activity is about to become visible.
        Log.d(TAG, "OnStart was called")
    }

    override fun onResume() {
        super.onResume()
        // The activity has become visible, it is now "resumed"
        Log.d(TAG, "onResume was called")
    }

    override fun onPause() {
        super.onPause()
        // Another activity is taking focus
        // this activity is about to be "paused"
        Log.d(TAG, "onPause was called")
    }

    override fun onStop() {
        super.onStop()
        // The activity is no longer visible
        // it is now "stopped"
        Log.d(TAG, "onStop was called")
    }

    override fun onDestroy() {
        super.onDestroy()
        // The activity is about to be destroyed
        Log.d(TAG, "onDestroy was called")
    }


    override fun onRestart() {
        super.onRestart()
        // The activity is between stopped and started
        Log.d(TAG, "onRestart was called")
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        // Save the state of program such as text in the textview when the states changes
        // such as due to flipping from portrait to landscape
        Log.d(TAG, "onSaveInstanceState was called")
        outState.putString("textTyped", text_typed.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        // Called when there is a saved instance that is previously
        // saved by using onSaveInstanceState()
        // Set the value back to TextView, which could be done in onCreate as well
        Log.d(TAG, "onRestoreInstanceState was called")
        val previousText = savedInstanceState.getString("textTyped", "")
        text_typed.text = previousText
    }


    fun launchSecondActivity(view: View) {
        // Launch the second activity
        val intent = Intent(this, SecondActivity::class.java)
        Log.d(TAG, "Launching the second activity")
        startActivity(intent)
    }


    fun enterTextButton(view: View) {
        val textTyped = editText.text.toString()
        text_typed.text = "You typed: $textTyped"
    }

}
