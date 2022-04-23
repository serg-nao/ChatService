import org.junit.Assert.assertEquals
import org.junit.Test
import ru.netology.Chat
import ru.netology.ChatService
import ru.netology.Message

internal class ChatServiceTest {
    private val service = ChatService()
    val chats = hashMapOf<String, Chat>(
        "0.1" to Chat("0.1", mutableListOf(
            Message("text1", false, true),
            Message("text2", false, true)
        )),
        "0.2" to Chat("0.2", mutableListOf(
            Message("text3", false, true),
            Message("text4", false, true)
        )),
        "0.3" to Chat("0.3", mutableListOf(
            Message("text5", false, true),
            Message("text6", false, true)
        ))
    )
    private var chatId = ""
    private val myUserId = 0


    @Test
    fun getChats() {
        //arrange
        val userId = 0
        val keyBegin = "$userId."
        val keyEnd = ".$userId"

        //act
        val list = chats.filterKeys { it.contains(keyBegin) || it.contains(keyEnd) }.values.toList()
        val result = list.size

        //assert
        assertEquals(3, result)

    }

    @Test
    fun getChat() {
        //arrange
        
    }

    @Test
    fun getMessagesByChatId() {
    }

    @Test
    fun getMessagesByMessageId() {
    }

    @Test
    fun getUnreadChatsCount() {
    }

    @Test
    fun addMessage() {
    }

    @Test
    fun deleteChat() {
    }

    @Test
    fun deleteMessage() {
    }

    @Test
    fun editMessage() {
    }
}