//algoritmo 58 [Lista 1 - Leia, imprima, atribuição e funções]
/* entrar com valores para xnum1, xnum2 e xnum3 e imprimir o valor de x, sabendo-se que:
x = xnum1 + xnum2 / (xnum3 + xnum1) + 2 * (xnum1 - xnum2) + log₂(64)
Obs: a fórmula do PDF veio ilegível na digitalização; esta forma foi reconstruída a partir
da solução do próprio livro, que usa log(64)/log(2). */
fun main() {
    print("Digite o xnum1: ")
    val xnum1 = readln().toDouble()
    print("Digite o xnum2: ")
    val xnum2 = readln().toDouble()
    print("Digite o xnum3: ")
    val xnum3 = readln().toDouble()
    val x = xnum1 + xnum2 / (xnum3 + xnum1) + 2 * (xnum1 - xnum2) + Math.log(64.0) / Math.log(2.0)
    println("x = $x")
}