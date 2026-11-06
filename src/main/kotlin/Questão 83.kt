//algoritmo 83 [Capítulo 3 - exemplos do texto]
/* ler um número e, se ele for positivo, imprimir seu inverso; caso contrário, imprimir o valor absoluto do número.
Solução nº 1: usa variáveis inverso e absoluto. Solução nº 2: imprime direto. */
fun main() {
    print("Digite um número: ")
    val numero = readln().toDouble()
    if (numero > 0) {
        val inverso = 1 / numero
        println("inverso: $inverso")
    } else {
        val absoluto = Math.abs(numero)
        println("absoluto: $absoluto")
    }
    if (numero > 0) {
        println("inverso: ${1 / numero}")
    } else {
        println("absoluto: ${Math.abs(numero)}")
    }
}