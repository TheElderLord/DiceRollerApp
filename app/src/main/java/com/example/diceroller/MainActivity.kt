package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val rollButton: Button = findViewById(R.id.button)
        val button2:Button =findViewById(R.id.button2)
        button2.setOnClickListener({rollDice()})
        rollDice()

    }


    private fun rollDice() {
        val dice = Dice(20)
        val diceRoll = dice.roll()
        val img : ImageView = findViewById(R.id.imageView)
        val imgsource = when(diceRoll){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_3
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5

            else -> R.drawable.dice_6
        }
       img.contentDescription = diceRoll.toString()
        img.setImageResource(imgsource)
//        val resultTextView: TextView = findViewById(R.id.textView)
//        resultTextView.text = diceRoll.toString()

    }

}

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}
