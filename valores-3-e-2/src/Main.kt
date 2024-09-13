fun main() {
    // peça ao usuário que digite três valores inteiros
    print("digita o primeiro valor: ")
    val valor1 = readLine()?.toIntOrNull()

    print("digita o segundo valor: ")
    val valor2 = readLine()?.toIntOrNull()

    print("digita o terceiro valor: ")
    val valor3 = readLine()?.toIntOrNull()

    // veja se os valores foram inseridos corretamente
    if (valor1 != null && valor2 != null && valor3 != null) {
        // encontre os dois maiores valores
        val menor = minOf(valor1, valor2, valor3)
        val somaDosMaiores = (valor1 + valor2 + valor3) - menor

        // mostre o resultado da soma dos dois maiores valores
        println("a soma dos dois maiores valores é: $somaDosMaiores")
    } else {
        println("por favor, digite apenas valores inteiros válidos.")
    }
}
