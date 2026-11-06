//algoritmo 105 [Lista 2 - Estrutura do Se]
/** entrar com a sigla do estado de uma pessoa e imprimir uma das mensagens:
* carioca;
* paulista;
* mineiro;
* outros estados. */
fun main() {
    print("Digite a sigla do estado: ")
    val sigla = readln()
    if (sigla == "RJ" || sigla == "rj") {
        println("carioca")
    } else {
        if (sigla == "SP" || sigla == "sp") {
            println("paulista")
        } else {
            if (sigla == "MG" || sigla == "mg") {
                println("mineiro")
            } else {
                println("outros estados")
            }
        }
    }
}