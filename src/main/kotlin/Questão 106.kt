//algoritmo 106 [Lista 2 - Estrutura do Se]
//entrar com um nome e imprimi-lo se o primeiro caractere for a letra A (considerar letra minúscula ou maiúscula).
fun main() {
    print("Digite o nome: ")
    val nome = readln()
    val letra = nome[0]
    if (letra == 'A' || letra == 'a') {
        println(nome)
    }
}