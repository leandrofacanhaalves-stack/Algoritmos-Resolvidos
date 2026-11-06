//algoritmo 101 [Lista 2 - Estrutura do Se]
//construir um algoritmo que indique se o número digitado está compreendido entre 20 e 90 ou não.
fun main() {
    print("Digite um número: ")
    val num = readln().toDouble()
    if (num > 20 && num < 90) {
        println("está entre 20 e 90")
    } else {
        println("não está entre 20 e 90")
    }
}