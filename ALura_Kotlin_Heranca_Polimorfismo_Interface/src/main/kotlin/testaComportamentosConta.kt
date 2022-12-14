fun testaComportamentosConta() {

    val contaAlex = Conta(titular = "Alex", numero = 1000)
    contaAlex.deposita(200.0)

    val contaFran = Conta(numero = 1001, titular = "Fran")
    contaFran.deposita(300.0)

    println("Titular: ${contaFran.titular}")
    println("Número da Conta: ${contaFran.numero}")
    println("Saldo Conta Fran: ${contaFran.saldo}")

    println("Titular: ${contaAlex.titular}")
    println("Número da Conta: ${contaAlex.numero}")
    println("Saldo Conta Alex: ${contaAlex.saldo}")

    println("Depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println("Saldo do Alex: ${contaAlex.saldo}")

    println("Depositando na conta da Fran")
    contaFran.deposita(70.0)
    println("Saldo da Fran: ${contaFran.saldo}")

    println("Sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("Sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("Saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println("Saldo atual: ${contaAlex.saldo}")

    println("Saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println("Saldo atual: ${contaFran.saldo}")

    println("Transferências da conta da Fran para o Alex")

    if (contaFran.transfere(valor = 300.0, destino = contaAlex)) {
        println("Transferência efetuada")
    } else {
        println("Falha na Transferência")
    }

    println("Saldo Conta do Alex: ${contaAlex.saldo}")
    println("Saldo Conta da Fran: ${contaFran.saldo}")
}