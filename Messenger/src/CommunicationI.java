import java.util.List;

public interface CommunicationI {
	
	/**
	 * sends message
	 * @param txt 		text of the message
	 * @param user_id	user who send the message
	 * @param chat_id	chat-id of the chat which the message is send to
	 */
	public void sendMessage(String txt, int user_id, int chat_id);
	
	/**
	 * returns information for all Messages belonging to a chat
	 * @param 	chat-id of the chat
	 * @return 	List with information for all Messages belonging to the chat
	 */
	public List<Object[]> recieveMessage(int chat_id);

}
