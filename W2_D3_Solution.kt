//Part I

fun main() {

    val rec = Rectangle() //delcare object of class Rectangle()
    println(rec.computeArea())  //print the overriden function in Rectangle() class

    val circle = Circle() // delcare object of class Circle()
    println(circle.computeArea()) //print the overriden function in Circle() class

    val tri = Triangle() // delcare object of class Triangle()
    println(tri.computeArea()) //print the overriden function in Triangle() class

}

open class Shape(var shapeName: String, var shapeColor: String){ //open class Shape() to allow override, parameters are to allow inheriting classes to print thier own names & colors

    open fun info(): String{ //open fun() to print each class's name and color
        return "Shape name is: $shapeName, shape color is: $shapeColor"

    }

    open fun computeArea(): Double { //open fun() to compute each class's area

        return 0.0
    }

}




//Part II

//- What is the difference between `enum classes` and `data classes`?
// -enum classes are data types that hold a set of constants - data classes are used to hold data (var / val)
//- Which one of the `object` keyword ways can be used for the inheritance concept?
// -Object as an expression