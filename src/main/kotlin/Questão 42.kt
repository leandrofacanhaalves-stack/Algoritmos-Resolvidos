//algoritmo 42 [Lista 1 - Leia, imprima, atribuição e funções]
//entrar com um ângulo em graus e imprimir: seno, co-seno, tangente, secante, co-secante e
//co-tangente deste ângulo.
fun main() {
    print("Digite um ângulo em graus: ")
    val angulo = readln().toDouble()
    val rad = Math.toRadians(angulo)
    println("seno: ${Math.sin(rad)}")
    println("co-seno: ${Math.cos(rad)}")
    println("tangente: ${Math.tan(rad)}")
    println("secante: ${1 / Math.cos(rad)}")
    println("co-secante: ${1 / Math.sin(rad)}")
    println("co-tangente: ${1 / Math.tan(rad)}")
}