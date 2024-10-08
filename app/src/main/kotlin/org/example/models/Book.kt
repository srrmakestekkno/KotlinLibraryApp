import kotlinx.serialization.Serializable
@Serializable
data class Book (
    val id: Int,
    val title: String,
    val author: String,
    val pages: Int,
    val releasDate: String,
    val content: String
)