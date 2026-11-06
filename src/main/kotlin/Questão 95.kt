//algoritmo 95 [Lista 2 - Estrutura do Se]
//entrar com um número e informar se ele é ou não divisível por 5.
fun main() {
    print("Digite um número: ")
    val numero = readln().toInt()
    if (numero % 5 == 0) {
        println("é divisível por 5")
    } else {
        println("não é divisível por 5")
    }
}