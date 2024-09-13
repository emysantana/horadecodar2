fun main() {
    // Solicita ao usuário que informe três valores inteiros
    print("Digite o primeiro valor: ")
    val valor1 = readLine()?.toIntOrNull()

    print("Digite o segundo valor: ")
    val valor2 = readLine()?.toIntOrNull()

    print("Digite o terceiro valor: ")
    val valor3 = readLine()?.toIntOrNull()

    // Verifica se os valores foram inseridos corretamente
    if (valor1 != null && valor2 != null && valor3 != null) {
        // Encontra os dois maiores valores
        val menor = minOf(valor1, valor2, valor3)
        val somaDosMaiores = (valor1 + valor2 + valor3) - menor

        // Exibe o resultado da soma dos dois maiores valores
        println("A soma dos dois maiores valores é: $somaDosMaiores")
    } else {
        println("Por favor, insira apenas valores inteiros válidos.")
    }
}
