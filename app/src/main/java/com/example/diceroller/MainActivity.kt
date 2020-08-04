package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dice_btn = findViewById<Button>(R.id.button)
        dice_btn.setOnClickListener { rollDice() }

    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create object instance and roll our dice
        val dice = Dice(20)
        val rollDice = dice.roll()

        // Set the result on the screen
        val rollResult = findViewById<TextView>(R.id.dice1)
        rollResult.text = rollDice.toString()


        val dice2 = Dice(6)
        val rollDiceSec = dice2.roll()

        val rollResult2 = findViewById<TextView>(R.id.dice2)
        rollResult2.text = rollDiceSec.toString()
    }
}

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
