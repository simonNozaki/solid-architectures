package openclosed // ktlint-disable filename

fun main() {
    val states = listOf(
        StateFactory.codingOf(),
        StateFactory.eatingOf(),
        StateFactory.sleepingOf()
    )
    val person = Person("person")
    states.forEach { person.run(it) }
}
