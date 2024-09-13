fun main() {
    // peça para o usuário que informe três valores
    print("digita o primeiro valor: ")
    val valor1 = readLine()?.toDoubleOrNull()

    print("digita o segundo valor: ")
    val valor2 = readLine()?.toDoubleOrNull()

    print("digita o terceiro valor: ")
    val valor3 = readLine()?.toDoubleOrNull()

    // verifique se todos os valores mostrados são válidos
    if (valor1 != null && valor2 != null && valor3 != null) {
        // mostre o maior valor entre os três
        val maiorValor = when {
            valor1 > valor2 && valor1 > valor3 -> valor1
            valor2 > valor1 && valor2 > valor3 -> valor2
            else -> valor3
        }
        // mostre o maior valor
        println("o maior valor informado é: $maiorValor")
    } else {
        println("um ou outros valores informados não são válidos.")
    }
}
