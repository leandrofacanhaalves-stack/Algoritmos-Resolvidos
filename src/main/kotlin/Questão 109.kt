//algoritmo 109 [Lista 2 - Estrutura do Se]
/* criar um algoritmo que entre com dois nomes e imprimi-los em ordem alfabética.
Solução nº 1: compara as strings com o operador <. Solução nº 2: usa a função de comparação strcomp. */
fun main() {
    print("Digite o 1º nome: ")
    val nome1 = readln()
    print("Digite o 2º nome: ")
    val nome2 = readln()
    if (nome1 < nome2) {
        println("$nome1 $nome2")
    } else {
        println("$nome2 $nome1")
    }
    if (nome1.compareTo(nome2) < 0) {
        println("$nome1 $nome2")
    } else {
        println("$nome2 $nome1")
    }
}