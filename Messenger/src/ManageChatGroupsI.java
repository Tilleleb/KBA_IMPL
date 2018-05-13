import java.util.List;

public interface ManageChatGroupsI {
	
	
	/**
	 * adds a new conversation
	 * @param name	 	name of the conversation
	 * @param picture 	adds a picture to the conversation
	 * @return 			true: Conversation was added
	 */
	public boolean addConversation(String name, byte[] picture);
	
	/**
	 * delete a conversation
	 * @param chat_id	id of the conversation
	 * @return			true: id conversation was deleted
	 */
	public boolean deleteConveration(int chat_id);
	
	
	/**
	 * updates a conversation
	 * @param chat_id	chat_id to find the conversation that should be updated
	 * @param name		new name for the conversation
	 * @param picture	new picture for the conversation
	 * @return			true: conversation was updated
	 */
	public boolean updateConversation(int chat_id, String name, byte[] picture);
	
	
	
	/**
	 * returns 
	 * returns List of Objects with all the informations from all conversations
	 * @return 			List of Objects with Information belonging to the conversations
	 */
	public List<Object[]> getAllConversations();
	
	
	/**
	 * adds a user to the conversation
	 * @param chat_id	id of the conversation the user should be added to
	 * @param user_id	id of the user that should be added
	 * @return			true: the user was added
	 */
	public boolean addUserToConversation(int chat_id, int user_id);
	
	/**
	 * delete a user from a conversation
	 * @param chat_id	id of the conversation the user should be deleted from
	 * @param user_id	id of the user that should be deleted
	 * @return			true:  the user was deleted
	 */
	public boolean deleteUserFromConversation(int chat_id, int user_id);
	
	/**
	 * grant admin rigths to a user of a conversation
	 * @param chat_id	id of the conversation the user gets admin rights for
	 * @param user_id	id of the user that gets admin rights
	 * @return			true: admin right where correctly added
	 */
	public boolean grantAdminPermission(int chat_id, int user_id);
	
	/**
	 * revoke admin rigths from a user of a conversation
	 * @param chat_id	id of the conversation the user gets his admin rights revoked
	 * @param user_id	id of the user that gets his admin rights revoked
	 * @return			true: admin right where correctly revoked
	 */
	public boolean revokeAdminPermission(int chat_id, int user_id);
	
	

}
