package com.example.syntax_kotlin.higher_order_function

class HigherOrderFunction {
    companion object {
        fun higherOrderFunction1(a:Int,b:Int,func:(Int,Int)->Int):Int{
            return func(a,b)
        }
    }
}