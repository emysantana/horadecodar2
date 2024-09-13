fun main() {
    // crie uma lista para armazenar os valores
    val valores = mutableListOf<Double>()

    // peça ao usuário que informe 4 valores
    for (i in 1..4) {
        print("digita o $i valor: ")
        val valor = readLine()?.toDoubleOrNull()
        if (valor != null && valor > 0 && valor < 10) {
            valores.add(valor)
        } else {
            println("valor inválido ou fora do que foi pedido. todos os valores devem ser maiores que 0 e menores que 10.")
            return
        }
    }

    // calcule a média dos valores
    val soma = valores.sum()
    val media = soma / valores.size

    // mostre a média e a mensagem de acordo com o resultado
    println("a média dos valores é: $media")

    if (media > 5) {
        println("você passou no teste!")
    } else {
        println("tente novamente.")
    }
}
