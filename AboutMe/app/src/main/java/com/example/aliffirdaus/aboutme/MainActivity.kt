package com.example.aliffirdaus.aboutme

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickName(it)
        }
    }

    @SuppressLint("ServiceCast")
    private fun addNickName(view: View) {
        val editText = findViewById<EditText>(R.id.nickname_edit)
        val nicknameTextview = findViewById<TextView>(R.id.nickname_text)

        nicknameTextview.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        nicknameTextview.visibility = View.VISIBLE

        //Hide the keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
