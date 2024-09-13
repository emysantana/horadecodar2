fun main() {
    // Solicita ao usuário que informe três valores
    print("Digite o primeiro valor: ")
    val valor1 = readLine()?.toDoubleOrNull()

    print("Digite o segundo valor: ")
    val valor2 = readLine()?.toDoubleOrNull()

    print("Digite o terceiro valor: ")
    val valor3 = readLine()?.toDoubleOrNull()

    // Verifica se todos os valores informados são válidos
    if (valor1 != null && valor2 != null && valor3 != null) {
        // Determina o maior valor entre os três
        val maiorValor = when {
            valor1 > valor2 && valor1 > valor3 -> valor1
            valor2 > valor1 && valor2 > valor3 -> valor2
            else -> valor3
        }
        // Exibe o maior valor
        println("O maior valor informado é: $maiorValor")
    } else {
        println("Um ou mais valores informados não são válidos.")
    }
}
