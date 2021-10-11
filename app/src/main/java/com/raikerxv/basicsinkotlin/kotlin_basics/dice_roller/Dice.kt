package com.raikerxv.basicsinkotlin.kotlin_basics.dice_roller

class Dice(private val numSides: Int) {
    fun roll(): Int = (1..numSides).random()
}