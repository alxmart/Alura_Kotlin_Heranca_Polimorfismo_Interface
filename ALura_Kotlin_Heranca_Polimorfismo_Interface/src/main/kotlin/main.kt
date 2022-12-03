fun main() {
    println("Bem vindo(a) ao Bytebank.")

    val alex = Funcionario(
        "Alex",
        "111.111.111-11",
        1000.0
    )

    println("Nome: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salário: ${alex.salario}")
    println("Bonificação: ${alex.bonificacao()}")

}

