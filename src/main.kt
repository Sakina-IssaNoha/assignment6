fun main(){
    var statement= Human("Siama",23,51)
    statement.eat(1)
    println(statement.weight)
    speak("am I audible enough?")
    birthday(20)
var dets= User("Ali","Moha","is@gmail","0742600246",904480)
    println(dets.firstname)
    println(dets.email)
}

class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight: Int){
        var x = 1
        weight+=foodWeight
        println("I am eating $x kgs of food")
    }
     }

fun speak(speech:String){
    println(speech)
}

fun birthday(age: Int){
    var y = 1
   y+=age
    println(y)
}

data class User(var firstname:String,var lastname:String,var email:String,var phoneNum:String,var password:Int)

