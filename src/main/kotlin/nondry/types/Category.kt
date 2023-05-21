package nondry.types

import nondry.foundations.JwtToken
import nondry.foundations.ValidationError

data class Category(
    private val draft: CategoryDraft
) {
    init {
        if (hasWordInBlackList(draft.value)) throw ValidationError()
    }

    companion object {
        fun of(jwtToken: JwtToken, draft: CategoryDraft): Category {
            jwtToken.assertAuthorized()
            return Category(draft)
        }
    }

    // TODO
    private fun hasWordInBlackList(text: String) = false
}
