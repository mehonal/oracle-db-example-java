package com.example;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class Main {
    private static Properties props = new Properties();

    static {
        try (InputStream input = Main.class.getClassLoader().getResourceAsStream("application.properties")) {
            if (input == null) {
                throw new RuntimeException("Unable to find application.properties");
            }
            props.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Error loading application.properties", e);
        }
    }

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            try (Connection conn = DriverManager.getConnection(
                    props.getProperty("db.url"),
                    props.getProperty("db.username"),
                    props.getProperty("db.password"))) {

                String insertSQL = "INSERT INTO BOOK (ID, NAME, ISBN, CREATE_DATE) VALUES (SEQ_BOOK_ID.NEXTVAL, ?, ?, SYSDATE)";

                try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {

                    for (int i = 0; i < 100; i++) {
                        String bookName = "Book Amazing Adventures of Java";
                        String isbn = "123-456-789";
                        pstmt.setString(1, bookName);
                        pstmt.setString(2, isbn);
                        pstmt.executeUpdate();

                        System.out.println("Inserted book: " + bookName + " with ISBN: " + isbn);
                    }
                    System.out.println("Successfully inserted 100 records!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}