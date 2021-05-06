fun main(){
intro("Audrey",19)
    multiply()
    divide()
    modulus()
    distribute(20)
    var jina=names(arrayOf("Audrey","Jane","Dorcass","Ian"))
    println(jina)
    var person=Human("Munyiva",19,98)
    person.eat(8)
    person.speak("I love coding")
    person.birthday()

}
fun intro(name:String,age:Int){

    println("My name is $name and I am $age years old")

}
fun distribute (age:Int){
    if (age<6 ){
        println("Milk")
    }
    else if (age <15 && age>6){
        println("Fanta")
    }else{
        println("Cocacola")
    }}
fun multiply(){
    var a= 10
    var b=2
    var c= a * b
    println(c)
}
fun divide(){
    var a= 30
    var b=10
    var c= a / b
    println(c)
}
fun modulus(){
    var a= 22
    var b=7
    var c= a % b
    println(c)
}
fun names(names:Array<String>):Int{
    var counter =0
    for (name in names){
        if (name.length>4){counter +1}
    }
    return counter

}


class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        println("I am eating ${foodWeight} kgs of food")
        var humanWeight=weight+foodWeight
    }
    fun speak(speech:String){
        println("I love coding")
    }
    fun birthday(){
        var humanAge=age+1
        println(humanAge)
    }
}


