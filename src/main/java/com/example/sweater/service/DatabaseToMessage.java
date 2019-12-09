package com.example.sweater.service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import org.springframework.stereotype.Service;

import javax.servlet.ServletOutputStream;

import java.sql.Statement;

@Service
public class DatabaseToMessage {
    public static void main() {
        String filename = "D:\\Proga\\sweater\\messageDataBase.doc";
        try {
            FileWriter fw = new FileWriter(filename);
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sweater", "root", "7101976wl");
            String query = "select * from message";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                fw.append("Id: ");
                fw.append(rs.getString(1));
                fw.append(',');
                fw.append('\n');
                fw.append("FileName: ");
                fw.append(rs.getString(2));
                fw.append(',');
                fw.append('\n');
                fw.append("Tag: ");
                fw.append(rs.getString(3));
                fw.append(',');
                fw.append('\n');
                fw.append("Text: ");
                fw.append(rs.getString(4));
                fw.append('\n');
                fw.append("User_ID: ");
                fw.append(rs.getString(5));
                fw.append('\n');
                fw.append('\n');
            }
            fw.flush();
            fw.close();
            conn.close();
            System.out.println("Doc File is created successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}