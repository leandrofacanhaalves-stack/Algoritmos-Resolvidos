//algoritmo 71 [Lista 1 - Leia, imprima, atribuição e funções]
//criar um algoritmo que leia um valor de hora e informe quantos minutos se passaram desde o início do dia.
fun main() {
    print("Digite a hora: ")
    val hora = readln().toInt()
    print("Digite os minutos: ")
    val minutos = readln().toInt()
    val total = hora * 60 + minutos
    println("minutos desde o início do dia: $total")
}