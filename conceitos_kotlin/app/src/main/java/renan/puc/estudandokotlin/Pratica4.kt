package renan.puc.estudandokotlin

//Controle de fluxo
fun main() {

    val diaDaSemana = 1

    val nomeDiaDaSemana = when (diaDaSemana) {
        1->"Domingo"
        2->"Segunda-feira"
        3->"Terça-feira"
        4->"Quarta-feira"
        5->"Quinta-feira"
        6->"Sexta-feira"
        else -> "Sábado"
    }

    // Imprimir o dia de hoje
    println("Hoje é $nomeDiaDaSemana")

    var contador = 0
    while (contador < 6) {
        println("Contador: $contador")
        contador++
    }

    val lista = listOf("Maça", "Uva", "Pera", "Banana", "Laranja", "Melão");

    for (fruta in lista) {
        println("Fruta: $fruta")
    }

    fazerLogin("admin", "senha123");
    fazerLogin("admin1", "senha");

}

fun fazerLogin(usuario: String, senha: String){
    if (usuario == "admin" && senha == "senha123"){
        println("Login realizado com sucesso")
    }else{
        println("Login falhou")
    }
}