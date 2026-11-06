//algoritmo 56 [Lista 1 - Leia, imprima, atribuição e funções]
/** Entrar com nome e idade. Imprimir a seguinte saída:
* nome:
* idade: */
fun main() {
    print("Digite o nome: ")
    val nome = readln()
    print("Digite a idade: ")
    val idade = readln().toInt()
    println("nome: $nome")
    println("idade: $idade")
}