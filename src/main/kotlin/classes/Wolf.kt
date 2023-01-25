package classes

class Wolf(type: String,
           name: String,
           height: Double,
           weight: Double,
           habitat: String
) : Carnivores(type, name, height, weight, habitat) {

    override fun sleep() = println("$type $name решил поспать")

    override fun eat() = println("$type $name захотел покушать")

    override fun move() = println("$type $name решил побегать со стаей")

    fun think() = println("$type $name о чем-то задумался")

    fun howl() = println("$type $name воет на луну")

    override fun info(): String {
        return "\t${sleep()}\t${eat()}\t${move()}\t${think()}\t${howl()}"
    }
}