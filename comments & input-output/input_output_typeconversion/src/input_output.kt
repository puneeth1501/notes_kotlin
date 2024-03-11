fun main( args: Array<String>){
//    val input= readLine();//The readLine() function helps us take an input of only String data type.
//    print("enter an interger");
//    var interger_value=input.toInt()
//    println("the value of interger_value is $interger_value");


    //the above program gives me an error and its because we are not handling the null pointer exception in line 4
    //the below code works well.


        print("Enter an integer: ")
        val input = readLine()
        if (input != null) {
            val integerValue = input.toIntOrNull()
            if (integerValue != null) {
                println("The value of integer value is $integerValue")
            } else {
                println("Invalid input. Please enter a valid integer.")
            }
        } else {
            println("No input provided.")
        }
//The error you're encountering with input.toInt() is likely due to the fact that readLine() returns a nullable String?, meaning it could be null. In Kotlin, you cannot directly call methods on nullable types because it might result in a NullPointerException at runtime if the value is actually null.
//
//To resolve this issue, you should handle the nullable String? returned by readLine() appropriately. One way to handle this is by using the safe call operator ?. and providing a default value if the input is null.

    //In this modified version, toIntOrNull() attempts to convert the string to an integer. It returns null if the string is not a valid representation of an integer. This approach handles both the possibility of the input being null and the input not being a valid integer.


}