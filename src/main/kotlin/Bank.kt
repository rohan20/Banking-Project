package main.kotlin

import java.text.SimpleDateFormat
import java.util.*

/*
Created by rohan on 22/11/17  
*/

class Bank() {

    var currentAmount = 2.0

    fun withdrawAmount(amount: Double): Double {
        if (amount > currentAmount) {
            println("Not enough amount in bank.")
            return -1.0
        } else {
            currentAmount -= amount
            return currentAmount
        }
    }

    fun depositAmount(amount: Double): Double {
        currentAmount += amount
        return currentAmount
    }

    fun getCurrentBalance(): Double {
        return currentAmount
    }

    fun getCurrentDate(currentTimeInMillis: Long): String {
        val date = Date(currentTimeInMillis)
        val dateFormatter = SimpleDateFormat("dd MMM y, h:mm a")
        return dateFormatter.format(date)
    }
}