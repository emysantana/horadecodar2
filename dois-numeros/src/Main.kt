//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Solicita ao usuário que informe o primeiro número
    print("Digite o primeiro número: ")
    val numero1 = readLine()?.toDoubleOrNull()

    // Solicita ao usuário que informe o segundo número
    print("Digite o segundo número: ")
    val numero2 = readLine()?.toDoubleOrNull()

    // Verifica se os números informados são válidos
    if (numero1 != null && numero2 != null) {
        // Determina e exibe o maior dos dois números
        val maiorNumero = if (numero1 > numero2) numero1 else numero2
        println("O maior número é: $maiorNumero")
    } else {
        println("Um ou ambos os valores informados não são válidos.")
    }
}
