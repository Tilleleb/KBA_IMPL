import java.util.List;

public interface ManageContactListI {
	
	/**
	 * adds a contact to the user contact list
	 * @param userid		id of the user
	 * @param contactid		id of the contact (a contact is also a user)
	 * @return				true: the contact was added
	 */
	public boolean addContact(int userid, int contactid);
	
	/**
	 * deletes a user from a user contact list
	 * @param userid		id of the user
	 * @param contactid		id of the contact (a contact is also a user)
	 */
	public void deleteContact(int userid, int contactid);
	
	/**
	 * returns an array with all the contacts of a user
	 * @param userid	id of the user
	 * @return			int-array with all the contact-ids belonging to the contacts of the user
	 */
	public int[] getContactList(int userid);
	
	
	
	public int getContact(String Username);
	
	
	
}
