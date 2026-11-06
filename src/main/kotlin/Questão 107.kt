//algoritmo 107 [Lista 2 - Estrutura do Se]
/* ntrar com o nome de uma pessoa e só imprimi-lo se o prenome for JOSÉ.
Obs: há duas possibilidades, pois pode ser que a pessoa só digite JOSÉ e não o nome completo. */
fun main() {
    print("Digite o nome: ")
    val nome = readln()
    if (nome == "JOSÉ" || nome.startsWith("JOSÉ ")) {
        println(nome)
    }
}