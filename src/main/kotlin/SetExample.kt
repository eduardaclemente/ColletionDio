// cria uma variavel imutavel com um conjunto mutavel
val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")

// Retorna um valor booleano mostrando se o elemento foi realmente adicionado.
fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)
}

// Retorna uma string, baseada no parâmetro de entrada da função.
fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected."
}

fun main() {
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2"

    // Imprime uma mensagem de sucesso: o novo elemento é adicionado ao Conjunto.
    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")

    //Imprime uma mensagem de falha: o elemento não pode ser adicionado porque duplica um elemento existente.
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")
}