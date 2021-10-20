/// [#] --> class Shape() to inheriting classes that will print names,colors <-- [#] ///
/// we need to write open keyword before the class or function or variable to make inheritable ///
// open for inheritance //
open class Shape(val shapeName: String, val shapeColor: String){

    /// [#] --> open fun to print classs name and color -->>  (#shapeName & #shapeColor) <-- [#] //
    open fun info(): String{

        /// PD8gQ2FtbGVDYXNlSXNDb29sSXNJbnQgOnhEID8 //

        ///  d2h5IHNvIHNlcmlvdXM/IDok ///

        return ("shape name is --> $shapeName , shape color is --> $shapeColor")}


    // to compute classes and return  //
    open fun computeArea(): Double {

        return 4.4
    }

}


/// this is the main fun //
fun main() {

    ///// initiete object of class triaNgle() //
    val triaNgle = triaNgle()

    ///print the overriden fun in the triaNgle class//
    println(triaNgle.computeArea())

    // initiete object of class rectAngle //
    val rectAngle = rectAngle()

    // to print the overriden function in rectangle ////
    println(rectAngle.computeArea())

    // initiete object of class circle
    val circle = Circle.Circle()
    //it will return the overriden function in Circle class
    println(circle.computeArea())

}