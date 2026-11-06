//algoritmo 114 [Lista 2 - Estrutura do Se]
//entrar com dois números e imprimi-los em ordem decrescente (suponha números diferentes).
fun main() {
    print("Digite o 1º número: ")
    val a = readln().toDouble()
    print("Digite o 2º número: ")
    val b = readln().toDouble()
    if (a > b) {
        println("$a $b")
    } else {
        println("$b $a")
    }
}