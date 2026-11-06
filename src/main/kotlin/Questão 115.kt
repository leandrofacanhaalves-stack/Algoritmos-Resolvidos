//algoritmo 115 [Lista 2 - Estrutura do Se]
/* criar o algoritmo que deixe entrar com dois números e imprimir o quadrado do menor número e
a raiz quadrada do maior número, se for possível. */
fun main() {
    print("Digite o 1º número: ")
    val x = readln().toDouble()
    print("Digite o 2º número: ")
    val y = readln().toDouble()
    var maior = x
    var menor = y
    if (y > x) {
        maior = y
        menor = x
    }
    println("quadrado do menor: ${menor * menor}")
    if (maior >= 0) {
        println("raiz do maior: ${Math.sqrt(maior)}")
    } else {
        println("não existe raiz do maior")
    }
}