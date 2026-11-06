//algoritmo 7 [Capítulo 1 - Conceitos iniciais]
//algoritmo para fazer uma prova
fun main() {
    println("1 - ler a prova")
    println("2 - pegar a caneta")
    print("Quantas questões em branco tem? ")
    var emBranco = readln().toInt()
    print("Quantos minutos faltam? ")
    var tempo = readln().toInt()
    while (emBranco > 0 && tempo > 0) {
        println("Você sabe a questão? (s/n)")
        val sabe = readln().lowercase()
        if (sabe == "s") {
            println("resolvendo a questão")
            emBranco = emBranco - 1
        } else {
            println("pulando para outra")
        }
        tempo = tempo - 1
    }
    println("4 - entregar a prova")
}