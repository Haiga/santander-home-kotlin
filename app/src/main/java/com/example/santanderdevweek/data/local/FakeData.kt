package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {
    fun getLocalData(): Conta {
        val cliente = Cliente("Pedro")
        val cartao = Cartao("123614419747")
        val conta = Conta(
            "Cc 4452596-3",
            "Ag 3205-3",
            "R$ 2.436,64",
            "R$ 3.411,12",
            cliente,
            cartao
        )

        return conta
    }
}