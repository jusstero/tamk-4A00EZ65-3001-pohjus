package fi.organization.myapp

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import kotlin.concurrent.thread

class MyBackgroundService : Service() {
    var run = true
    // We are not using binded service, service can only be started and stopped
    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        thread() {
            var i = 1
            while(run) {
                Log.d("TAG", Thread.currentThread().name)
                Thread.sleep(1000)
                val intent = Intent("fi.tuni.tamk.test")
                intent.putExtra("number", "i = $i")
                sendBroadcast(intent)
                i++
            }
        }
        /*
        thread() {
            var i = 1
            while(run) {
                Log.d("", "$i, ${Thread.currentThread().name}")
                i++
                Thread.sleep(1000)
            }
        }

         */
        Log.d("MyService", "Service start")
        return START_STICKY
    }

    override fun onDestroy() {
        run = false
        Log.d("MyService", "Service stopped")
    }
}