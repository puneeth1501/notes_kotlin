
//hello world program1
fun main(){

    var name : String ="puneeth"
    println("name $name ")
    println("hello world")
    name="pohilla"
    println("$name")
    //name=5; if  i tried to print i will get an error i had
    //specified name as string so it will pop up an error.
    val name1 :String ="pohilla";
    println("$name1");
    println(name1);//i can print with out "$"sign ,if at all using a $ sign i have to keep in quotes.

    var age:Int=22;
    println(age);


    //more on integer data type
    var number :Int =10;

    //max & min  interger value

    val max_Integer_value: Int = Int.MAX_VALUE
    val min_Integer_value: Int = Int.MIN_VALUE
    println("Max Integer Value: $max_Integer_value, Min Integer Value: $min_Integer_value")

//    max and min byte value
     var a:Byte= Byte.MAX_VALUE;
    var b:Byte= Byte.MIN_VALUE;
    println("$a,$b");

    //max and min of short value
    var c:Short=Short.MAX_VALUE;
    var d:Short=Short.MIN_VALUE;
    println("$c,$d");

    //max and min for long
    var e=Long.MAX_VALUE;
    var f=Long.MIN_VALUE;
    println("$e,$f");


//    val Mynumber=28;//this is by default a integer value.
    //if i want to explicitely mention it is a byte then
    val Mynumber:Short=28;


    //float data type
     val g=2.5 //by default it is a double type
    val h:Float=2.5f;
println("$g,$h");

    val g1=2f;
    val h1=2
    println("$g1,$h1");

//    val h1:Double=2;//i will get an error its because even after explicity mentioning it is double but we have assigned a interger value.


    //char data type
    val charvalue:Char='k'
    println(charvalue);

    //boolean data type

    val booleantype:Boolean=true;
    //or
    val bool=false;
     println("$bool,$booleantype");


    //String interpolation: $

    if(false is Boolean) {
        println("yes")
    }
    var v:Char='k';

    println("${v is Char}");






}


//variable creating
var name1 : String ="puneeth"
//println("$name1") getting an error and why does it happen?




