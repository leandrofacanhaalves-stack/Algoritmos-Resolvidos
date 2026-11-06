//algoritmo 108 [Lista 2 - Estrutura do Se]
//idem ao anterior, porém considerar: JOSÉ, José ou josé.
fun main() {
    print("Digite o nome: ")
    val nome = readln()
    if (nome == "JOSÉ" || nome == "José" || nome == "josé" ||
        nome.startsWith("JOSÉ ") || nome.startsWith("José ") || nome.startsWith("josé ")) {
        println(nome)
    }
}