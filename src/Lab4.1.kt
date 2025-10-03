fun main() {
//    attack()
//    attack("Гоблин")
//    attack("Дракон", 50)
//
//    attack("Орк")
//    attack(1001)

    usePotion("Лечебное", 50)
    usePotion(30, "Магическое")

    greet("Игрок")

    val sum_1 = fun(x: Int, y: Int): Int = x + y
    println(sum_1(10,15))

    val sum_2 = fun(x: Int, y: Int): Int {
        return x + y
    }
    println(sum_2(10, 15))

    val hello: ()->Unit = {println("Hello Kotlin")}
    hello()
    hello()

    attack("Гоблин")

    println("Урон: ${calculateDamage(10, 1.5)}")

    applyEffect { it + 20 }
    applyEffect { it - 50 }

    onEvent("Дождь") {
        println("Игрок получает эффект 'Мокрый'")
    }

    val kills = createCounter()
    println(kills())
    println(kills())
}

//fun attack() {
//    println("Атака по воздуху!")
//}
//
//fun attack(enemy: String) {
//    println("Атакован $enemy!")
//}
//
//fun attack(enemy: String, damage: Int) {
//    println("Атакован $enemy с уроном $damage HP!")
//}
//
//fun attack(target: String) {
//    println("Атакован $target!")
//}
//
//fun attack(targetId: Int) {
//    println("Атакован враг с ID $targetId!")
//}

fun usePotion(name: String, power: Int) {
    println("Использовано $name (+$power HP)")
}

fun usePotion(power: Int, name: String) {
    println("Использовано $name (+$power MP)")
}

val greet = fun(name: String) {
    println("Привет, $name!")
}

val attack = { enemy: String -> println("Атакован $enemy!") }

val calculateDamage = { base: Int, multiplier: Double -> (base * multiplier).toInt() }

fun applyEffect(effect: (Int) -> Int) {
    val health = 100
    println("Новое здоровье: ${effect(health)}")
}

fun onEvent(eventType: String, action: (String) -> Unit) {
    println("Событие: $eventType")
    action(eventType)
}

fun createCounter(): () -> Int {
    var count = 0
    return { ++count }
}