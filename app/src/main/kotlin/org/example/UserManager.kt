import java.io.File
object UserManager {
    private val usersFile = File("users.txt")
    private val loginsFile = File("logins.txt")

    fun register(username:String, password: String): Boolean {
        if (usersFile.readLines().any {it.split(":")[0] == username}) {
            return false // user already exists
        }

        usersFile.appendText("$username:$password\n")
        return true
    }

    fun login(username:String, password: String) : Boolean {
        val isValideUser = usersFile.readLines().any {it == "$username:$password"}
        if (isValideUser) {
            logLogin(username)
        }

        return isValideUser
    }

    fun logLogin(username: String) {
        loginsFile.appendText("$username logged in at ${System.currentTimeMillis()}\n")
    }
}