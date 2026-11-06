//algoritmo 9   [Capítulo 1 - Conceitos iniciais]
//Algoritmo para jogar o jogo da velha
fun main() {
    val t = arrayOf(" ", " ", " ", " ", " ", " ", " ", " ", " ")
    val linhas = arrayOf(
        intArrayOf(0, 1, 2), intArrayOf(3, 4, 5), intArrayOf(6, 7, 8),
        intArrayOf(0, 3, 6), intArrayOf(1, 4, 7), intArrayOf(2, 5, 8),
        intArrayOf(0, 4, 8), intArrayOf(2, 4, 6)
    )
    fun mostrar() {
        println(" ${t[0]} | ${t[1]} | ${t[2]}")
        println("---+---+---")
        println(" ${t[3]} | ${t[4]} | ${t[5]}")
        println("---+---+---")
        println(" ${t[6]} | ${t[7]} | ${t[8]}")
    }
    fun ganhou(j: String): Boolean {
        for (l in linhas) {
            if (t[l[0]] == j && t[l[1]] == j && t[l[2]] == j) {
                return true
            }
        }
        return false
    }
    fun existeLivre(): Boolean {
        for (i in 0..8) {
            if (t[i] == " ") {
                return true
            }
        }
        return false
    }
    fun achaBloqueio(): Int {
        for (l in linhas) {
            var qtdX = 0
            var livre = -1
            for (c in l) {
                if (t[c] == "X") {
                    qtdX = qtdX + 1
                }
                if (t[c] == " ") {
                    livre = c
                }
            }
            if (qtdX == 2 && livre != -1) {
                return livre
            }
        }
        return -1
    }
    mostrar()
    while (existeLivre() && !ganhou("X") && !ganhou("O")) {
        print("Sua jogada (1-9): ")
        var casa = readln().toInt() - 1
        while (casa < 0 || casa > 8 || t[casa] != " ") {
            print("Jogada inválida, digite de novo: ")
            casa = readln().toInt() - 1
        }
        t[casa] = "X"
        if (existeLivre() && !ganhou("X")) {
            var jogada = -1
            if (t[4] == " ") {
                jogada = 4
            }
            if (jogada == -1) {
                jogada = achaBloqueio()
            }
            if (jogada == -1) {
                for (c in intArrayOf(0, 2, 6, 8)) {
                    if (t[c] == " " && jogada == -1) {
                        jogada = c
                    }
                }
            }
            if (jogada == -1) {
                for (i in 0..8) {
                    if (t[i] == " " && jogada == -1) {
                        jogada = i
                    }
                }
            }
            t[jogada] = "O"
            println("Minha jogada: ${jogada + 1}")
        }
        mostrar()
    }
    if (ganhou("X")) {
        println("Você ganhou!")
    } else if (ganhou("O")) {
        println("Eu ganhei!")
    } else {
        println("Deu velha!")
    }
}