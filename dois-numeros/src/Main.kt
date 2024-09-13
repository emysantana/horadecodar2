fun main() {
    // peça ao usuário que informe o primeiro número
    print("digita o primeiro número: ")
    val numero1 = readLine()?.toDoubleOrNull()

    // peça ao usuário que informe o segundo número
    print("digita o segundo número: ")
    val numero2 = readLine()?.toDoubleOrNull()

    // veja se os números informados são válidos
    if (numero1 != null && numero2 != null) {
        // determine e exiba o maior dos dois números
        val maiorNumero = if (numero1 > numero2) numero1 else numero2
        println("o maior número é: $maiorNumero")
    } else {
        println("um ou outros os valores mostrados não são válidos.")
    }
}
