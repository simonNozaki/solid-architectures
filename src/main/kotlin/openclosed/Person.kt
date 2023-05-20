package openclosed

data class Person(
    private val name: String
) {
    fun run(state: State) {
        state.execute()
    }
}
