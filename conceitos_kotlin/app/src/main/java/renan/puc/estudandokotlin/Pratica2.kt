package renan.puc.estudandokotlin

// data class é uma classe apenas de dados
data class Pessoa(val nome: String, val idade: Int)

fun main (){
    val pessoas: Array<Pessoa> = arrayOf(
        Pessoa("Renan Sá Cavalcante", 29),
        Pessoa("Bob Sampaio Correia", 21),
        Pessoa("Alice de Oliveira Paiva", 33),
        Pessoa("João de Almeida",45),
        Pessoa("Eva Campos Neto", 52)
    );

    //Filtrar pessoas com idade maior que 25
    val pessoasFiltradas = pessoas.filter { it.idade > 25 }
    println("Pessoas com idade maior que 25: $pessoasFiltradas");

    // Mapear apenas os nomes das pessoas
    val nomesPessoas = pessoas.map { it.nome }
    println("Nomes das pessoas: $nomesPessoas");

    // Verificar se todas as pessoas tem idade maior que 20 anos
    val todasMaioresDe20 = pessoas.all { it.idade > 20 }
    println("Todas as pessoas são maiores que 20 anos? $todasMaioresDe20");

    // Encontrar a primeira pessoa com a idade menor que 30
    val primeiraMenorQue30 = pessoas.find { it.idade < 30 }
    println("Primeira pessoa com idade menor que 30: $primeiraMenorQue30");

    // Ordenar as pessoas por idade
    val pessoasOrdenadas = pessoas.sortedBy { it.idade }
    println("Pessoas ordenadas por idade: $pessoasOrdenadas");

    // Existe alguém chamada Alice?
    val existeAlice = pessoas.any { it.nome.contains("Alice") }
    println("Existe alguém chamado Alice? $existeAlice");

    // Quantas pessoas tem idade maior que 30?
    val quantidadePessoas30 = pessoas.count { it.idade > 30 }
    println("Quantidade de pessoas com idade maior que 30? $quantidadePessoas30");

    // Imprimir essa lista com uma string separada por vírgula
    val nomesPessoasString = pessoas.joinToString(", ") { it.nome }
    println("Nomes das pessoas em uma string separada por vírgula: $nomesPessoasString");

    // Ordenar as pessoas por idade em ordem crescente e imprimir apenas o primeiro nome de cada uma delas
    val primeiroNomeOrdenado = pessoas.sortedBy { it.idade }.map { it.nome.split(" ")[0] }
    println("Primeiro nome das pessoas ordenadas por idade: $primeiroNomeOrdenado");

}
