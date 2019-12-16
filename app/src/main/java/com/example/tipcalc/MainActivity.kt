package com.example.tipcalc

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        tipResult.visibility = View.INVISIBLE

        calculateButton.setOnClickListener {
            val bill = billEditText.text.toString().toDouble()
            val tipPercentage = tipEditText.text.toString().toDouble() / 100
            val tip = bill * tipPercentage
            val total = tip + bill

            tipResult.visibility = View.VISIBLE
            tipResult.text = getString(R.string.tipResultText, tip, total)






        }


    }
}
