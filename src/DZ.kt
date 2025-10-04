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

    //Задание 7
    print("Введите название вашего предмета (с большой буквы): ")
    val item = readln()
    val answer = checkInventory(item)
    if (answer) { println("Предмет '$item' есть в инвенторе") }
    else { println("Предмета '$item' нет в инвенторе") }

    //Задание 8
    castSpell()
    castSpell("Vengeful spirit")
    castSpell("Abyss Shriek", 100)

    //Задание 9
    createWeapon("Old Nail")
    createWeapon("Sharpened Nail", 9)
    createWeapon(21, isMagic = false)

    //Задание 10
    heal()
    heal(25)
    heal(40, isPotion = true)
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
fun checkInventory(item: String): Boolean {
    val inventory = arrayOf("Меч", "Лук", "Компот")
    return item in inventory
}

//Задание 8
fun castSpell() {
    println("Каст случайного заклинания!")
}

fun castSpell(spell: String) {
    println("Каст заклинания $spell!")
}

fun castSpell(spell: String, power: Int) {
    println("Каст $spell с силой $power!")
}

//Задание 9
fun createWeapon(name: String) {
    println("Оружие: $name")
}

fun createWeapon(name: String, damage: Int) {
    println("Оружие: $name (Урон: $damage)")
}

fun createWeapon(damage: Int, isMagic: Boolean) {
    println("${if (isMagic) "Магическое" else "Обычное"} оружие (Урон: $damage)")
}

//Задание 10
fun heal() {
    println("Востановленно 10 HP!")
}

fun heal(amount: Int) {
    println("Востановленно $amount HP!")
}

fun heal(amount: Int, isPotion: Boolean) {
    println("${if (isPotion) "Выпито зелье" else "Заклинание лечения"} (+$amount HP)")
}