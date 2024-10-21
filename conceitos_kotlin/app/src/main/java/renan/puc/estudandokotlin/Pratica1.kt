package renan.puc.estudandokotlin

//Pratica de variaveis mutaveis e imutaveis e null safety
fun main(){
    var age: Int = 90
    age = 78

    val name: String = "Renan"

    val score: Int = 90
    val price: Double = 90.90
    val rate: Float = 90.90f
    val isValid: Boolean = false

    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    numbers[0] = 10

    var nullableString: String? = null

    println(nullableString?.length ?: 0)

    nullableString = "String"

    println(nullableString?.length ?: 0)

}