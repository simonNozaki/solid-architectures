package openclosed

sealed interface StateRequest {
    val name: String

    class CodingStateRequest : StateRequest {
        override val name = "code"
    }
    class SleepingStateRequest : StateRequest {
        override val name = "sleep"
    }
    class EatingStateRequest : StateRequest {
        override val name = "eat"
    }
}
