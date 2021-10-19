class Rectangle: Shape("Rectangle", "Green") {

    var width = 5.5
    var height = 3.3

    override fun computeArea(): Double {
        print("Rectangle area = ")
        return height * width
    }

    init {
        println(info())
    }
}