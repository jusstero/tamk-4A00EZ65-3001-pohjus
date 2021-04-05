package fi.organization.soundplayerapp

import android.app.Service
import android.content.Intent
import android.media.AudioAttributes
import android.media.MediaPlayer
import android.os.Build
import android.os.IBinder
import android.util.Log
import androidx.annotation.RequiresApi
import java.io.IOException
import java.lang.IllegalArgumentException
import kotlin.concurrent.thread

class MusicService : Service() {
    var mediaPlayer = MediaPlayer()
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        thread() {
            //Log.d("MusicService", "${Thread.currentThread().name}, started")
            val url = intent?.extras?.get("url").toString()
            mediaPlayer = MediaPlayer().apply {
                setAudioAttributes(
                    AudioAttributes.Builder()
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .setUsage(AudioAttributes.USAGE_MEDIA)
                        .build()
                )
                try {
                    setDataSource(url)
                    prepare() // might take long! (for buffering, etc)
                    start()
                } catch (ex:Exception) {
                    when(ex) {
                        is IOException,
                        is IllegalArgumentException -> {
                            Log.d("error", "give url")
                        }
                    }
                }
            }
        }
        return START_STICKY
    }

    override fun onDestroy() {
        Log.d("MusicService", "service stopped")
        mediaPlayer?.release()

        super.onDestroy()
    }

}