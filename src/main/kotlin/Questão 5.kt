//algoritmo 5 [Capítulo 1 - Conceitos iniciais]
//algoritmo para fazer um bolo simples
fun main() {
    println("1 - pegar os ingredientes")
    println("Está de roupa branca? (s/n)")
    val roupa = readln().lowercase()
    if (roupa == "s") {
        println("2 - colocar avental")
    }
    println("Tem batedeira? (s/n)")
    val batedeira = readln().lowercase()
    if (batedeira == "s") {
        println("3 - bater os ingredientes na batedeira")
    } else {
        println("3 - bater os ingredientes à mão")
    }
    println("4 - colocar a massa na forma")
    println("5 - colocar a forma no forno")
    println("6 - aguardar o tempo necessário")
    println("7 - retirar o bolo")
}