
/// to create class and inheriting shape ///
class rectAngle: Shape("retangle", "skyblue") {

    // initilizing //
    var width = 6.6
    var height = 4.4
    //override from shape class ////
    override fun computeArea(): Double {
        print(" rectangle")
        //return ///
        return height * width
    }

    init {
        // print inf0
        println(info())
    }
}