//algoritmo 67 [Lista 1 - Leia, imprima, atribuição e funções]
/* efetuar o cálculo do valor de uma prestação em atraso, utilizando a fórmula: prestação =
//valor + (valor * (taxa / 100) * tempo). */
fun main() {
    print("Digite o valor: ")
    val valor = readln().toDouble()
    print("Digite a taxa: ")
    val taxa = readln().toDouble()
    print("Digite o tempo: ")
    val tempo = readln().toDouble()
    val prestacao = valor + (valor * (taxa / 100) * tempo)
    println("prestação: $prestacao")
}