//algoritmo 53 [Lista 1 - Leia, imprima, atribuição e funções]
//entrar com os lados a, b, c de um paralelepípedo. Calcular e imprimir a diagonal.
fun main() {
    print("Digite o lado a: ")
    val a = readln().toDouble()
    print("Digite o lado b: ")
    val b = readln().toDouble()
    print("Digite o lado c: ")
    val c = readln().toDouble()
    val diagonal = Math.sqrt(a * a + b * b + c * c)
    println("diagonal: $diagonal")
}