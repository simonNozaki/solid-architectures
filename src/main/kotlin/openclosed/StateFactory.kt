package openclosed

object StateFactory {
    fun codingOf(): State = State.CodeState(StateRequest.CodingStateRequest())
    fun sleepingOf(): State = State.SleepState(StateRequest.SleepingStateRequest())
    fun eatingOf(): State = State.EatState(StateRequest.EatingStateRequest())
}
