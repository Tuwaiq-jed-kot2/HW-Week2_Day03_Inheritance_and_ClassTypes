# Kotlin Essentials (Inheritance and Class types)
---
## Learning Objectives ✨
- What are Class types in the Kotlin language.
- "expression class"
- How can apply Inheritance concept in Kotlin language.
- the main purpose of data classes` is hold data.
- The most purpose of enum classes is the implementation of type-safe enums.

## Getting strated
Open the [assignment.md](assignment.md) file to get started.

fun main() {//object of Triangle class,Rectangle class,Circle class

val tri = Triangle()
val rec = Rectangle()
val cir = Circle()

println(tri.computeArea())
println(rec.computeArea())
println(cir.computeArea())

open class Shape() {  //super class
var shapeName: String = ""
var shapeColor: String = ""

      init { // initialize the properties
         name1 = "oo"
         color = "red"
      }

      fun info(name1: String, color: String): String {
         return ("$shapeColor $shapeName")
      }

      open fun computeArea(number: Double) {
      }

}
// Subclasses below (singleton classes)

class Triangle: Shape(){
var base: Double
private var height: Double

      init { //  initialize the properties
         base = 2.2
         height = 2.2
      }

      override fun computeArea(): Double { //  override the computeArea function to use it
         return ((height * base) / 2)
      }


      inner class Rectangle: Shape() { // subclass  inherits from Shape class
         var base: Double = 0.0
         var height: Double = 0.0

         init { //  initialize the properties
            width = 2.2
            height = 2.2
         }

         override fun computeArea(number: Double) { // override the computeArea fun to use it

            return height * width
         }
      }

      inner class Circle: Shape() { //(declare)
         var pi: Double
         var radius: Double

         init {
            // here I initialized the properties
            pi = 2.2
            radius = 2.2
         }

         //Circle area = pi times the radius squared (A = π*r²)
         override fun computeArea(number: Double) { // override the computeArea fun to use it

            return pi * radius.pow(2)

         }
      }
}
}
