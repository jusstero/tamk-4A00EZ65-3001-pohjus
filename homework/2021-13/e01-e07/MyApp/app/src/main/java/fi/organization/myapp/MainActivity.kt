package fi.organization.myapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.Intent.ACTION_TIME_TICK
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    lateinit var threadButton : Button
    lateinit var startServiceButton : Button
    var receiver = MyBroadCastReceiver()
    var receiver2 = MyBroadCastReceiver2()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.startServiceButton = findViewById(R.id.startServiceButton)
    }

    fun startMyService(view: View) {
        startService(Intent(this, MyBackgroundService::class.java))

    }

    fun stopMyService(view: View) {
        stopService(Intent(this, MyBackgroundService::class.java))
    }


    override fun onResume() {
        super.onResume()
        registerReceiver(receiver2, IntentFilter("fi.tuni.tamk.test"));
    }

    override fun onPause() {
        super.onPause()
        unregisterReceiver(receiver2)
    }

    inner class MyBroadCastReceiver2 : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            Log.d("TAG", Thread.currentThread().name)
            var value = intent?.extras?.getString("number")
            startServiceButton.text = value

        }
    }


    // e01-e02
    fun threadsForButton(view: View) {
        thread() {
            for (i in 1..10) {
                runOnUiThread() {
                    threadButton.text = i.toString()
                }

                Log.d("exercise", i.toString())
                Log.d("exercise", Thread.currentThread().name)
                Thread.sleep(1000)

            }
        }
        Log.d("exercise", Thread.currentThread().name)
    }
}
