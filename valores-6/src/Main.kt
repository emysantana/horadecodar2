fun main() {
    // Cria uma lista para armazenar os valores
    val valores = mutableListOf<Double>()

    // Solicita ao usuário que informe 6 valores
    for (i in 1..6) {
        print("Digite o $i valor: ")
        val valor = readLine()?.toDoubleOrNull()
        if (valor != null) {
            valores.add(valor)
        } else {
            println("Valor inválido. Tente novamente.")
            return
        }
    }

    // Exibe os valores informados
    println("Valores informados: ${valores.joinToString(", ")}")

    // Calcula a média aritmética
    val soma = valores.sum()
    val media = soma / valores.size

    // Exibe a média aritmética
    println("A média aritmética dos valores é: $media")
}
