//CREATING a SQL table as a CLASS in java
//CREATING the SQL columns as attribute in java

package DataBaseConnection.DataModel;

public class Shippers {
    private int id;
    private String company_name;
    private String phone;

    public Shippers(int id, String company_name, String phone) {
        this.id = id;
        this.company_name = company_name;
        this.phone = phone;
    }

  //method to view the files as String in Main.
    @Override
    public String toString() {
        return "Shippers{" +
                "id=" + id +
                ", company_name='" + company_name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Shippers() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}




//MAIN - Writing querries CRUD 'create, insert, update, delete' from JAVA MAIN.
package DataBaseConnection.launcher;

import DataBaseConnection.DataModel.Shippers;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Launcher {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Evaluation2_db",
                "postgres", "jasmine");

        System.out.println(selectShippers(connection));

//        Shippers shippers = new Shippers(10,"myname@company.com","0778990987");
//        selectShippers(connection);
//        createShippers(connection);

        selectShippers(connection);
        connection.close();
    }

    private static List<Shippers> selectShippers(Connection connection) throws SQLException {

        List<Shippers> list = new ArrayList<>();

        int size = list.size();
        System.out.println("List size: " + size);

        PreparedStatement preparedStatement =
                connection.prepareStatement("SELECT * FROM shippers ORDER BY shipper_id ASC");

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            Shippers shippers = new Shippers();
            shippers.setCompany_name(resultSet.getString("company_name"));
            shippers.setId(resultSet.getInt("shipper_id"));
            shippers.setPhone(resultSet.getString("phone"));

            list.add(shippers);
        }
        return list;
    }

    private static void createShippers(Connection connection, Shippers shippers) throws SQLException {
        if (connection.isClosed()){
            System.out.println("Connection is closed");
            return;
        }
        PreparedStatement preparedStatement = connection.prepareStatement("insert into shippers (shipper_id, company_name, phone) VALUES (?,?,?)");
        preparedStatement.setInt(1,shippers.getId());
        preparedStatement.setString(2, shippers.getCompany_name());
        preparedStatement.setString(3, shippers.getPhone());
        preparedStatement.execute();

        connection.close();
    }


    private static void updateShippers(Connection connection, Shippers shippers) throws SQLException {
        if (connection.isClosed()){
            System.out.println("Connection is closed");
            return;
        }
        PreparedStatement preparedStatement = connection.prepareStatement(
                "update shippers set shipper_id = ?, company_name =?, phone = ? where shipper_id = ?");

        preparedStatement.setInt(1,shippers.getId());
        preparedStatement.setString(2, shippers.getCompany_name());
        preparedStatement.setString(3, shippers.getPhone());
        preparedStatement.execute();

        connection.close();
    }
}

//OUTPUT
//List size: 0
//[Shippers{id=1, company_name='Speedy Express', phone='(503) 555-9831'}, Shippers{id=2, company_name='United Package', 
// phone='(503) 555-3199'}, Shippers{id=3, company_name='Federal Shipping', phone='(503) 555-9931'}, Shippers{id=4, 
// company_name='Alliance Shippers', phone='1-800-222-0451'}, Shippers{id=5, company_name='UPS', phone='1-800-782-7892'}, 
// Shippers{id=6, company_name='DHL', phone='1-800-225-5345'}, Shippers{id=9, company_name='Epita Kremlin', phone='768784041'}]
//List size: 0
