import java.util.List;

public interface ManageContactList {
	
	public void addContact(String Username);
	
	/**
	 *  
	 * @param UserID 
	 */
	public void deleteContact(int UserID);
	
	
	public List<Contact> getContactList();
	
	
	public Contact getContact(String Username);//?
	
	
	
}
