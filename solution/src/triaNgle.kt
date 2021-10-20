
// [#] --> to create class and inheriting Shape() <-- [#} //
class triaNgle: Shape("triaNgle", "skyblue") { // --> U2t5Qmx1ZUlzTWFGYXY=  <--- //

    //// initilizing #base  ///
    val base = 6.3

    // initilizing --> hight///
    val height = 4.3


    // overriding computeArea() fun from Shape class  ///
    override fun computeArea(): Double {
        print("tring")

        /// to return the (height ,base) ///
        return height*base / 2
    }

    init {
        // print ///
        println(info())
    }
} 