fun main()
{
    var x:Int=12;
    val y:Int=3;

    var result  =x+y;println("$result");
    println("${x+y}");
    println("${x-y}");
    println("${x*y}");
    println("${x/y}");//quotient
    println("${x%y}");//gives us the remainder of the division

    val a=2.0;
    val b=3;
    println("${a+b}");//5.0

    result=result+2;

    println("$result");

    result =result-2;
    println("$result");

    result=result*2;
    println("$result");

    result=result/2;
    println("$result");

    result=result%2;
    println("$result");

println("3+3*4=${3+3*4}");

    println("${3+3-2}")

    x=0;
    println(x++);
     var y1=0;
    println(++y1)

}