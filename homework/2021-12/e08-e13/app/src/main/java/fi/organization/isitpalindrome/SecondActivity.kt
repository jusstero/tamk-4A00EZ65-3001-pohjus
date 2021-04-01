package fi.organization.isitpalindrome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    lateinit var textView : TextView
    lateinit var phoneNumberInput : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        this.textView = findViewById(R.id.palindromeTextView)
        this.phoneNumberInput = findViewById(R.id.phoneNumberInput)

        val extras = intent.extras
        if (extras != null) {
            textView.text = extras.getString("palindrome")
        }
    }

    override fun onBackPressed() {
        val intent = Intent()
        intent.putExtra("number", phoneNumberInput.text.toString())
        setResult(RESULT_OK, intent)
        super.onBackPressed()
    }
}
