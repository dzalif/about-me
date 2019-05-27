package com.example.aliffirdaus.colormyviews

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
                listOf(box_one_text, box_two_text, box_three_text, box_four_text, box_five_text, constraint_layout,
                        button_red, button_green, button_yellow)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
       when (view.id) {
           //Box using class Color
           R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
           R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

           //Box using android color resources
           R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
           R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
           R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

           R.id.button_red -> box_three_text.setBackgroundResource(R.color.my_red)
           R.id.button_green -> box_four_text.setBackgroundResource(R.color.my_green)
           R.id.button_yellow -> box_five_text.setBackgroundResource(R.color.my_yellow)

           else -> view.setBackgroundColor(Color.LTGRAY)
       }
    }
}
