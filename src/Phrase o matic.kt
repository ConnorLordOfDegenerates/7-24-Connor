import kotlin.random.Random

fun main(){

    var word1 = arrayOf("24/7 ", "multi-tier ", "B-to-B ", "dynamic ", "pervasive ")
    var word2 = arrayOf("empowered ", "leveraged ", "aligned ", "targeted ")
    var word3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    var random1 = Random.nextInt(0, 4)
    var random2 = Random.nextInt(0, 3)
    var random3 = Random.nextInt(0, 4)

    print(word1[random1])
    print(word2[random2])
    print(word3[random3])


}