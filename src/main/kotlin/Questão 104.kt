//algoritmo 104 [Lista 2 - Estrutura do Se]
/* entrar com nome, sexo e idade de uma pessoa. Se a pessoa for do sexo feminino e tiver menos
que 25 anos, imprimir nome e a mensagem: ACEITA. Caso contrário, imprimir nome e a mensagem:
NÃO ACEITA. (Considerar f ou F.) */
fun main() {
    print("Digite o nome: ")
    val nome = readln()
    print("Digite o sexo (F/M): ")
    val sexo = readln()
    print("Digite a idade: ")
    val idade = readln().toInt()
    if ((sexo == "F" || sexo == "f") && idade < 25) {
        println("$nome ACEITA")
    } else {
        println("$nome NÃO ACEITA")
    }
}