package com.kotlinApps.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity
import com.kotlinApps.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

//    private lateinit var binding : ActivityMainBinding
    lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root);

        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)

        //replacement for findViewByID
//        binding.rollButton.text ="Let's Roll"
    var rollButton : Button = findViewById(R.id.roll_button);
//    rollButton.text ="Let's Roll"
    rollButton.setOnClickListener {
//        Toast.makeText(this,"Rolled Successfully", Toast.LENGTH_SHORT).show()
        rollDice();
    }
    }

    private fun rollDice() {
//       var resultText : TextView = findViewById(R.id.result_text)
//        var randomInt = Random.nextInt(1,7)
//        resultText.text= randomInt.toString()

//        var diceImage : ImageView = findViewById(R.id.dice_image)
        var randomInt = Random.nextInt(1,7)

        var drawableImage = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            6-> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

        diceImage.setImageResource(drawableImage)
    }
}
