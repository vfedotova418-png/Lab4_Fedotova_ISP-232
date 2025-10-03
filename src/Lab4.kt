fun main() {
    greetPlayer()
    greetPlayer()

    showChatMessage("Привет, рыцарь!")
    showChatMessage("Враг приближается!")

    showPlayerStats("Aragorn", 100)
    showPlayerStats("Legolas", 85)

    createCharacter("Арагорн", 10, "Рыцарь")
    createCharacter("Леголас", 5)
    createCharacter("Гэндальф")

    createItem("Меч", 50)
    createItem(price = 200, name = "Зелье")
    createItem("Посох", isMagic = true, price = 150)

    val sword = mutableListOf("Меч")
    upgradeWeapon(sword)
    println(sword)

//    val damage = calculateDamage(50, 1.5)
//    println("Нанесён урон: $damage HP")

    showWarning("Низкий уровень здоровья!")

    println(isPlayerAlive(10))
    println(isPlayerAlive(0))

    val a = sum(1, 2)
    val b = sum(1.5, 2.5)
    val c = sum(1, 2, 3)
    val d = sum(2, 1.5)
    val e = sum(1.5, 2)
}

fun greetPlayer() {
    println("Добро пожаловать в игру!")
}

fun showChatMessage(text: String) {
    println(text)
}

fun showPlayerStats(name: String, health: Int) {
    println("Игрок: $name | Здоровье: $health HP")
}

fun createCharacter(name: String, level: Int = 1, classType: String = "Новичок") {
    println("Имя: $name | Уровень: $level | Класс: $classType")
}

fun createItem(name: String, price: Int, isMagic: Boolean = false) {
    println("Предмет: $name | Цена: $price${if (isMagic) " (магический)" else ""}")
}

fun upgradeWeapon(weapon: MutableList<String>) {
    weapon.add("Улучшение +1")
}

//fun calculateDamage(baseDamage: Int, multiplier: Double): Int {
//    return (baseDamage * multiplier).toInt()
//}

fun showWarning(message: String): Unit {
    println("ВНИМАНИЕ: $message")
}

fun isPlayerAlive(health: Int): Boolean = health > 0

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum(a: Double, b: Double): Double {
    return a + b
}

fun sum(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

fun sum(a: Int, b: Double): Double {
    return a + b
}

fun sum(a: Double, b: Int): Double {
    return a + b
}