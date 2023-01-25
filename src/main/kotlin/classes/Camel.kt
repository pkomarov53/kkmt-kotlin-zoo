package classes

class Camel(type: String,
            name: String,
            height: Double,
            weight: Double,
            habitat: String
) : Herbivores(type, name, height, weight, habitat) {

    override fun sleep() = println("$type $name решил поспать")

    override fun eat() = println("$type $name кушает траву")

    override fun move() = println("$type $name идёт")

    fun spit() = println("$type $name плюётся")

    fun water() = println("$type $name в поисках воды")

    override fun info(): String {
        return "\t${sleep()}\t${eat()}\t${move()}\t$\t${spit()}\t${water()}"
    }
}