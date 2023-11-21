fun main(args: Array<String>) {

    val nome = "Kotlin"
    var nameMutable = "Kotlin"
    var variable: String = "Kotlin"

    var library: Library = Library(1, "Library 1")
    var library2: Any? = Library(2, "Library 2")

    //operador de chamda segura
    var name: String? = "Valter"
    println(name?.uppercase())

    //operador elvis o que ta na esquerda se for nulo é exec o da direta -> ?:
    var age: Int? = 24
    val result = age ?: 18
    println(result)

    library.doSomething(name)
    val incrementAge = library.incrementAge(age!!)
    println(incrementAge)
}