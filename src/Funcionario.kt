open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
){
    open fun bonificacao(): Double = salario * 0.1

}