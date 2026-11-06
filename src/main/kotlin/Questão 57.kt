//algoritmo 57 [Lista 1 - Leia, imprima, atribuição e funções]
/** entrar com as notas da PR1 e PR2 e imprimir a média final:
* truncada:
* arredondada: */
fun main() {
    print("Digite a nota PR1: ")
    val pr1 = readln().toDouble()
    print("Digite a nota PR2: ")
    val pr2 = readln().toDouble()
    val media = (pr1 + pr2) / 2
    println("media truncada: ${media.toInt()}")
    println("media arredondada: ${Math.round(media)}")
}