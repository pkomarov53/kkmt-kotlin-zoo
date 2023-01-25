package classes

class Lion(type: String,
           name: String,
           height: Double,
           weight: Double,
           habitat: String
) : Carnivores(type, name, height, weight, habitat) {

    override fun sleep() = println("$type $name пошел спать")

    override fun eat() = println("$type $name захотел покушать")

    override fun move() = println("$type $name захотел побегать")

    fun roar() = println("$type $name издаёт рык")

    fun hunt() = println("$type $name вышел на охоту")

    override fun info(): String {
        return "\t${sleep()}\t${eat()}\t${move()}\t${roar()}\t${hunt()}"
    }
}