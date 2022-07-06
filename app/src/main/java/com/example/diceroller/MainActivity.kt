package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        val button2:Button =findViewById(R.id.button2)
        button2.setOnClickListener({roll2()})
        rollButton.setOnClickListener() {
//            val diceRange =1..6
//            diceText.text = "${diceRange.random()}"
//            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
//            toast.show()
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(20)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()

    }
    private fun roll2(){
        val rand = Dice(6)
        val tview :TextView = findViewById(R.id.textView2)
        tview.text = rand.roll().toString()
    }
}

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}
