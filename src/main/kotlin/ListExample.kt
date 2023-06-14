
    // a variavel é imutavel, mas a lista é mutavel. Ou seja, a variavel não pode
    // receber outra instancia, mas os itens dela pode ser mutaveis pois a implementação
    // da lista é mutavel

    val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)        // criação de lista mutavel
    val sudoers: List<Int> = systemUsers                              // cria uma lista só pra leitura

    fun addSystemUser(newUser: Int) {                                 // adiciona um novo item na mutavel
        systemUsers.add(newUser)
    }

    fun getSysSudoers(): List<Int> {                                  // cria uma cópia de somente leitura
        return sudoers                                                  // NA LISTA IMUTAVEL
    }

    fun main() {
        addSystemUser(4)                                       // Atualiza o MutableList. Todas as exibições somente leitura relacionadas também são atualizadas, pois apontam para o mesmo objeto.
        println("Tot sudoers: ${getSysSudoers().size}")               // Recupera o tamanho da lista somente leitura.
        getSysSudoers().forEach {                                     // Itera a lista e imprime seus elementos.
                i -> println("Some useful info on user $i")
        }
        // getSysSudoers().add(5) <- Error!                           //A tentativa de gravar na exibição somente leitura causa um erro de compilação
    }
