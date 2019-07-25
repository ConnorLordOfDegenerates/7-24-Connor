import kotlin.random.Random

//THIS IS THE VERSION THAT I DID MYSELF



fun main(){
//1 = rock, 2 = paper, 3 = scissors
    println("Welcome. Please input your selection below")
    var computer = Random.nextInt(1, 3)
    var player = readLine()
    if (player == "Rock") {
        if (computer == 1) {
            println("Player: Rock")
            println("Computer: Rock")
            println("Game Result: Tie")
        } else if (computer == 2) {
            println("Player: Rock")
            println("Computer: Paper")
            println("Game Result: You Lose")
        } else {
            println("Player: Rock")
            println("Computer: Scissors")
            println("Game Result: You Win")
        }
    } else if (player == "Paper") {
        if (computer == 1) {
            println("Player: Paper")
            println("Computer: Rock")
            println("Game Result: You win")
        } else if (computer == 2) {
            println("Player: Paper")
            println("Computer: Paper")
            println("Game Result: Tie")
        } else {
            println("Player: Paper")
            println("Computer: Scissors")
            println("Game Result: You Lose")
        }
    } else if (player == "Scissors") {
        if (computer == 1) {
            println("Player: Scissors")
            println("Computer: Rock")
            println("Game Result: You Lose")
        } else if (computer == 2) {
            println("Player: Scissors")
            println("Computer: Paper")
            println("Game Result: You Win")
        } else {
            println("Player: Scissors")
            println("Computer: Scissors")
            println("Game Result: Tie")
        }
    } else {
        print("Please enter a valid input")
    }
}