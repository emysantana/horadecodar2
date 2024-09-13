fun main() {
    // peça ao usuário que digite o primeiro valor
    print("digita o primeiro valor inteiro: ")
    val valor1 = readLine()?.toIntOrNull()

    // peça ao usuário que digite o segundo valor
    print("digita o segundo valor inteiro: ")
    val valor2 = readLine()?.toIntOrNull()

    // peça ao usuário que digite a operação
    print("digita a operação (1 para adição, 2 para subtração, 3 para divisão, 4 para multiplicação): ")
    val operacao = readLine()?.toIntOrNull()

    // veja se todos os valores são válidos
    if (valor1 != null && valor2 != null && operacao != null) {
        // calcule e mostre o resultado na operação escolhida
        when (operacao) {
            1 -> {
                val resultado = valor1 + valor2
                println("resultado da adição: $resultado")
            }
            2 -> {
                val resultado = valor1 - valor2
                println("resultado da subtração: $resultado")
            }
            3 -> {
                if (valor2 != 0) {
                    val resultado = valor1.toDouble() / valor2
                    println("resultado da divisão: (resultado)}")
                } else {
                    println("não é possível dividir por zero.")
                }
            }
            4 -> {
                val resultado = valor1 * valor2
                println("resultado da multiplicação: $resultado")
            }
            else -> {
                println("operação errada. escolha entre 1, 2, 3 ou 4.")
            }
        }
    } else {
        println("entrada errada. digite valores válidos.")
    }
}
