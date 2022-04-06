fun main(){
oddNumbers()
robot(16)
    numberPrint()
println(numberofNames(arrayOf("Happiness","Gesare", "James","road")))
}
fun oddNumbers(){
    for(num in 1..100)
        if ((num%2) !=0){
            println(num)
        }
}
fun numberofNames(name: Array<String>): Int{
    var addition = 0
   name.forEach { x->
       if (x.length<=5){
         addition++
       }
   }
    return addition
}
fun robot(age: Int){

    if (age<=6){
        println("milk")
    }
    else if (age>=6 && age<=15) {
println("fanta orange")
    }
    else{
      println("coca cola")
    }
}
fun numberPrint(){
    for (number in 1..100)
        if (number%3==0 && number%5==0){
            println("FizzBuzz")
        }
    else if (number%3==0){
        println("Fizz")
    }
    else if( number%5==0){
        println("Buzz")
    }
    else if (number%3 !=0 && number%5 !=0){
        println(number)
    }
}


