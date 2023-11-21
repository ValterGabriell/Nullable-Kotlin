data class Library(
    val id:Long,
    val name:String
){
    fun doSomething(value:String?){
        val result = value ?: "Valor nulo"
        println(result)
    }

    fun incrementAge(age: Int): Int {
        return age + 1;
    }
}