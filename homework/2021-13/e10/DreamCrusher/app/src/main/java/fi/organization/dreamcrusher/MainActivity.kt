package fi.organization.dreamcrusher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var maxNumbers = 7
    var lottoNumbers = mutableSetOf<Int>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun lottoNumberToList(view: View) {
        view as Button
        var value = view.text.toString().toInt()
        if(lottoNumbers.size < maxNumbers) lottoNumbers.add(value)
        Log.d("Lotto", "added $value to lotto row")
    }

    fun playLotto(view: View) {
        for (item in lottoNumbers) {
            Log.d("Lotto", item.toString())
        }
    }
}
