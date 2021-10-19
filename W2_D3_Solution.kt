//Part I

fun main() {

    val rec = Rectangle()
    println(rec.computeArea())

    val circle = Circle()
    println(circle.computeArea())

    val tri = Triangle()
    println(tri.computeArea())

}

open class Shape(var shapeName: String, var shapeColor: String){

    open fun info(): String{
        return "Shape name is: $shapeName, shape color is: $shapeColor"

    }

    open fun computeArea(): Double {

        return 0.0
    }

}




//Part II

//- What is the difference between `enum classes` and `data classes`?
// -enum classes are data types that hold a set of constants - data classes are used to hold data (var / val)
//- Which one of the `object` keyword ways can be used for the inheritance concept?
// -Object as an expression