
public interface CommunicationI {
	
	/**
	 * sends message
	 * @param txt 		text of the message
	 * @param user_id	user who send the message
	 * @param chat_id	chat-id of the chat which the message is send to
	 */
	public void sendMessage(String txt, int user_id, int chat_id);
	
	/*-----------------------???????????????????????----------------------------*/
	/**
	 * @param 	chat_id id of the chat
	 * @return 	String-Array with all Messages belonging to the chat
	 */
	public String[][] recieveMessage(int chat_id);

	/*-----------------------???????????????????????----------------------------*/
}
