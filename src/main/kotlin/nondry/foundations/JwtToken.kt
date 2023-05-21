package nondry.foundations

class JwtToken {
    fun assertAuthorized() {
        if (validate()) throw UnauthorizedError()
    }

    private fun validate() = false
}
