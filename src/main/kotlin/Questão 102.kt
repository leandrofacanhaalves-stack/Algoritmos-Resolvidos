//algoritmo 102 [Lista 2 - Estrutura do Se]
//entrar com um número e imprimir uma das mensagens: maior do que 20, igual a 20 ou menor do que 20.
fun main() {
    print("Digite um número: ")
    val numero = readln().toDouble()
    if (numero > 20) {
        println("maior do que 20")
    } else {
        if (numero < 20) {
            println("menor do que 20")
        } else {
            println("igual a 20")
        }
    }
}