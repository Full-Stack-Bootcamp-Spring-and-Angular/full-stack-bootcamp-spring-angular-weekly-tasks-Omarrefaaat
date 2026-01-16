package main.com.myApp.controller.Dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;
@Repository
@Getter
@Setter

public class DatabaseOperation {

    @Value("${database.url}")
    private String url;
    @Value("${database.username}")
    private String username;
    @Value("${database.password}")
    private String password;

    private Connection connection;

    public void connect() {
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database Connected");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void disconnect() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Database Disconnected");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void saveUser(User user) throws SQLException {

        String sql = "INSERT INTO users (first_name, last_name, email, birth_day) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setString(3, user.getEmail());
            ps.setDate(4, new java.sql.Date(user.getBirthDay().getTime()));

            ps.executeUpdate();
        }
    }
}




