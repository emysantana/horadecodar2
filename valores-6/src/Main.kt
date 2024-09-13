fun main() {
    // crie uma lista para armazenar os valores
    val valores = mutableListOf<Double>()

    // peça ao usuário que informe 6 valores
    for (i in 1..6) {
        print("digita o $i valor: ")
        val valor = readLine()?.toDoubleOrNull()
        if (valor != null) {
            valores.add(valor)
        } else {
            println("valor inválido. tente novamente!")
            return
        }
    }

    // mostre os valores informados
    println("valores informados: ${valores.joinToString(", ")}")

    // calcule a média aritmética
    val soma = valores.sum()
    val media = soma / valores.size

    // veja a média aritmética
    println(a média aritmética dos valores é: $media")
}
