import classes.*

fun main() {
    println("1. Посмотреть список всех животных в зоопарке\n" +
            "2. Посмотреть список только травоядных\n" +
            "3. Посмотреть список только хищных\n" +
            "4. Посмотреть распорядок дня определенного животного\n")

    val zoo = mutableListOf(
        Lion("Лев", "Петя", 150.0, 1200.0, "Саванна"),
        Parrot("Попугай", "Пепега", 35.0, 5.0, "Джунгли"),
        Wolf("Волк", "Саша", 70.0, 250.0, "Болото"),
        Camel("Верблюд", "Дмитрий", 150.0, 650.5, "Саванна"),
    )

    while (true) {
        print("Введите действие -> ")
        when (readlnOrNull()) {

            "1" -> {
                println("Список всех животных:")
                var number = 0
                zoo.forEach {
                    number++
                    println("\t$number. ${it.type} ${it.name}") }
            }

            "2" -> {
                println("Список всех травоядных:")
                zoo.forEach {
                    if (it is Herbivores)
                        println("\t${it.type} ${it.name}")
                }
            }

            "3" -> {
                println("Список всех хищников:")
                zoo.forEach {
                    if (it is Carnivores)
                        println("\t${it.type} ${it.name}")
                }
            }

            "4" -> {
                println("Требуется номер из списка всех животных в зоопарке")
                try {
                    print("Введите номер животного -> ")
                    val number = readln().toInt()
                    zoo[number - 1].info()
                }
                catch(ex: Exception) {
                    println("Введите правильный номер")
                }
            }

            else -> {
                println("Некорректный ввод")
                continue
            }
        }
    }
}