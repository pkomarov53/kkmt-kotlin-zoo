package classes

import kotlin.random.Random

class Dog(energy: Int,
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
        print("$name бежит.\n")
    }

    override fun born(): Dog {
        val dogTag = Dog(Random.nextInt(1, 10), Random.nextInt(1, 5), 0, maxAge, name)
        print("Энергия - ${dogTag.energy} \n" +
                "Вес - ${dogTag.weight} \n" +
                "Текущий возраст - ${dogTag.currentAge} \n" +
                "Макс. возраст - ${dogTag.maxAge} \n" +
                "Имя - ${dogTag.name} \n")

        return dogTag
    }
}