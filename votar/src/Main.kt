fun main() {
    // peça ao usuário que digite o ano de nascimento
    print("digita o ano do seu nascimento: ")
    val anoNascimento = readLine()?.toIntOrNull()

    // veja se o ano de nascimento foi colocado
    if (anoNascimento != null) {
        val anoAtual = 2024
        val idade = anoAtual - anoNascimento

        // veja se a pessoa tem 16 anos ou mais para poder votar
        if (idade >= 16) {
            println("você tem $idade anos e irá votar este ano!")
        } else {
            println("você tem $idade anos e não irá votar este ano.")
        }
    } else {
        println("por favor, insira um ano de nascimento certo.")
    }
}
