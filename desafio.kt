// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String, val email: String)

data class ConteudoEducacional(val nome: String, val duracao: Int)

class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {

    //val inscritos = mutableSet<Usuario>()

    private val alunos = mutableSetOf<Usuario>()

    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        alunos.add(usuario)
        println("Aluno ${usuario.nome} matriculado com sucesso!")
    }

}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    val conteud1 = ConteudoEducacional("Kotlin Basico", 10)
    val conteudo2 = ConteudoEducacional("Kotlin POO", 7)

    val aluno1 = Usuario("Savio", "savio@gmail.com")

    val formacao = Formacao("Android Developer", Nivel.BASICO, listOf(conteud1, conteudo2))

    println(formacao.matricular(aluno1))
}
