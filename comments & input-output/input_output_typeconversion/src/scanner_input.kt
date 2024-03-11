import java.util.Scanner;
fun main(){
    println("enter an interger");
    var interger_value =Scanner(System.`in`)//imagine this like scanner sc= new scanner(System.in )and because of backtick near system.in for kotlin.
    var value=interger_value.nextInt();

    println("the entered interger is $value");
    println("enter an character ")
    val str= readLine();
    println("$str");

    //If the user provides input, str will contain the input string; otherwise, it will be null. Your code doesn't explicitly handle exceptions because readLine() itself doesn't throw exceptions if no input is provided.


}