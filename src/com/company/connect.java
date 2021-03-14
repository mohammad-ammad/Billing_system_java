package com.company;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class connect {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void login(String a, String b) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String query = "SELECT * FROM `login` WHERE username = ? and password = ?";
            con = DriverManager.getConnection("jdbc:mysql:// localhost/javapract", "root", "");
            pst = con.prepareStatement(query);
            pst.setString(1, a);
            pst.setString(2, b);
            rs = pst.executeQuery();
            if (rs.next()) {
                System.out.println("connected");
                login_form obj1 = new login_form();
                JOptionPane.showMessageDialog(obj1, "You are login:)");
                obj1.setVisible(false);
                main_gui obj2 = new main_gui();
            } else {
                System.out.println("not connected");
                login_form obj1 = new login_form();
                JOptionPane.showMessageDialog(obj1, "Invalid username or password");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void insertData(String item, String qty, String price) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql:// localhost/javapract", "root", "");
            PreparedStatement pst = con.prepareStatement("INSERT INTO menu (item,quantity,price) VALUES ('" + item + "','" + qty + "','" + price + "')");
            pst.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}

