package jdbcsample;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import jdbcsample.tables.Students;
import java.util.Scanner;

public class jdcbsample{
	
	
	public static void main(String args[]) throws SQLException {
		PreparedStatement preparedstate = null;
		ResultSet rs;
		
		
		String read = "select * from students";
		
		try(
				Connection conn = DBConnection.getConnection();
				PreparedStatement pr = conn.prepareStatement(read);			
				){
			
			
			rs = pr.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("id") + " "  + rs.getString("first_name") + " " + rs.getString("last_name") + " " + rs.getDate("dob") + " "  + rs.getString("class") + " "  + rs.getString("email"));

			}
		}catch(Exception e) {
				e.printStackTrace();
			}
			
			Scanner input = new Scanner(System.in);
			System.out.println("Do you want to add a student?");
			
			String answer = input.nextLine();
			
			if (answer.equalsIgnoreCase("yes")) {
				System.out.println("Enter id: ");
				String id = input.nextLine();
				System.out.println("Enter first name: ");
				String first_name = input.nextLine();
				System.out.println("Enter last name: ");
				String last_name = input.nextLine();
				System.out.println("Enter dob: ");
				String dob = input.nextLine();
				System.out.println("Enter class: ");
				String classname = input.nextLine();
				System.out.println("Enter email: ");
				String email = input.nextLine();

				AddStundents create = new AddStundents();
				
				create.add(id, first_name, last_name, dob, classname, email);
						
				
			}else {
				System.exit(1);
			}
			
		}
		
		
	
		
	}
