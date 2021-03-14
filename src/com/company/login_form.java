package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login_form extends JFrame {
    Font font_1 = new Font("SansSerif",Font.BOLD,30);
    Font font_2 = new Font("SansSerif",Font.BOLD,20);
    Font font_3 = new Font("Serif",Font.BOLD | Font.ITALIC,35);
    login_form(){
        this.setTitle("Restaurant Billing System");
        this.setSize(1366,700);
//        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        //panel
        JPanel form_heading = new JPanel();
        form_heading.setBounds(0,0,1366,80);
        form_heading.setLayout(null);
        form_heading.setBackground(Color.black);
        //heading label
        JLabel first_label = new JLabel("Restaurant Billing System");
        first_label.setBounds(510,4,600,80);
        first_label.setForeground(Color.decode("#069C54"));
        first_label.setFont(font_1);
        //body login form
        JPanel body_panel = new JPanel();
        body_panel.setBounds(0,5,1366,660);
        body_panel.setLayout(null);
        body_panel.setBackground(Color.BLACK);
        //image
        ImageIcon logo = new ImageIcon("home.png");
        Image image = logo.getImage();
        Image newimg = image.getScaledInstance(300,300,java.awt.Image.SCALE_SMOOTH);
        logo = new ImageIcon(newimg);
        //set image
        JLabel label = new JLabel();
        label.setIcon(logo);
        label.setBounds(90,150,300,300);
        //image label 2
        JLabel label_2 = new JLabel("FOOD CORE");
        label_2.setBounds(150,440,300,40);
        label_2.setForeground(Color.decode("#069C54"));
        label_2.setFont(font_3);
        //image label 3
        JLabel label_3 = new JLabel("Since 2018");
        label_3.setBounds(280,470,200,30);
        label_3.setForeground(Color.decode("#069C54"));
        //sign_in form
        JLabel login = new JLabel("Login Here:");
        login.setBounds(520,80,300,50);
        login.setFont(font_2);
        login.setForeground(Color.white);
        //username
        JLabel username = new JLabel("Username:");
        username.setBounds(520,190,300,50);
        username.setForeground(Color.white);
        //user_input
        JTextField user = new JTextField();
        user.setBounds(620,190,300,50);
        user.setBackground(Color.BLACK);
        user.setForeground(Color.white);
        user.setBorder(BorderFactory.createLineBorder(Color.decode("#069C54")));
        //span_1
        JLabel span_1 = new JLabel("Enter Username here");
        span_1.setBounds(640,159,300,50);
        span_1.setForeground(Color.decode("#069C54"));
        //password
        JLabel password = new JLabel("Password:");
        password.setBounds(520,320,300,50);
        password.setForeground(Color.white);
        //pass field
        JTextField pass = new JTextField();
        pass.setBounds(620,320,300,50);
        pass.setBackground(Color.BLACK);
        pass.setForeground(Color.white);
        pass.setBorder(BorderFactory.createLineBorder(Color.decode("#069C54")));
        //span_2
        JLabel span_2 = new JLabel("Enter Password here");
        span_2.setBounds(640,289,300,50);
        span_2.setForeground(Color.decode("#069C54"));
        //login button
        JButton submit = new JButton("Login");
        submit.setBounds(700,430,150,30);
//        submit.setFont(font_2);
        submit.setForeground(Color.white);
        submit.setBackground(Color.decode("#069C54"));
        submit.setBorder(BorderFactory.createLineBorder(Color.decode("#069C54")));
        //panel adder
        form_heading.add(first_label);
        body_panel.add(login);
        body_panel.add(label);
        body_panel.add(label_2);
        body_panel.add(label_3);
        body_panel.add(username);
        body_panel.add(user);
        body_panel.add(span_1);
        body_panel.add(password);
        body_panel.add(pass);
        body_panel.add(span_2);
        body_panel.add(submit);
        //frame adder
        this.add(form_heading);
        this.add(body_panel);
        this.setVisible(true);

        //methods
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                connect obj = new connect();
                obj.login(user.getText(),pass.getText());
                dispose();
            }
        });
    }
}
