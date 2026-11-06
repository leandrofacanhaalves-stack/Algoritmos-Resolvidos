//algoritmo 84 [Capítulo 3 - exemplos do texto]
//ler um número e imprimir se ele é par ou ímpar.
fun main() {
    print("Digite um número: ")
    val a = readln().toInt()
    if (a % 2 == 0) {
        println("PAR")
    } else {
        println("IMPAR")
    }
}