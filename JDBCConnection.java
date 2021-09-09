package DataBaseConnection;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/2021s1-SECOND_DB",
                "postgres","hiddenfornow");

        PreparedStatement preparedStatement =
                connection.prepareStatement("SELECT * FROM STUDENTS ORDER BY STUDENT_EPITA_EMAIL ASC LIMIT 1");

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            System.out.println(resultSet.getString("student_contact_ref"));
        }
    }
}


//DOWNLOADED AND IMPORT THE JAR DRIVER
//CONNECTED THE POSTGRESQL USER AND PASSWORD
//FIXED THE MODULE SETTINGS DEPENDENCIES FOR THE DRIVER

//OUTPUT
//DATA RETREIVED
