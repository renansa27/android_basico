package renan.puc.calculadoralib

class Calculadora {
    /*
    ** Companion Object **
    *
    No Kotlin, o companion object é uma maneira de declarar membros que pertencem a uma classe, mas que podem ser acessados de maneira estática (ou seja, sem a necessidade de instanciar a classe).
    Ele permite que funções, constantes e propriedades sejam associadas a uma classe como um todo, em vez de a uma instância específica da classe.

    * */
    companion object {
        fun soma(a: Double, b: Double): Double {
            return a + b
        }

        fun subtracao(a: Double, b: Double): Double {
            return a - b
        }

        fun multiplicacao(a: Double, b: Double): Double {
            return a * b
        }

        fun divisao(a: Double, b: Double): Double {
            return a / b
        }
    }
}