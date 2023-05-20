package openclosed

sealed class State(
    private val stateRequest: StateRequest
) {
    abstract fun execute()

    class CodeState(private val stateRequest: StateRequest) : State(stateRequest) {
        override fun execute() {
            println("State start: ${stateRequest.name}")
        }
    }
    class SleepState(private val stateRequest: StateRequest) : State(stateRequest) {
        override fun execute() {
            println("State start: ${stateRequest.name}")
        }
    }
    class EatState(private val stateRequest: StateRequest) : State(stateRequest) {
        override fun execute() {
            println("State start: ${stateRequest.name}")
        }
    }
}
