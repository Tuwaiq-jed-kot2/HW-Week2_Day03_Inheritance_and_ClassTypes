import kotlin.math.PI
import kotlin.math.pow

open class Shape{ //Super class

    // this is the two properties (declare)
    var shapeName: String

    var shapeColor: String

    init {
        // here I initialized the properties
        shapeName = ""

        shapeColor = ""

    }

    // create the first function that have 2 input as string and return string
    fun info(name: String, color: String):String{

        return "This shape is $name and the color of this shape is $color"
    }

    // create second function and make it open so the subclasses can overriding this function
    open fun computeArea():Double{
        return 0.0
    }

}


class Triangle: Shape(){ // the subclass that inherits from Shape class
    // this is the two properties (declare)
    var base : Double

    private var height : Double


    init {
        // here I initialized the properties
        base = 9.8

        height = 12.4
    }


    override fun computeArea(): Double { // I override the computeArea function,so I can chang the body of the function

        return ((height * base)/2)


    }




}


class Rectangle: Shape(){ //the subclass that inherits from Shape class
    // this is the two properties (declare)
    var width : Double

    private var height : Double


    init {
        // here I initialized the properties
        width = 12.9

        height = 15.7

    }


    override fun computeArea(): Double { // I override the computeArea function,so I can chang the body of the function

        return height * width

    }




}


class Circle: Shape(){ //the subclass that inherits from Shape class
    // this is the two properties (declare)
    var pi : Double

    var radius : Double


    init {
        // here I initialized the properties
        pi = PI

        radius = 4.0

    }

    override fun computeArea(): Double { // I override the computeArea function,so I can chang the body of the function

        return pi * radius.pow(2)

    }


}


fun main() {


    val tri = Triangle() //object for Triangle class

    val rec = Rectangle() //object for Rectangle class

    val cir = Circle()  //object for Circle class


    println(tri.computeArea())

    println(rec.computeArea())

    println(cir.computeArea())


}