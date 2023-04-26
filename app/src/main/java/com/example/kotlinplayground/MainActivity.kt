package com.example.kotlinplayground

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.kotlinplayground.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil
            .setContentView(this, R.layout.activity_main)

        val factText = "BC <3 Gini"
        val fictionText = "BC prefers cats over dogs"
        val duration = Toast.LENGTH_LONG
        binding.startButton.text = "Get Fact"
        binding.endButton.text = "Get Fiction"
        val factToast = Toast.makeText(applicationContext, factText, duration)
        val fictionToast = Toast.makeText(applicationContext, fictionText, duration)

        binding.startButton.setOnClickListener {
            if (binding.startButton.text == "Get Fact") {
                binding.startButton.text = "Get Fiction"
                binding.endButton.text = "Get Fact"
                factToast.show()

            } else {
                binding.startButton.text = "Get Fact"
                binding.endButton.text = "Get Fiction"
                fictionToast.show()

            }
        }

        binding.endButton.setOnClickListener {
            if (binding.endButton.text == "Get Fiction") {
                binding.endButton.text = "Get Fact"
                binding.startButton.text = "Get Fiction"
                fictionToast.show()

            } else {
                binding.endButton.text = "Get Fiction"
                binding.startButton.text = "Get Fact"
                factToast.show()
            }
        }
    }
}