fun main() {
    // peça ao usuário que digite a altura
    print("digita a altura em metros: ")
    val altura = readLine()?.toDoubleOrNull()

    // peça ao usuário que digite o gênero (1 para feminino e 2 para masculino)
    print("digita o gênero (1 para feminino, 2 para masculino): ")
    val genero = readLine()?.toIntOrNull()

    if (altura != null && genero != null) {
        // calcule o peso ideal com base no gênero
        val pesoIdeal = when (genero) {
            1 -> 62.1 * altura - 44.7 // fórmula para mulheres
            2 -> 72.7 * altura - 58.0 // fórmula para homens
            else -> {
                println("gênero inválido.")
                return
            }
        }

        // mostre o peso ideal
        println("o peso ideal para a altura de $altura metros é: (pesoIdeal)} kg")
    } else {
        println("entrada inválida. veja se colocou valores válidos.")
    }
}
