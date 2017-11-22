package main.kotlin

/*
Created by rohan on 20/11/17  
*/

fun main(args: Array<String>) {

    val WITHDRAW = 1
    val DEPOSIT = 2
    val EXIT = 3

    println("Welcome to my bank")
    var userChoice: Int = 0

    while (userChoice != EXIT) {
        showChoices()
        userChoice = readLine()!!.toInt()

        if (userChoice == WITHDRAW) {

        } else if (userChoice == DEPOSIT) {

        }

    }
}

fun showChoices() {
    println("Choose operation:")
    println("1. Withdraw")
    println("2. Deposit")
    println("3. Exit")
}