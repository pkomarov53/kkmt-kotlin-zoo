package classes

import kotlin.random.Random

class Bird(energy: Int,
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
        print("$name летит.\n")
    }

    override fun born(): Bird {
        val birdTag = Bird(Random.nextInt(1, 10), Random.nextInt(1, 5), 0, maxAge, name)
        print("Энергия - ${birdTag.energy} \n" +
                "Вес - ${birdTag.weight} \n" +
                "Текущий возраст - ${birdTag.currentAge} \n" +
                "Макс. возраст - ${birdTag.maxAge} \n" +
                "Имя - ${birdTag.name} \n")
        return birdTag
    }
}