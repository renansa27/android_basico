package renan.puc.estudandokotlin

fun main(){
    val number: Int = 10
    val number2: Int = 20

    println("Soma: ${sum(number, number2)}");
    println("Multiplicação: ${multiply(number, number2)}");

    val sum2 = { a: Int, b: Int -> a + b }
    println("Soma 2: ${sum2(number, number2)}");

}

fun sum(a: Int, b: Int): Int{
    return a + b;
}

fun multiply(a: Int, b: Int) = a * b