package nondry

import nondry.foundations.JwtToken
import nondry.types.Category
import nondry.types.CategoryDraft
import nondry.types.Quiz
import nondry.types.QuizDraft

sealed class ApplicationController(
    private val jwtToken: JwtToken
) {
    class QuizController(private val jwtToken: JwtToken) : ApplicationController(jwtToken) {
        private val quizes = listOf<Quiz>()

        fun findAll(): List<Quiz> {
            jwtToken.assertAuthorized()
            return quizes
        }

        fun create(text: String) = Quiz.of(jwtToken, QuizDraft(text))
    }

    class CategoryController(private val jwtToken: JwtToken) : ApplicationController(jwtToken) {
        fun create(text: String) = Category.of(jwtToken, CategoryDraft((text)))
    }
}
