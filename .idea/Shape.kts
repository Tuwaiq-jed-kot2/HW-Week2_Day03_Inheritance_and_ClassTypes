open class Shape { //السوبر كلاس
    var shapeName:String=""
    var shapeColor:String=""
    open var crPi=3.14 // كتبتها في الكلاس السوبر لانها ثابته وحيكون اسهل في الاستخدام في الكلاسات

    //هنا كان المطلوب نرجع الاسم واللون فقط بدون اي استخدام اخر للدالة
    fun info():String{
        return "$shapeName and $shapeColor"
    }

    //خليتها اوبن لانها سيتم توريثها لجميع الكلاسات مع التغيير
    open fun computeArea():Double{
        return 0.0
    }
}

//حتكون كل السب الكلاسس في فايل واحد 
class Triangle(): Shape(){
    var triHeight:Double=3.9
    var triBase:Double=4.0
    // في دا الكلاس عرفت متغيرين خاصين بالكلاس والدالة اوفر رايد مع تغيير القانون
    override fun computeArea(): Double {
        return (triBase * triHeight) / 2
    }
}
//الكلاس يرث من كلاس السوبر واضفتلها متغيرات خاصة بيها مع تغيير دالة حساب المساحة
class Rectangle() :Shape(){
    var recHeight:Double=5.4
    var recWidth:Double=2.4

    override fun computeArea(): Double {
        return recHeight * recWidth
    }
}
// هنا سويت اوفر رايد للمتغير باي فقط لانها قيمة ثابتة وايضا غيرت من دالة الحساب
class Circle():Shape(){
    var crRadius:Double=10.5
    override var crPi: Double
        get() = super.crPi// هنا حيجبلي نفس اقيمة اللي موجودة في الككلاس السوبر
        set(value) {}// هنا ماعرفت ايش فايدة الفاليو اذا مسحتها تعطيني ايرور فسبتها زي ماهيا

    override fun computeArea(): Double {
        return crPi * (crRadius * crRadius)
    }
}

// عرفت متغير لكل كلاس وطلبت طباعة للمتغير لانو جميع القيم في الكلاسات بدون امر طباعة فقط ترجيع قيم
fun main(){
    val c1= Circle()
    val t1= Triangle()
    val r1= Rectangle()
    println("the area of circle is= ${c1.computeArea()} cm" )
    println("the area of triangle is= ${t1.computeArea()} cm ")
    println("the area of circle is= ${r1.computeArea()} cm")
}