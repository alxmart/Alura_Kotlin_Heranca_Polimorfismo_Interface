class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val tipo: Int  //  0 - Funcionario, 1 - Gerente , 2 - Diretor
) {

    fun bonificacao(): Double {

        when (tipo) {
            0 -> return salario * 0.1
            1 -> return salario * 0.2
            else -> return salario * 0.3
        }
    }

    fun autentica(senha: Int) {
        if(tipo == 1) {
            //pode autenticar
        }
    }



}