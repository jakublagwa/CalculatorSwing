package data;

import

public class DriveManager {
	Connection connection = null;
	try {
	  connection = DriverManager.getConnection("jdbc:postgresql://host:port/database", "username", "password");
	  // ...
	} catch (SQLException e) {
	  e.printStackTrace();
	} finally {
	  if (connection != null) {
	    try {
	      connection.close();
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }
	  }
	}

}
