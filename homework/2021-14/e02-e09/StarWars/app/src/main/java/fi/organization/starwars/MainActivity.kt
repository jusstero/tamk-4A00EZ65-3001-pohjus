package fi.organization.starwars

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import com.fasterxml.jackson.databind.ObjectMapper
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import kotlin.concurrent.thread
import org.json.*

class MainActivity : AppCompatActivity() {
    lateinit var json : JSONObject
    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)
    }

    override fun onResume() {
        super.onResume()

        downloadUrlAsync(this, "https://swapi.dev/api/people/") {
            println(it)
            val mp = ObjectMapper()
            val myObject: StarWarsJsonObject = mp.readValue(it, StarWarsJsonObject::class.java)
            val persons: MutableList<Person>? = myObject.results
            persons?.sortByDescending { it.getBmi() }
            var adapter = ArrayAdapter<Person>(this, R.layout.item, R.id.myTextView, persons as ArrayList);
            listView.adapter = adapter;
        }

        // e04

        /*
        thread() {
            val url = getUrl("https://swapi.dev/api/people/")
            runOnUiThread {
                json = JSONObject(url)
                println(url)

                var jsonArray = json.getJSONArray("results")
                Log.d("starwars", "$jsonArray")

                var name = jsonArray.getJSONObject(0).getString("name")
                nameDisplay.text = name
            }
        }

        //e05

        thread() {
            val url = getUrl("https://swapi.dev/api/people/")


            val mp = ObjectMapper()
            val myObject: StarWarsJsonObject = mp.readValue(url, StarWarsJsonObject::class.java)
            val persons: MutableList<Person>? = myObject.results
            persons?.forEach {
                println(it)
            }
        }
        */
    }

 }
