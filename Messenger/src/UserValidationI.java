
public interface UserValidationI {
	
	/**
	 * checks if a user exists
	 * @param user_id	the id of the user
	 * @return			return: true if user exists
	 */
	public boolean checkIfUserExists(int user_id);

}
