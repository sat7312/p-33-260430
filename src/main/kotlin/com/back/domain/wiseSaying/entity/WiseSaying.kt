package com.back.domain.wiseSaying.entity

data class WiseSaying(
    var id: Int = 0,
    var content: String,
    var author: String,
) {
    fun isNew(): Boolean = id == 0

    val jsonStr: String
        get() {
            return """
                {
                    "id": $id,
                    "content": "$content",
                    "author": "$author"
                }
            """.trimIndent()
        }
}
