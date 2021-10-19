import kotlin.math.pow

//## Part I - Practice with Inheritance.

fun main() {
    //creating a Shape object
    val s = Shape("Cricle", "white")
    //printing the object info
    s.info()
    println()

    val t = Triangle("Triangle", "Yellow",10.0, 13.0)
    //printing the object info
    t.info()
    //printing the object computeArea
    println(t.computeArea())
    println()

    val c = Circle("Circle", "red",20.0)
    //printing the object info
    c.info()
    //printing the object computeArea
    println(c.computeArea())
    println()

    val r = Rectangle("Rectangle", "Blue",10.0, 10.0)
    //printing the object info
    r.info()
    //printing the object computeArea
    println(r.computeArea())
    println()
}
//Declaring the parent class 'Shape' with a primary constructor have both shapeName and shapeColor variables
open class Shape(private val shapeName: String, private val shapeColor: String){

    //Declaring the function 'info()' that will be used to print the Shape's object info
    fun info(){
        //Printing the shape info 'name and color'
        println("Shape Name: $shapeName \nShape Color: $shapeColor")
    }

    //Declaring the function 'computeArea()'
    open fun computeArea(): Double{
        //returning 0.0 because Shape doesn't have Double variables
        return 0.0
    }
}

//Declaring the subclass Triangle with a primary constructor that has shapeName, shapeColor, base and hight
//then using the parent class Shape primary constructor to set the name and color
class Triangle(private val shapeName: String, private val shapeColor: String, private val base: Double, private val height: Double)
    : Shape(shapeName, shapeColor){

    //overriding computeArea to use the triangle's formula
    override fun computeArea(): Double {
        val area = (height * base) / 2
        return area
    }
}

//Declaring the subclass Triangle with a primary constructor that has shapeName, shapeColor, base and hight
//then using the parent class Shape primary constructor to set the name and color
class Rectangle(private val shapeName: String, private val shapeColor: String, private val width: Double, private val height: Double)
    : Shape(shapeName, shapeColor){

    //overriding computeArea to use the rectangle's formula
    override fun computeArea(): Double {
        //declaring an area variable that holds the result
        val area = height * width
        return area
    }
}

//Declaring the subclass Triangle with a primary constructor that has shapeName, shapeColor, base and hight
//then using the parent class Shape primary constructor to set the name and color
class Circle(private val shapeName: String, private val shapeColor: String, private val radius: Double)
    : Shape(shapeName, shapeColor){

    //since pi value is known
    val pi = 3.14

    //overriding computeArea to use the circle's formula
    override fun computeArea(): Double {
        //declaring an area variable that holds the result
        val area = pi * radius.pow(2)
        return area
    }
}