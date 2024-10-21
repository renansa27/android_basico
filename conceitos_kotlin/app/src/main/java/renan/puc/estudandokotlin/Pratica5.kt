package renan.puc.estudandokotlin

interface Alimentavel {
    fun comer();
}

abstract class Animal(
    public val nome: String
): Alimentavel {
    abstract fun emitirSom();
}

class Cachorro(nome: String): Animal(nome) {
    override fun emitirSom() {
        println("$nome diz: Au au");
    }

    override fun comer() {
        println("$nome está comendo");
    }

    fun passear() {
        println("$nome está passeando");
    }
}

class Gato(nome: String): Animal(nome) {
    override fun emitirSom() {
        println("$nome diz: Miau");
    }
    override fun comer() {
        println("$nome está comendo");
    }
}

fun main(){
    val cachorro = Cachorro("Bob");
    cachorro.passear();
    cachorro.emitirSom();
    cachorro.comer();

    val gato = Gato("Garfield");
    gato.comer();
    gato.emitirSom();
}