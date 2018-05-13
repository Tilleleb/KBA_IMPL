
public interface ChatValidationI {

	/**
	 * checks if a chat with given id exists
	 * @param chat_id	id of the chat
	 * @return 			true: chat exists
	 */
	public boolean checkIfChatExists(int chat_id);
	
}
