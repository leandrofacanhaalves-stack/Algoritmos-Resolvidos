//algoritmo 116 [Lista 2 - Estrutura do Se]
/* entrar com três números e imprimir o maior número (suponha números diferentes).
Solução nº 1: ses aninhados. Solução nº 2: um único se com && no primeiro teste. */
fun main() {
    print("Digite o 1º número: ")
    val a = readln().toDouble()
    print("Digite o 2º número: ")
    val b = readln().toDouble()
    print("Digite o 3º número: ")
    val c = readln().toDouble()
    if (a > b) {
        if (a > c) {
            println("maior: $a")
        } else {
            println("maior: $c")
        }
    } else {
        if (b > c) {
            println("maior: $b")
        } else {
            println("maior: $c")
        }
    }
    if (a > b && a > c) {
        println("maior: $a")
    } else {
        if (b > c) {
            println("maior: $b")
        } else {
            println("maior: $c")
        }
    }
}