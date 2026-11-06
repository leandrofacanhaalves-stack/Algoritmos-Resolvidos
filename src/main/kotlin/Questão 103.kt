//algoritmo 103 [Lista 2 - Estrutura do Se]
/* entrar com o ano de nascimento de uma pessoa e o ano atual. Imprimir a idade da pessoa. Não
se esqueça de verificar se o ano de nascimento é um ano válido. */
fun main() {
    print("Digite o ano atual: ")
    val anoAtual = readln().toInt()
    print("Digite o ano de nascimento: ")
    val anoNasc = readln().toInt()
    if (anoNasc > anoAtual) {
        println("ano de nascimento inválido")
    } else {
        val idade = anoAtual - anoNasc
        println("idade: $idade")
    }
}