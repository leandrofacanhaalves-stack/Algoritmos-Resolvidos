//algoritmo 26 [Capítulo 2 - exemplos do texto]
//entrar com uma data no formato ddmmaa e imprimir no formato mmddaa.
fun main() {
    print("Digite data no formato ddmmaa: ")
    val data = readln().toInt()
    val dia = data / 10000
    val mes = data % 10000 / 100
    val ano = data % 100
    val novaData = mes * 10000 + dia * 100 + ano
    println("DIA: $dia")
    println("MES: $mes")
    println("ANO: $ano")
    println("DATA NO FORMATO MMDDAA: $novaData")
}