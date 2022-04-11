package education.cccp.mobile.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import education.cccp.mobile.fragment.R.layout.activity_main

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
        MainActivity::class.java.simpleName.run {
            Log.d(
                this,
                "$this is created"
            )
        }
    }

    override fun onResume() {
        super.onResume()
        MainActivity::class.java.simpleName.run {
            Log.d(
                this,
                "$this is on resume"
            )
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        MainActivity::class.java.simpleName.run {
            Log.d(
                this,
                "$this is on destroy"
            )
        }
    }

    override fun onPause() {
        super.onPause()
        MainActivity::class.java.simpleName.run {
            Log.d(
                this,
                "$this is on pause"
            )
        }
    }

    override fun onStop() {
        super.onStop()
        MainActivity::class.java.simpleName.run {
            Log.d(
                this,
                "$this is on stop"
            )
        }
    }

    override fun onStart() {
        super.onStart()
        MainActivity::class.java.simpleName.run {
            Log.d(
                this,
                "$this is on start"
            )
        }
    }
}