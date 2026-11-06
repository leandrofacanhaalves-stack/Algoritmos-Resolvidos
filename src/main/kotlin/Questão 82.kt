//algoritmo 82 [Capítulo 3 - exemplos do texto]
/* ler um número e, se ele for maior do que 20, então imprimir a metade do número.
Solução nº 1: usa a variável met. Solução nº 2: não cria a variável met (a saída é a mesma). */
fun main() {
    print("Digite um número: ")
    val numero = readln().toDouble()
    if (numero > 20) {
        val met = numero / 2
        println("metade: $met")
    }
    if (numero > 20) {
        println("metade: ${numero / 2}")
    }
}