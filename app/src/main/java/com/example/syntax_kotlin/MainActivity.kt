package com.example.syntax_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.syntax_kotlin.higher_order_function.HigherOrderFunction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        HigherOrderFunction.higherOrderFunction1(10,20,::sum)
    }
    fun sum(a:Int,b:Int):Int{
        return a + b
    }


}