package classes

import kotlin.random.Random

class Fish(energy: Int,
           weight: Int,
           currentAge: Int,
           maxAge: Int,
           name: String
) : Animal(energy, weight, currentAge, maxAge, name) {

    override fun move() {
        if (energy > 5) energy -= 5
        if (weight > 1) weight -= 1
        if (!(isTooOld())) {
            tryIncrementAge()
        }
        print("$name плывет.\n")
    }

    override fun born(): Fish {
        val fishTag = Fish(Random.nextInt(1, 10), Random.nextInt(1, 5), 0, maxAge, name)
        print("Энергия - ${fishTag.energy} \n" +
                "Вес - ${fishTag.weight} \n" +
                "Текущий возраст - ${fishTag.currentAge} \n" +
                "Макс. возраст - ${fishTag.maxAge} \n" +
                "Имя - ${fishTag.name} \n")

        return fishTag
    }
}