import kotlin.math.PI
import kotlin.math.pow

class Circle: Shape("Circle", "Blue") { //creating class and inheriting Shape()
    var radius = 9.5 // initilizing radius

    override fun computeArea(): Double { //overriding the computeArea() fun from class Shape()
        print("Circle area = ")
        return PI * (radius.pow(2)) //return the specific area equation for this class
    }

    init {
        println(info()) //print the info() method that takes "Circle" and "Blue" as parameters
    }
}