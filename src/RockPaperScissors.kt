fun main() {
    val options = arrayOf("Камень", "Бумага", "Ножницы")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}

fun getGameChoice(optionsParam: Array<String>) =
    optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    while (!isValidChoice) {
        print("Пожалуйста введите одно из следующих значенией:")
        for (item in optionsParam) print(" $item")
        println()
        val userInput = readLine()
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
        if (!isValidChoice) println("Неверный ввод.")
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String) {
    val result: String
    if (userChoice == gameChoice) {
        result = "Ничья!"
    } else if ((userChoice == "Камень" && gameChoice == "Ножницы") || (userChoice == "Бумага" && gameChoice == "Камень") || (userChoice == "Ножницы" && gameChoice == "Бумага")) {
        result = "Вы победили!"
    } else {
        result = "Вы проиграли!"
    }
    println("Ваш выбор $userChoice. Я выбираю $gameChoice. $result")
}