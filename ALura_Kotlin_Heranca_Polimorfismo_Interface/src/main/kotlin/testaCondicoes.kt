fun testaCondicoes(saldo: Double) {
    if (saldo > 0) {
        println("A conta é positiva.")
    } else if (saldo == 0.0) {
        println("A conta é neutra.")
    } else {
        println("A conta é negativa.")
    }

    when {
        saldo > 0 -> println("A conta é positiva.")
        saldo == 0.0 -> println("A conta é neutra.")
        else -> println("A conta é negativa.")
    }
}


