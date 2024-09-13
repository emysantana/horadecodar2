fun main() {
    // criando uma lista para armazenar os valores
    val valores = mutableListOf<Double>()

    // peça ao usuário que informe 4 valores
    for (i in 1..4) {
        print("digita o $iº valor: ")
        val valor = readLine()?.toDoubleOrNull()
        if (valor != null) {
            valores.add(valor)
        } else {
            println("valor inválido. tente novamente.")
            return
        }
    }

    // coloque o primeiro, o último e o maior valor
    val primeiroValor = valores.first()
    val ultimoValor = valores.last()
    val maiorValor = valores.maxOrNull()

    // mostre os valores
    println("o primeiro valor informado é: $primeiroValor")
    println("o último valor informado é: $ultimoValor")
    println("o maior valor informado é: $maiorValor")
}
