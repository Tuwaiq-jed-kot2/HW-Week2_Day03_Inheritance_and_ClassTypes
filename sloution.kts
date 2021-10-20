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

/*
update: 

this shape function is open so we can use inheritance and the  class have 3  variable for shape name , color , result
open variable used to change the values for name and color val variable , for the result i was just trying to check if its will work

info function will return the shape name and shape color for the class when its called from other class
computea area will computea area when its called form other class


*/
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

    override val shapeName = "Triangle" // override is used to change value of val variable for shape name and shape color
    override val shapeColor = "Yellow" 

    fun computeArea(height: Double, base: Double): Double { // defining computeArea Function
        result = (height * base) / 2  // compute Area for triangle
        return result   // return the triangle area
    }

}

class Rectangle() : Shape() {  //defining sub Class

    override val shapeName = "Rectangle" // override is used to change value of val variable for shape name and shape color
    override val shapeColor = "Blue" 
    
    fun computeArea(height: Double, width: Double): Double {  // defining computeArea Function
        result = (height * width) // compute Area for rectangle
        return result  // return the rectangle area
    }

}

class Circle() : Shape() {  //defining sub Class

    override val shapeName = "Circle"  // override is used to change value of val variable for shape name and shape color
    override val shapeColor = "Green" 

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
