//algoritmo 45 [Lista 1 - Leia, imprima, atribuição e funções]
/** entrar com um número e imprimir a seguinte saída:
 * numero:
 * quadrado:
 * raiz quadrada: */
fun main() {
    print("Digite o número: ")
    val num = readln().toDouble()
    val quad = num * num
    val raiz = Math.sqrt(num)
    println("numero: $num")
    println("quadrado: $quad")
    println("raiz quadrada: $raiz")
}