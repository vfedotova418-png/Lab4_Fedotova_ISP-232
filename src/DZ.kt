fun main() {
    //Задание 1
    showGameLogo()
    showGameLogo()

    //Задание 2
    showEnemy("Hornet", 3)
    showEnemy("Pure Vessel", 10)

    //Задание 3
    spawnEnemy("Skarrwing")
    spawnEnemy("Skarrsinger Karmelita", isBoss = true)

    //Задание 4
    spawnEnemy("Shakra", health = 300)
    spawnEnemy("Король Тьмы", 500, true)

    //Задание 5
    createQuest("Найти кота")
    createQuest("Спасти принцессу", 100, true)

    //Задание 6
    println("Количество опыта необходимое для достижения 5 уровня: ${calculateXP(5)}")
}

//Задание 1
fun showGameLogo() {
    println("----------HOLLOW KNIGHT----------")
}

//Задание 2
fun showEnemy(name: String, level: Int) {
    println("Враг: $name (Уровень: $level)")
}

//Задание 3
fun spawnEnemy(name: String, health: Int = 100, isBoss: Boolean = false) {
    println("Враг: $name (Здоровье: $health HP${if (isBoss) " | БОСС!" else ""})")
}

//Задание 5
fun createQuest(title: String, reward: Int = 50, isMain: Boolean = false) {
    println("Квест: $title (Награда: $reward золота${if (isMain) " | ОСНОВНОЙ" else ""})")
}

//Задание 6
fun calculateXP(level: Int): Int {
    return level * 1000
}

//Задание 7