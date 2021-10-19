fun main() {
    val shape1 = Shape()  //creating object shape1 from class Shape
    val tri1 = Triangle() //creating object tri1 from class Triangle
    val rec1 = Rectangle() //creating object rec1 from class Rectangle
    val cir1 = Circle() //creating object cir1 from class Circle

    println(tri1.info())  //print info function for triangle
    println(rec1.info())  //print info function for rectangle
    println(cir1.info())  //print info function for circle

    println("The Area of Triangle = " + tri1.computeArea(4.0, 4.0)) //send values to computeArea function for triangle
    println("The Area of Rectangle = " + rec1.computeArea(4.0, 4.0)) //send values to computeArea function for Rectangle
    println("The Area of Circle = " + cir1.computeArea(4.0)) //send values to computeArea function for Circle
}


open class Shape {     //defining super Class

    open val shapeName = ""  // variable for shape name
    open val shapeColor = ""  // variable for shape name
    open var result: Double = 0.0  // variable for area result
    fun info(): String {  // defining info function
        return "Shape Name: $shapeName\nShape Color: $shapeColor"  //return the name and color for shape
    }

    open fun computeArea(): Double { // defining computeArea Function
        val num1: Double = 0.0  // variable for num1
        val num2: Double = 0.0  // variable for num2
        var result: Double = 0.0  // variable for area result
        return result  // return the area result
    }

}


class Triangle() : Shape() {  //defining sub Class

    override val shapeName = "Triangle" // override variable for shape name
    override val shapeColor = "Yellow" // override variable for shape color

    fun computeArea(height: Double, base: Double): Double { // defining computeArea Function
        result = (height * base) / 2  // compute Area for triangle
        return result   // return the triangle area
    }

}

class Rectangle() : Shape() {  //defining sub Class

    override val shapeName = "Rectangle" // override variable for shape name
    override val shapeColor = "Blue" // override variable for shape color

    fun computeArea(height: Double, width: Double): Double {  // defining computeArea Function
        result = (height * width) // compute Area for rectangle
        return result  // return the rectangle area
    }

}

class Circle() : Shape() {  //defining sub Class

    override val shapeName = "Circle"  // override variable for shape name
    override val shapeColor = "Green" // override variable for shape color

    fun computeArea(radius: Double): Double { // defining computeArea Function
        val pi = Math.PI  // variable for Pi value 3.14....
        result = pi * radius * radius // compute Area for Circle
        return result  // return the circle area
    }
}


/*
Part 2
Q1:
Enum class : holds a set of constants ,
data class : similar to normal class, but it has more useful functions like toString , equals , copy

Q2:
Object as Expression

 */