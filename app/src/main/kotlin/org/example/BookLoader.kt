import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import java.io.File

object BookLoader {
    fun loadBooksFromJson(filePath: String): List<Book> {
        val jsonString = File(filePath).readText()
        return JSON.decodeFromString(jsonString)
    }
}