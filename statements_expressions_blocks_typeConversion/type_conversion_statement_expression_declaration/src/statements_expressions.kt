//fun main(args: Array<String>){
//    val a = 1000
//    val b = 999
//    var c = 1122
//    var max1 = if(a > b) a else b
//    var max2 = if(c > a) c else a
//    println("The maximum of ${a} and ${b} is $max1 " )
//    println("The maximum of ${c} and ${a} is $max2 " )
//}
//in this case if and else are not statements they are also the expressions.


fun sumOf(a:Int,b:Int): Int{
    return a+b
}

fun main(args: Array<String>){
    val a = 10
    val b = 5
    var sum = sumOf(a,b)
    var mul = a * b
    println(sum)
    println(mul)
}
//identify the expressions :
//1) line 20 which is SumOf(a,b) is an expression.
//function main is not expression its just an entry point for execution.
//fun Sumof is not an expression because it is not a single-expression fucntion.
//4)line 21 is a expression because a*b evaluates and gives a value.


