package fi.organization.isitpalindrome

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var editText : EditText
    lateinit var palindromeTextView : TextView
    lateinit var phoneNumberTextView : TextView
    var phoneNumber : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.editText = findViewById(R.id.isPalindromeEditText)
        this.palindromeTextView = findViewById(R.id.isPalindromeTextView)
        this.phoneNumberTextView = findViewById(R.id.userPhoneNumber)


        this.editText.addMyKeyListener {
            palindromeTextView.text = if(it.isPalindrome()) "YES" else "NO"
        }
    }

    fun clicked(button: View) {
        //textView.text = if(editText.text.toString().isPalindrome()) "YES" else "NO"
        var wasPalindrome = if(editText.text.toString().isPalindrome()) "Is palindrome" else "Is not palindrome"
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("palindrome", wasPalindrome)
        startActivity(intent)
    }

    fun phoneNumberClicked(button: View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivityForResult(intent, 10)
    }

    fun phoneAppClicked(button: View) {
        val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel://$phoneNumber"))
        startActivity(intent)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 10) {
            if(resultCode == RESULT_OK) {
                val value = data?.extras?.getString("number")
                phoneNumber = value
                phoneNumberTextView.text = value
            }
        }
    }

    fun EditText.addMyKeyListener(textChange: (String) -> Unit) {
        this.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                textChange(s.toString())
            }
        })
    }

    fun String.isPalindrome(ignoreCase: Boolean = false, ignoreWhiteSpaces: Boolean = false) : Boolean {
        var str = this
        if(ignoreCase) str = str.toLowerCase()
        if(ignoreWhiteSpaces) str = str.replace("\\s".toRegex(), "")

        var tempWord = ""
        for(i in str.length - 1 downTo 0) {
            tempWord += str[i]
        }
        return str == tempWord
    }
    /*
    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy()")
    }

     */
}
