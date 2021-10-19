class Triangle: Shape("Triangle", "Yellow") {
    var base = 3.3
    var height = 9.5

    override fun computeArea(): Double {
        print("Triangle area = ")
        return (height*base) / 2
    }

    init {
        println(info())
    }
}