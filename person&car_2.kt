/*
기획서
1. 사람이 있다.
2. 사람은 이름과 나이, 구매(행위)를 할 수 있다.
3. 자동차가 있다._자동차 추상화->클래스표현
4. 자동차의 종류는 2가지(임의)로 한다.
5. 사람은 자동차를 구매할 수 있다.
6. 돈(가격)은 없다고 가정한다.
7. 한 사람은 하나의 자동차만 구매할 수 있다.
8. 사람은 여러명일 수 있다.
9. 자동차는 출발하거나 정지할 수 있다.
*/
abstract class Vehicle{//출발과 정지 기능이 있는 탈것 추상클래스
    abstract fun go()
    abstract fun stop()
}

class Car(whichCar: String): Vehicle() {
    companion object{//차의 종류를 List로 저장한다.
        val carCategory = listOf<String>("Hyundai", "Kia")//차는 두종류로 한정.
    }
    var carName:String
    var is_run=false
    init{
        carName = if(whichCar in carCategory || whichCar=="null"){
            whichCar
        } else{//차의 종류를 만족시키지 못했을 경우 null을 default로 넣는다.
            println("Wrong car name!")
            "null"
        }
    }

    override fun go(){
        if(carName=="null") {
            println("Buy a car first!")
            return
        }
        if(is_run==true){
            println("$carName is already running!")
            return
        }
        is_run=true
        println("$carName go!")
    }

    override fun stop(){
        if(carName=="null") {
            println("Buy a car first!")
            return
        }
        if (is_run==false){
            println("$carName is already stopped!")
            return
        }
        is_run=false
        println("$carName stop!")
    }
}

open class basicInformation(name: String, age: Int){
    protected var _name=name
    protected var _age=age
}

interface Purchaseable{
    fun purchase(name: String)
}

class Person constructor(name: String, age: Int): basicInformation(name, age), Purchaseable{
    var car:Car=Car("null")

    override fun purchase(name: String) {
        if(car.carName!="null"){//이미 차를 갖고있는 경우
            println("you already have a car!")
            return
        }

        if(name in Car.carCategory){//결제하려는 차종이 결제가능한 차종인디 확인.
            car=Car(name)
            println("success for purchase $name!")
        }else{
            println("fail to purchase a car! you can only buy ${Car.carCategory}")
        }
    }
}

fun main(){
    var one=Person("choi", 22)
    var two=Person("tae", 28)

    println("정상적인 접근")
    one.purchase("Kia")
    one.car.go()
    one.car.stop()

    println("\n비정상적인 접근")
    two.car.go()
    two.purchase("null")
    two.purchase("Fuck you")
    two.purchase("Hyundai")
    two.car.stop()
    two.car.go()
    two.car.go()
    two.purchase("Kia")
}