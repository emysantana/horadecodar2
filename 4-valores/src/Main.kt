fun main() {
    // Cria uma lista para armazenar os valores
    val valores = mutableListOf<Double>()

    // Solicita ao usuário que informe 4 valores
    for (i in 1..4) {
        print("Digite o $iº valor: ")
        val valor = readLine()?.toDoubleOrNull()
        if (valor != null) {
            valores.add(valor)
        } else {
            println("Valor inválido. Tente novamente.")
            return
        }
    }

    // Obtém o primeiro, o último e o maior valor
    val primeiroValor = valores.first()
    val ultimoValor = valores.last()
    val maiorValor = valores.maxOrNull()

    // Exibe os valores
    println("O primeiro valor informado é: $primeiroValor")
    println("O último valor informado é: $ultimoValor")
    println("O maior valor informado é: $maiorValor")
}
