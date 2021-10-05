import kotlin.math.pow //used in calculate circle

open class Shape { //define the class shape

    open val shapeName ="" //declare open variable shapeName to override in subclass
    open val shapeColor ="" //declare open variable shapeColor to override in subclass
    open var shapeArea:Double=0.0 //declare open variable shapeArea to override in subclass


    fun info(){//declare new function to print the info for shape
        println("$shapeName, $shapeColor") //to print statement that required
    }//end the function

    open fun computeArea():Double{//declare open function to override in other class
        return shapeArea //return double as required
    }//end function

}//end super class Shape

class Triangle:Shape(){ //define another class called Triangle and inherent from shape super class

    val color = readLine()!!//to specific the color of shpe
    override val shapeName:String = "Triangle"//to edit the shape name
    override val shapeColor: String = color//to assign the color


    override fun computeArea(): Double { //edit function that defend in the super class to compute the area of triangle
        super.computeArea() //to print the statement
        val base= readLine()!!.toDouble() //define variable to calculate the area for triangle
        val height= readLine()!!.toDouble()  //define variable to calculate the area for triangle
        shapeArea= (height*base)/2 //to calculate triangle the
        return shapeArea
    }

}

class Rectangle:Shape(){ //define another class called rectangle and inherent from shape super class

    val color = readLine()!!//to specific the color of shpe
    override val shapeName:String = "Rectangle"//to edit the shape name
    override val shapeColor: String = color//to assign the color

    override fun computeArea(): Double {//edit function that defend in the super class to compute the area of rectangle
        super.computeArea() //to print the statement define in the function super class Shape
        println("Enter the width of rectangle")//just print line
        val width = readLine()!!.toDouble() //define variable to calculate the area for rectangle
        println("Enter the height of rectangle")//just print line
        val height = readLine()!!.toDouble() //define variable to calculate the area for rectangle
        shapeArea= width *height //calculate the area and store the value in shape area
        return shapeArea//return result
    }

}//end class rectangle inherent form shape super class

class Circle:Shape(){//begin the class circle inherent from shape class
val color = readLine()!!//to specific the color of shpe
    val pi=3.14 //the pi is known

    override val shapeName:String = "circle"//to edit the shape name
    override val shapeColor: String = color//to assign the color

    override fun computeArea(): Double {//to calculate the specified area for circle
        println("Enter the radius of circle")//just print line
        val radius= readLine()!!.toDouble()//entries by user variable
        super.computeArea()//to print the statement in super class
        shapeArea = pi* radius.pow(2)//to calculate the shape of area
        return shapeArea //to return the value for area
    }//end the function computeArea
}//end class circle

fun main(){ //to show result of the classes

    println("Enter C to calculate the circle area, R for calculate the rectangle area, and T to ") //to choose the shape want to calculate the area for
    val selectedShape = readLine() //to user enter
    if (selectedShape=="C"&&selectedShape=="c"){ //for circle selected
        println("Enter the color of circle shape") //print just to known what the entered
        val circleShape = Circle() //instant object from class circle
        circleShape.info() //call to print the info for shape selected
        println(circleShape.computeArea()) //to calculated the area
    }else if(selectedShape=="R" && selectedShape=="r"){ // if user select the rectangle shape
        println("Enter the color of rectangle shape") // just print to know used what the entered
        val rectShape = Rectangle() //objet form rectangle class
        rectShape.info() //to print info shape
        println(rectShape.computeArea()) //to calculate the area
    }else if (selectedShape=="T" && selectedShape =="t"){ //when the user choose the tringle shape
        println("Enter the color of triangle shape")//just print
        val traingleShape = Triangle()//instet object form triangle class
        traingleShape.info() //print info for shape
        println(traingleShape.computeArea())//compute the area of traingle
    }else
        println("the entered is invalid input") //print if the user not enter C or T or R
}//end the main function