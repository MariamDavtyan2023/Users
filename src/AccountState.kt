sealed class AccountState {
    object Active : AccountState()
    object Inactive: AccountState()
    data class Suspended(val message: String): AccountState()
}
