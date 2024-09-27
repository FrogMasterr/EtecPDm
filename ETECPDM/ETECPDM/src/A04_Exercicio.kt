/*
    Aula 4: Exercícios de reforço
    Variáveis, tipo de dados e operadores aritméticos
*/

// A04_Exercício.kt
fun main() {

    var nomeCompleto: String = "Luiz Ricardo Silva Oliveira"

    var textoSemValor: String? = null

    val numeroQueCalca: Byte = 38

    val pibBrasil: Long = 10_900_000_000_000L 

    val populacaoBrasil: Int = 212_600_000

    val pibPerCapita: Double = pibBrasil.toDouble() / populacaoBrasil
    println("PIB per capita do Brasil: R$ %.2f".format(pibPerCapita))
}