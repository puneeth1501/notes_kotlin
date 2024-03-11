fun main(args: Array<String>)
{

    println("259 to byte: " + (259.toByte()))//overflow
    println("50000 to short: " + (50000.toShort()))
    println("21474847499 to Int: " + (21474847499.toInt()))
    println("10L to Int: " + (10L.toInt()))
    println("22.54 to Int: " + (22.54.toInt()))
    println("22 to float: " + (22.toFloat()))
    println("65 to char: " + (65.toChar()))
    //Char to Number is deprecated in kotlin
    println("A to Int: " + ('A'.toInt()))

    //input is string lets try to convert to interger
    //my answer is it can not be converted because it is not a valid representation of integer type.

    var str="puneeth"
    var value=str.toInt();
    print(value);


}
