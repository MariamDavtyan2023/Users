fun main() {
    val users = mutableListOf<User>()
    users.add(User("John", 20, 1500.0, AccountState.Suspended("Fraud activity")))
    users.add(User("Helen", 25, 1000.0, AccountState.Suspended("Terms violation")))
    users.add(User("Alice", 30, 3000.0, AccountState.Active))
    users.add(User("Michael", 35, 2000.0, AccountState.Inactive))
    users.add(User("Jack", 40, 900.0, AccountState.Active))
    users.add(User("Sam", 45, 1200.0, AccountState.Active))

    users.forEach {
        println(it)
    }

    println("\nActive users with balance more than 1000:")
    users.filter { it.isTheBalanceGreaterThan1000() && it.accountState == AccountState.Active}.forEach { println(it) }

}

fun User.isTheBalanceGreaterThan1000() : Boolean{
    return this.balance > 1000
}