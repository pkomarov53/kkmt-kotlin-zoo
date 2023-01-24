package classes

import kotlin.random.Random

open class Animal(var energy: Int, var weight: Int, var currentAge: Int, val maxAge: Int, val name: String) {

    fun isTooOld(): Boolean {
        return (currentAge >= maxAge)
    }

    fun sleep() {
        energy += 5
        currentAge += 1
        print("$name спит.\n")
    }

    fun feed() {
        energy += 3
        weight += 1
        if (!(isTooOld())) {
            tryIncrementAge()
        }
        print("$name ест.\n")
    }

    open fun move() {
        if (energy > 5) energy -= 5
        if (weight > 1) weight -= 1
        if (!(isTooOld())) {
            tryIncrementAge()
        }
        print("$name передвигается.\n")
    }

    open fun born(): Animal {
        val animalTag = Animal(Random.nextInt(1, 10), Random.nextInt(1, 5), 0, maxAge, name)
        print("Энергия - ${animalTag.energy} \n" +
                "Вес - ${animalTag.weight} \n" +
                "Текущий возраст - ${animalTag.currentAge} \n" +
                "Макс. возраст - ${animalTag.maxAge} \n" +
                "Имя - ${animalTag.name} \n")

        return animalTag
    }

    fun tryIncrementAge() {
        if (Random.nextBoolean()) {
            currentAge += 1
        }
    }
}