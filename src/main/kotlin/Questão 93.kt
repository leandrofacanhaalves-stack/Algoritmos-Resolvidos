//algoritmo 93 [Lista 2 - Estrutura do Se]
/* entrar com um número e imprimir a raiz quadrada do número caso ele seja positivo e o
quadrado do número caso ele seja negativo. */
fun main() {
    print("Digite um número: ")
    val numero = readln().toDouble()
    if (numero > 0) {
        println("raiz quadrada: ${Math.sqrt(numero)}")
    } else {
        if (numero < 0) {
            println("quadrado: ${numero * numero}")
        }
    }
}