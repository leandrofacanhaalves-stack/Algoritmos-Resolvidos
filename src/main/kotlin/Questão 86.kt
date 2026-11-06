//algoritmo 86 [Capítulo 3 - exemplos do texto]
//ler um número e imprimir se ele é positivo, negativo ou nulo.
fun main() {
    print("Digite um número: ")
    val num = readln().toDouble()
    if (num > 0) {
        println("POSITIVO")
    } else {
        if (num < 0) {
            println("NEGATIVO")
        } else {
            println("NULO")
        }
    }
}