/*-----------------------------------part1------------------------------------------*/
fun main() {

    val circle = circleShape()
    println("The circle shape info is: ${circle.info()}")
    println("The circle shape area is: ${circle.computeArea()}\n")

    val rectangle = rectangleShape()
    println("The rectangle shape info is: ${rectangle.info()}")
    println("The rectangle shape area is: ${rectangle.computeArea()}\n")

    val triangle = triangleShape()
    println("The triangle shape info is: ${triangle.info()}")
    println("The triangle shape area is: ${triangle.computeArea()}\n")


}

open class BaicShap() {// the prime class (the class will inherit the others)
    var shapeName: String
    var shapeColor: String

    init {//initialization the variables
        shapeName = ""
        shapeColor = ""
    }

    open fun info(): String {//return shape information
        var shapeName = ""
        var shapeColor = ""
        return "$shapeName , $shapeColor"
    }

    open fun computeArea(): Double {//arithmetic operation of the shape
        var area = 0.0
        return area
    }
}

class circleShape : BaicShap() {//circle shape class
    val pi: Double
    val radius: Double

    init {//initialization the variables
        pi = 3.14
        radius = 5.1
    }

    override fun computeArea(): Double {
        return (pi * (radius * radius))//arithmetic operation of the shape
    }

    override fun info(): String { //return shape information
        shapeName= "Circle"
        shapeColor="Green"
        return "$shapeName,$shapeColor"
    }
}


class rectangleShape : BaicShap() { //rectangle shape class
    var width: Double
    var height: Double

    init {//initialization the variables
        width = 5.7
        height = 2.5
    }

    override fun computeArea(): Double {
        return (height * width)//arithmetic operation of the shape
    }

    override fun info(): String { //return shape information
        shapeName= "Rectangle"
        shapeColor="Blue"
        return "$shapeName,$shapeColor"
    }
}


class triangleShape : BaicShap() { //triangle shape class
    var base: Double
    var height: Double

    init {//initialization the variables
        base = 3.2
        height = 4.1
    }

    override fun computeArea(): Double {
        return (height * base) / 2 //arithmetic operation of the shape
    }

    override fun info(): String { //return shape information
        shapeName= "Triangle"
        shapeColor="Orange"
        return "$shapeName,$shapeColor"
    }
}
/*-----------------------------------part2------------------------------------------*/
/*A1: An enum can, just like a class , have attributes and methods. The only difference is that enum constants are public,
static and final (unchangeable-cannot be overridden).
An enum cannot be used to create objects, and it cannot extend other classes
 A2:Object as Expression
 */






