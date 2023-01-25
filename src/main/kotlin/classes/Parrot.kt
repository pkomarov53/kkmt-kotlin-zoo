package classes

class Parrot(type: String,
            name: String,
            height: Double,
            weight: Double,
            habitat: String
) : Herbivores(type, name, height, weight, habitat) {

    override fun sleep() = println("$type $name решил поспать")

    override fun eat() = println("$type $name кушает побеги растений")

    override fun move() = println("$type $name летит")

    fun look() = println("$type $name осматривается")

    fun hide() = println("$type $name прячется")

    override fun info(): String { return "\t${sleep()}\t${eat()}\t${move()}\t${look()}\t${hide()}"}
}