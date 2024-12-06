package com.neoteric.mysqljdbcconnection;

import java.sql.*;
import java.util.List;

public class DataBaseConnection {

    public static List<Project> projectAllocation(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","legion@2428");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select ID, name, salary from sys.Employee");
            while (resultSet.next()){
                System.out.println("Employee ID:"+ resultSet.getInt("ID")+", Emplyee name:"+ resultSet.getString("name")+", Project ID:"+resultSet.getDouble("salary"));
            }
        }catch (ClassNotFoundException e){
            System.out.println(" exception"+e.getMessage());
        }catch (SQLException e){
            System.out.println("SQL Exception"+ e.getMessage());
        }
        return null;
    }

}
