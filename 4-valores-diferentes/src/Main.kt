fun main() {
    // peça para o usuário que mostre quatro valores inteiros
    print("digita o primeiro valor: ")
    val valor1 = readLine()?.toIntOrNull()

    print("digita o segundo valor: ")
    val valor2 = readLine()?.toIntOrNull()

    print("digita o terceiro valor: ")
    val valor3 = readLine()?.toIntOrNull()

    print("digita o quarto valor: ")
    val valor4 = readLine()?.toIntOrNull()

    // veja se todos os valores foram colocados corretamente
    if (valor1 != null && valor2 != null && valor3 != null && valor4 != null) {
        // calcule o maior valor entre os quatro
        val maiorValor = maxOf(valor1, valor2, valor3, valor4)

        // mostre o primeiro valor, o último valor e o maior valor
        println("o primeiro valor é: $valor1")
        println("o último valor é: $valor4")
        println("o maior valor é: $maiorValor")
    } else {
        println("por favor, insira valores inteiros válidos.")
    }
}
