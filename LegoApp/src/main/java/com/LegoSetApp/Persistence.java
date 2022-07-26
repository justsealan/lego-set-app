package com.LegoSetApp;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Persistence extends BusinessLogic {

    //fields
    private static final String URL = "jdbc:h2:~/legos";
    private static final String USER = "sa";
    private static final String PASSWORD = "";

    //methods
    public void createTable() {
        try {
            java.sql.Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            java.sql.Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS LegoSet (number VARCHAR(255), name VARCHAR(255), theme VARCHAR(255), ages VARCHAR(255), pieces INT, recommendedRetailPrice DOUBLE)");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addLegoSet(LegoSet legoSet) {
        try {
            java.sql.Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            java.sql.Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO LegoSet (number, name, theme, ages, pieces, recommendedRetailPrice) VALUES ('" + legoSet.getNumber() + "', '" + legoSet.getName() + "', '" + legoSet.getTheme() + "', '" + legoSet.getAges() + "', " + legoSet.getPieces() + ", " + legoSet.getRecommendedRetailPrice() + ")");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteLegoSet(String number) {
        try {
            java.sql.Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            java.sql.Statement statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM LegoSet WHERE number = '" + number + "'");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateLegoSet(LegoSet legoSet) {
        try {
            java.sql.Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            java.sql.Statement statement = connection.createStatement();
            statement.executeUpdate("UPDATE LegoSet SET name = '" + legoSet.getName() + "', theme = '" + legoSet.getTheme() + "', ages = '" + legoSet.getAges() + "', pieces = " + legoSet.getPieces() + ", recommendedRetailPrice = " + legoSet.getRecommendedRetailPrice() + " WHERE number = '" + legoSet.getNumber() + "'");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public LegoSet getLegoSet(String number) {
        try {
            java.sql.Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            java.sql.Statement statement = connection.createStatement();
            java.sql.ResultSet resultSet = statement.executeQuery("SELECT * FROM LegoSet WHERE number = '" + number + "'");
            if (resultSet.next()) {
                String name = resultSet.getString("name");
                String theme = resultSet.getString("theme");
                String ages = resultSet.getString("ages");
                int pieces = resultSet.getInt("pieces");
                double recommendedRetailPrice = resultSet.getDouble("recommendedRetailPrice");
                connection.close();
                return new LegoSet(number, name, theme, ages, pieces, recommendedRetailPrice);
            } else {
                connection.close();
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public java.util.List<LegoSet> getLegoSets() {
        java.util.List<LegoSet> legoSets = new java.util.ArrayList<>();
        try {
            java.sql.Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            java.sql.Statement statement = connection.createStatement();
            java.sql.ResultSet resultSet = statement.executeQuery("SELECT * FROM LegoSet");
            while (resultSet.next()) {
                String number = resultSet.getString("number");
                String name = resultSet.getString("name");
                String theme = resultSet.getString("theme");
                String ages = resultSet.getString("ages");
                int pieces = resultSet.getInt("pieces");
                double recommendedRetailPrice = resultSet.getDouble("recommendedRetailPrice");
                legoSets.add(new LegoSet(number, name, theme, ages, pieces, recommendedRetailPrice));
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return legoSets;
    }

    public void dropTable() {
        try {
            java.sql.Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            java.sql.Statement statement = connection.createStatement();
            statement.executeUpdate("DROP TABLE IF EXISTS LegoSet");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            java.sql.Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}//end of class Persistence



//    //Create table
//        void createTable() {
//            try {
//                var connection = DriverManager.getConnection("jdbc:h2:~/legos;USER=sa;PASSWORD=");
//                var statement = connection.createStatement();
//                statement.executeUpdate("drop table if exists legos");
//                statement.executeUpdate("create table legos (number bigint auto_increment, name varchar, theme varchar, age_restriction varchar, pieces int, recommendedRetailPrice double, primary key (number))");
//                connection.close();
//            } catch ( SQLException e) {
//                e.printStackTrace();
//            }
//        }
//
//    //Insert a Lego set into the database
//       public void addLegoSet(LegoSet legoSet){
//           try {
//               var connection = DriverManager.getConnection("jdbc:h2:~/legos;USER=sa;PASSWORD=");
//               var prepareStatement =  connection.prepareStatement("insert into legos (number, name, theme, age_restriction, pieces, recommendedRetailPrice) values (1, 'Death Star', 'Star Wars', '16+', 1600, 180.00)");
//               prepareStatement.executeUpdate();
//               prepareStatement.close();
//               connection.close();
//           } catch (SQLException e) {
//               throw new RuntimeException(e);
//           }
//       }

