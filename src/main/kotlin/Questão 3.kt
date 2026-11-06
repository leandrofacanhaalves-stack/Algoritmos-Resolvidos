//algoritmo 3 [Capítulo 1 - Conceitos iniciais]
//algoritmo para trocar lâmpadas
fun main() {
    println("A lâmpada está fora de alcance? (s/n)")
    val alcance = readln().lowercase()
    if (alcance == "s") {
        println("1 - pegar a escada")
    }
    println("2 - pegar a lâmpada")
    println("A lâmpada está quente? (s/n)")
    val quente = readln().lowercase()
    if (quente == "s") {
        println("3 - pegar pano")
    }
    println("4 - tirar lâmpada queimada")
    println("5 - colocar lâmpada boa")
}