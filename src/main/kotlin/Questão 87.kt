//algoritmo 87 [Capítulo 3 - exemplos do texto]
/* criar um algoritmo que permita ao aluno responder qual a capital do Brasil.
Todas as possibilidades deverão ser pensadas. */
fun main() {
    print("Qual a capital do Brasil? ")
    val resp = readln()
    if (resp == "BRASÍLIA" || resp == "Brasília") {
        println("PARABÉNS!")
    } else {
        if (resp == "brasília" || resp == "Brazília" || resp == "BRAZÍLIA" || resp == "brazília") {
            println("CERTO! Mas atenção para a grafia: Brasília ou BRASÍLIA")
        } else {
            println("ERRADO! ESTUDE MAIS!")
        }
    }
}