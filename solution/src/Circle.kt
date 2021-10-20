import java.lang.Math.PI
import kotlin.math.pow

class Circle {

    /////--> [#} to create class and inheriting Shape <---[#] ///
    class Circle: Shape("circle", "skyblue") {
        // initilizing radius
        var radius = 2.2

        ///// overriding the computeArea fun from shape class, to change the default behaviour  ////
        override fun computeArea(): Double {
            print("circle")

            //////return ///
            return PI * (radius.pow(2))
        }

        init {
            /// print inf0 ///
            println(info())
        }
    }
}