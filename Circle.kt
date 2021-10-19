import kotlin.math.PI
import kotlin.math.pow

class Circle: Shape("Circle", "Blue") {
    var radius = 9.5

    override fun computeArea(): Double {
        print("Circle area = ")
        return PI * (radius.pow(2))
    }

    init {
        println(info())
    }
}