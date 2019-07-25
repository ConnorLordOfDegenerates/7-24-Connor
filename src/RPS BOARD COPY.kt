

import kotlin.random.Random

//THIS IS THE VERSION FROM CLASS


fun main(){

    var wantToPlayAgain = true

    println("Welcome to Rock Paper Scissors")

    while (wantToPlayAgain) {
        welcomeMessage()
        val userChoice: Int = readLine()?.toIntOrNull() ?: 0
        val aiChoice = Random.nextInt(1, 3)
        wantToPlayAgain= playGame(userChoice, aiChoice)
    }
}


fun playGame(userChoice: Int, aiChoice: Int): Boolean{

    println("You chose $userChoice and the AI chose $aiChoice")
    val result = when (userChoice) {
        aiChoice -> "You tied"
        1 -> if (aiChoice == 2) "You lose" else "You Won"
        2 -> if (aiChoice == 3) "You lose" else "You Won"
        3 -> if (aiChoice == 1) "You lose" else "You Won"
        else -> "Please enter valid entry"
    }
    println(result)
    println("Do you want to go again?")
    var go = readLine()?.toUpperCase()
    return go != "NO"
}
private fun welcomeMessage(){
    println("Please enter one of the following:")
    println("1 - Rock")
    println("2- Paper")
    println("3- Scissors")
    print("Enter your selection:")

}