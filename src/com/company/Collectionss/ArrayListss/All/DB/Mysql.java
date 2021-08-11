package com.company.Collectionss.ArrayListss.All.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Mysql {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:8080/db","sammy","password");
            Statement statement = connection.createStatement();

            //create
            int create = statement.executeUpdate("insert into test values(1,'har',30000)");
            System.out.println(create);

            //update
            int update = statement.executeUpdate("update test set name='kau' where id=1");
            System.out.println(update);

            //delete
            int delete = statement.executeUpdate("delete from test where id = 2");
            System.out.println(delete);

            //print
            ResultSet resultSet = statement.executeQuery("select * from test");

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getInt(3));
            }


        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
