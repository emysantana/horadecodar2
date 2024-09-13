fun main() {
    // crie uma lista para armazenar os valores
    val valores = mutableListOf<Double>()
    var somaMenoresQue72 = 0.0

    // peça ao usuário que informe 6 valores
    for (i in 1..6) {
        print("digita o $i valor: ")
        val valor = readLine()?.toDoubleOrNull()
        if (valor != null) {
            valores.add(valor)
            // some apenas os valores menores que 72
            if (valor < 72) {
                somaMenoresQue72 += valor
            }
        } else {
            println("valor inválido. tente novamente.")
            return
        }
    }

    // mostre todos os valores informados
    println("valores informados: ${valores.joinToString(", ")}")

    // mostre o valor final da soma dos valores inferiores a 72
    println("a soma dos valores menores que 72 é: $somaMenoresQue72")
}
