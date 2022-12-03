fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("NumeroX: $numeroX")
    println("NumneroY: $numeroY")

    val contaJoao = Conta("João",1002)
    contaJoao.titular = "João"
    var contaMaria = Conta("Maria", 1003)
    contaMaria.titular = "Maria" // Alterando o mesmo objeto (contaJoao) Referência e não uma cópia !
    contaJoao.titular = "João"  // Alterou titular nos 2 objetos ( Joao => João / Maria => João )

    println("Titular conta Joao: ${contaJoao.titular}")
    println("Titular conta Maria: ${contaMaria.titular}")

    println(contaJoao) //  Imprimiu: Conta@19dfb72a
    println(contaMaria) //  Imprimiu: Conta@17c68925
}

