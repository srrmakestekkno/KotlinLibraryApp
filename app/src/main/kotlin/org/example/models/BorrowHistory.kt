import java.time.localDate

data class BorrowHistory(
    val username: String, 
    val bookId: Int,
    val borrowDate: LocalDate
)
