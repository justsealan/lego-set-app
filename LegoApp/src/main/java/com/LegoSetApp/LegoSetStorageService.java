package com.LegoSetApp;

import java.sql.DriverManager;
import java.sql.SQLException;

public class LegoSetStorageService {

    //Create table if not exists
    public void createTable() {
        try {
            var connection = DriverManager.getConnection("jdbc:h2:~/legos;USER=sa;PASSWORD=");
            var statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS LegoSet (number VARCHAR(255), name VARCHAR(255), theme VARCHAR(255), ages VARCHAR(255), pieces INT, recommendedRetailPrice DOUBLE)");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Insert a new LegoSet
   public void addLegoSet(LegoSet legoSet) {
        try {
            var connection = DriverManager.getConnection("jdbc:h2:~/legos;USER=sa;PASSWORD=");
            var statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO LegoSet (number, name, theme, ages, pieces, recommendedRetailPrice) VALUES ('" + legoSet.getNumber() + "', '" + legoSet.getName() + "', '" + legoSet.getTheme() + "', '" + legoSet.getAge() + "', " + legoSet.getPieces() + ", " + legoSet.getRetail() + ")");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //delete LegoSet
    public void deleteLegoSet(String number) {
        try {
            var connection = DriverManager.getConnection("jdbc:h2:~/legos;USER=sa;PASSWORD=");
            var statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM LegoSet WHERE number = '" + number + "'");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void close() {
        try {
            var connection = DriverManager.getConnection("jdbc:h2:~/legos;USER=sa;PASSWORD=");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

