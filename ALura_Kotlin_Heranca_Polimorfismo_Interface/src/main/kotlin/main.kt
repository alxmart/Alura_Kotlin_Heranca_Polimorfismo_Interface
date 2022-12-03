fun main() {
    println("Bem vindo(a) ao Bytebank.")

    val alex = Funcionario(
        "Alex",
        "12345678900",
        1000.0
    ){
        fun bonificacao() {
            return salario * 0.1
        }
      }
    println("Nome: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salário: ${alex.salario}")

}

