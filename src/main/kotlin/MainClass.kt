package main.kotlin

/*
Created by rohan on 20/11/17  
*/

val WITHDRAW = 1
val DEPOSIT = 2
val EXIT = 3

var userChoice = 0

fun main(args: Array<String>) {

    val grades = mutableListOf<Int>(74, 12, 91, 88, 72, 84, 66, 65, 11)

    println("Average grade: ${grades.average()}")

    val count = grades.count({ item ->
        item > 65
    })
    println("Greater than 65 count: $count")

    val passingGrades = grades.filter { grade -> grade > 65 }
    passingGrades.forEach({
        passingGrade -> println(passingGrade)
    })

//    println("Welcome to my bank")
//    val bank: Bank = Bank()
//
//    while (userChoice != EXIT) {
//        performBankTask(bank);
//    }

//    checkingNulls()
}

fun performBankTask(bank: Bank) {
    showChoices()
    displayCurrentBalance(bank)
    userChoice = readLine()!!.toInt()

    if (userChoice == WITHDRAW) {
        bank.withdrawAmount(withdraw())
    } else if (userChoice == DEPOSIT) {
        bank.depositAmount(deposit())
    }

    displayCurrentBalance(bank)
}

fun withdraw(): Double {
    print("How much do you want to withdraw?: ")
    return readLine()!!.toDouble()
}

fun deposit(): Double {
    print("How much do you want to deposit?: ")
    return readLine()!!.toDouble()
}

fun showChoices() {
    println("Choose operation:")
    println("1. Withdraw")
    println("2. Deposit")
    println("3. Exit")
}

fun displayCurrentBalance(bank: Bank) {
    println("Current Balance: " + bank.getCurrentBalance())
    println("Transaction date: " + bank.getCurrentDate(System.currentTimeMillis()))
}

fun checkingNulls() {
    val listOfBanks = listOf(Bank(), Bank(), null, Bank())
    listOfBanks.forEach { bank ->
        val money = bank?.currentAmount
        println(money)
    }
}