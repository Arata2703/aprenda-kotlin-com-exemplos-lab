enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int, val nivel: Nivel)

data class Formacao(val nome: String) {

    val conteudo = mutableListOf<ConteudoEducacional>()
    val inscritos = mutableListOf<Usuario>()

    fun adicionarConteudo(vararg conteudos: ConteudoEducacional){
        conteudos.map {conteudo.add(it)}
    }
    fun matricular(vararg usuarios: Usuario) {
        usuarios.map {inscritos.add(it)}
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    //Criando Usuários
    val user1 = Usuario("Rafael")
    val user2 = Usuario("Kaory")

    //Criando Conteúdos Educacionais
    val conteudo1 = ConteudoEducacional("Tipagem no Kotlin", 10, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Funcoes no Kotlin", 60, Nivel.BASICO)
    val conteudo3 = ConteudoEducacional("Introducao ao GitHub", 10, Nivel.INTERMEDIARIO)


    //Criando Formações
    val formacao1 = Formacao("Curso Básico de Kotlin")
    println(formacao1)

    formacao1.matricular(user1, user2)
    println(formacao1.inscritos.toString())

    formacao1.adicionarConteudo(conteudo1, conteudo2, conteudo3)
    println(formacao1.conteudo.toString())
}
