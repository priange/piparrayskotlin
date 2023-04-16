fun main() {
    println(give(arrayOf(2,16,76,8,10)))

    var all=Write(13,2)
all.let()

    var taken=Take(32,4,18,20)
    City()
 println( named(arrayOf("Omara","Emmanuel","Anabo")))

nums()


//    fun come(){
        var txt1=4
        var txt2=2
        println(txt1.compareTo(txt2))
    }
//}

//2. Write and invoke one function that takes in an array of integers and returns
//these 3 values: smallest, largest and average of all the elements (7 pts)
fun give(numbers:Array<Int>) {
    var all = arrayOf(numbers)
    var smallest = numbers.min()
    println(smallest)
    var biggest = numbers.max()
    println(biggest)
    var averaged=numbers.average()
    println(averaged)


}
    //5. Create a calculator class that is capable of the following functions:
    class Write(var num1: Int,var num2: Int) {
        fun let() {
            //(i) Addition of any 2 numbers
            var addition = num1 + num2
             println(addition)

//(ii) Subtraction between any 2 numbers
            var subtraction = num1 - num2
            println(subtraction)

//(iii) Accurate division between any 2 numbers
            var division=num1/num2
            println(division)

//(iv) Multiplication of any 2 numbers
            var multiplied=num1*num2
            println(multiplied)

//Instantiate your calculator object and invoke all its functions
        }
    }
//    Assignment 4: Arrays
//    1. Create a function that takes in 4 strings and creates an array out of them then
//            prints out the array (2 points)
fun Take(num1: Int,num2: Int,num3:Int,num4:Int){
    var now= arrayOf(num1,num2,num3,num4)
    println(now.contentToString())
}

//    2. Create a function that given an array below:
//    var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//    prints out the names of the cities in the correct grammatical case. (2 points)
fun City(){
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
 println( cities.map { it.capitalize() })
    }


//    3. Create one function that given the below array:
//    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//    (i) prints out the sum of the second and fifth elements (1 point)
fun nums(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers[1]+numbers[4])

println(numbers.indexOf(158))
    println(numbers.sort())
}



//    (ii) prints out the index of 158 (1 poin

//    (iii) prints out the elements in ascending order (2 point



//    4. Create a function that takes in 3 names and returns a string array containing
//            all 3 names.
fun named(name:Array<String>):String{
   return (name.contentToString())

}

