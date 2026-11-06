
//algoritmo 112 [Lista 2 - Estrutura do Se]
//entrar com dois números e imprimir o menor número (suponha números diferentes).
fun main() {
    print("Digite o 1º número: ")
    val a = readln().toDouble()
    print("Digite o 2º número: ")
    val b = readln().toDouble()
    if (a < b) {
        println("menor: $a")
    } else {
        println("menor: $b")
    }
}