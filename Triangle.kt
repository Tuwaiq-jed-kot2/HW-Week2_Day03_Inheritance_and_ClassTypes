class Triangle: Shape("Triangle", "Yellow") { //creating class and inheriting Shape()
    var base = 3.3 // initilizing base
    var height = 9.5 // initilizing height

    override fun computeArea(): Double { //overriding the computeArea() fun from class Shape()
        print("Triangle area = ")
        return (height*base) / 2 //return the specific area equation for this class
    }

    init {
        println(info()) //print the info() method that takes "Triangle" and "Yelloe" as parameters
    }
}