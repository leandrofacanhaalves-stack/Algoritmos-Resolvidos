//algoritmo 25 [Capítulo 2 - exemplos do texto]
//entrar com uma data no formato ddmmaa e imprimir: dia, mês e ano separados.
fun main() {
    print("Digite data no formato ddmmaa: ")
    val data = readln().toInt()
    val dia = data / 10000
    val mes = data % 10000 / 100
    val ano = data % 100
    println("DIA: $dia")
    println("MES: $mes")
    println("ANO: $ano")
}