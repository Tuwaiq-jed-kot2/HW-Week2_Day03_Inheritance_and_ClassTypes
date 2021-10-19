class Rectangle: Shape("Rectangle", "Green") { //creating class and inheriting Shape()

    var width = 5.5 //initilizing width
    var height = 3.3 //initilizing height

    override fun computeArea(): Double { //overriding the computeArea() fun from class Shape()
        print("Rectangle area = ")
        return height * width //return the specific area equation for this class
    }

    init {
        println(info()) //print the info() method that takes "Rectangle" and "green" as parameters
    }
}