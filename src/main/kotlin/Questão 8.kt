//algoritmo 8   [Capítulo 1 - Conceitos iniciais]
//Algoritmo para jogar o jogo da forca
fun main() {
    println("Jogador 1, digite a palavra:")
    val palavra = readln()
    var lacunas = ""
    for (i in 0 until palavra.length) {
        lacunas = lacunas + "_"
    }
    var erros = 0
    while (lacunas.contains("_") && erros < 6) {
        println(lacunas)
        println("Jogador 2, digite uma letra:")
        val letra = readln()
        if (palavra.contains(letra)) {
            var novo = ""
            for (i in 0 until palavra.length) {
                if (palavra[i].toString() == letra) {
                    novo = novo + letra
                } else {
                    novo = novo + lacunas[i]
                }
            }
            lacunas = novo
        } else {
            erros = erros + 1
            println("Errou! Desenha uma parte do corpo ($erros)")
        }
    }
    if (lacunas.contains("_")) {
        println("Você perdeu! A palavra era $palavra")
    } else {
        println("Você ganhou! A palavra era $palavra")
    }
}