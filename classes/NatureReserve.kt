package classes

import kotlin.random.Random

class NatureReserve(val birdCount: Int, val fishCount: Int,  val dogCount:Int) {
    val animalList = mutableListOf<Animal>()

    fun addBird() {
        for (i in 1..birdCount) {
            animalList.add(Bird(10, 10, 10, 15, "Bilbo"))
        }
    }

    fun addFish() {
        for (i in 1..fishCount) {
            animalList.add(Fish(10, 10, 10, 15, "Gary"))
        }
    }

    fun addDog() {
        for (i in 1..dogCount) {
            animalList.add(Dog(10, 10, 10, 15, "Floppy"))
        }
    }

    /* fun addAnimals() {
        addBird()
        addFish()
        addDog()
        print(animalList)
    } */

    fun lifeCycle(days: Int) {
        addBird()
        addFish()
        addDog()
        for (i in 1..days) {
            if (animalList.size == 0) {
                print("Заповедник пуст.")
                return
            }
            else {
                for (animal in animalList) {
                    var step = Random.nextInt(1, 4)
                    when(step) {
                        1 -> animal.move()
                        2 -> animal.sleep()
                        3 -> animal.feed()
                        4 -> animal.born()
                    }
                    animalList.removeIf() {
                        if (it.isTooOld()) {
                            println("${it.name} умер.")
                        }
                        it.isTooOld()
                    }
                    // animalList.add(newBordAnimals)
                }
            }
        }
    }
}