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




        binding.textView.textSize = 48f
        var count = 0

        val duration = Toast.LENGTH_SHORT
        binding.increment.text = "Increment"
        binding.decrement.text = "Decrement"
        binding.reset.text = "Reset"
        val toast = Toast.makeText(applicationContext, "", duration)

        binding.increment.setOnClickListener {
            toast.setText("Previous value: $count \nNext Value: ${++count + 1}")
            binding.textView.text = count.toString()
            toast.show()
        }

        binding.decrement.setOnClickListener {
            toast.setText("Previous value: $count \nNext Value: ${--count - 1}")
            binding.textView.text = count.toString()
            toast.show()
        }
        binding.reset.setOnClickListener{
            toast.setText("Previous value: $count \nNext Value: 0")
            binding.textView.text = "0"
            count = 0
            toast.show()
        }


    }
}