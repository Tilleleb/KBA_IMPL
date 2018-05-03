import java.util.List;

public interface UserManagmentI {
	
	public int addUser(String username);
	public int deleteUser(int userid);
	public int updateUser(int userid, String username);
	public List<Object> findAllUsers();
	
}
