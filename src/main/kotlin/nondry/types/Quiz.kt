package nondry.types

import nondry.foundations.JwtToken
import nondry.foundations.ValidationError

data class Quiz(
    private val draft: QuizDraft
) {
    init {
        if (hasWordInBlackList(draft.value)) throw ValidationError()
    }

    companion object {
        fun of(jwtToken: JwtToken, draft: QuizDraft): Quiz {
            jwtToken.assertAuthorized()
            return Quiz(draft)
        }
    }

    // TODO
    private fun hasWordInBlackList(text: String) = false
}
