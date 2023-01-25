package classes

open class Animal (val type: String,
                   val name: String,
                   var height: Double,
                   var weight: Double,
                   var habitat: String
) {

    open fun sleep() {
        println("$name пошел/ла спать")
    }
    open fun eat() {
        println("$name пошел/ла кушать")
    }

    open fun move() {
        println("$name пошел/ла гулять")
    }

    open fun info(): String {
        return "\t${sleep()}\t${eat()}\t${move()}"
    }
}