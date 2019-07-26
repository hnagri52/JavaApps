package jdbcsample;


import java.sql.*;


public class AddStundents {

	
	public static void add(String id, String first_name, String last_name, String dob, String classname, String email) {
		
		String sql = "Insert into students('id','first_name','last_name','dob','class','email') VALUES(?,?,?,?,?,?)";
		
		try(
				Connection conn = DBConnection.getConnection();
				PreparedStatement state = conn.prepareStatement(dob);
				){
			
			
			state.setString(1, id);
			state.setString(2, first_name);
			state.setString(3, last_name);
			state.setString(4, dob);
			state.setString(5, classname);
			state.setString(6, email);
			
			
			state.execute();
		}catch(Exception e) {
			System.err.println(e);
		}
		
	}

}
