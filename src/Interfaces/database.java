package Interfaces;

import java.sql.Connection;
import java.sql.DriverManager;

public class database {

	public static Connection connecDB() {
        
		try {
			
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433/account;" , "root", "");
            
            return connection;
            /*String query = "INSERT INTO account values('" + firstName + "','" + lastName + "','" + userName + "','" +
                password + "','" + emailId + "','" + mobileNumber + "')";

            Statement sta = connection.createStatement();
            int x = sta.executeUpdate(query);
            if (x == 0) {
                JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
            } else {
                JOptionPane.showMessageDialog(btnNewButton,
                    "Welcome, " + msg + "Your account is sucessfully created");
            }
            connection.close();*/
        } catch (Exception exception) {
            exception.printStackTrace();
        }
		return null;
	}

}
