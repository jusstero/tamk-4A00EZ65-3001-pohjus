package fi.organization.soundplayerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var start : Button
    lateinit var stop : Button
    lateinit var editText: EditText
    lateinit var myIntent : Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.start = findViewById(R.id.start)
        this.stop = findViewById(R.id.stop)
        this.editText = findViewById(R.id.editText)
        this.myIntent = Intent(this, MusicService::class.java)


    }

    fun start(view: View) {
        //Log.d("MusicService", "press start")
        myIntent.putExtra("url", editText.text)
        startService(myIntent)
        start.isEnabled = false
        stop.isEnabled = true
    }

    fun stop(view: View) {
        stopService(myIntent)
        start.isEnabled = true
        stop.isEnabled = false
    }
}
