package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class main_gui {
    JFrame frame = new JFrame();
    JPanel header = new JPanel();
    JLabel first_label = new JLabel();
    JPanel body_panel = new JPanel();
    JPanel menu_body = new JPanel();
    JPanel menu_inner_panel = new JPanel();
    JPanel table_panel = new JPanel();
    JLabel items = new JLabel();
    JLabel quantity = new JLabel();
    DefaultTableModel dm = new DefaultTableModel(0, 0);
    JLabel total_amt = new JLabel("Total amount = 0");
    JButton total = new JButton("Compute total");
    JButton Reset = new JButton("RESET");
    JCheckBox box1 = new JCheckBox("Biryani");
    JCheckBox box2 = new JCheckBox("Chapal Kabab");
    JCheckBox box3 = new JCheckBox("BBQ");
    JCheckBox box4 = new JCheckBox("Salad");
    JCheckBox box5 = new JCheckBox("Roti");
    JCheckBox box6 = new JCheckBox("Cold drink");
    JCheckBox box7 = new JCheckBox("Chae");
    JCheckBox box8 = new JCheckBox("Coffee");
    JCheckBox box9 = new JCheckBox("Water");
    JCheckBox box10 = new JCheckBox("Karahi");
    String[] qty = {"1","2","3","4","5"};
    JComboBox combo1 = new JComboBox(qty);
    JComboBox combo2 = new JComboBox(qty);
    JComboBox combo3 = new JComboBox(qty);
    JComboBox combo4 = new JComboBox(qty);
    JComboBox combo5 = new JComboBox(qty);
    JComboBox combo6 = new JComboBox(qty);
    JComboBox combo7 = new JComboBox(qty);
    JComboBox combo8 = new JComboBox(qty);
    JComboBox combo9 = new JComboBox(qty);
    JComboBox combo10 = new JComboBox(qty);
    JButton add = new JButton("ADD");
    Font font_1 = new Font("SansSerif",Font.BOLD,30);
    Font font_2 = new Font("SansSerif",Font.BOLD,20);
    Font font_3 = new Font("Serif",Font.BOLD | Font.ITALIC,35);
    private void insert(String a,String b, String c){
        String[] rowdata = {a,b,c};
        dm.addRow(rowdata);
    }
    main_gui(){
        frame.setTitle("Restaurant Billing System");
        frame.setSize(1366,700);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        //header panel
        header.setBounds(0,0,1366,80);
        header.setBackground(Color.BLACK);
        header.setLayout(null);
        //header label
        first_label.setText("Restaurant Billing System");
        first_label.setBounds(510,4,600,80);
        first_label.setForeground(Color.decode("#069C54"));
        first_label.setFont(font_1);
        //body panel
        body_panel.setBounds(0,5,1366,660);
        body_panel.setLayout(null);
        body_panel.setBackground(Color.BLACK);
        //menu_body
        menu_body.setBounds(25,70,450,580);
        menu_body.setLayout(null);
        menu_body.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.decode("#069C54")),"Menu",0,0,font_1,Color.decode("#069C54")));
        menu_body.setBackground(Color.BLACK);
        //menu inner panel
        menu_inner_panel.setBounds(20,40,400,520);
        menu_inner_panel.setBackground(Color.black);
        menu_inner_panel.setLayout(null);
        //items
        items.setText("Items:");
        items.setBounds(10,10,100,30);
        items.setForeground(Color.decode("#069C54"));
        items.setFont(font_2);
        //quantity
        quantity.setText("Quantity:");
        quantity.setBounds(240,10,100,30);
        quantity.setForeground(Color.decode("#069C54"));
        quantity.setFont(font_2);
        //check box
        box1.setBounds(10,38,150,30);
        box1.setBackground(Color.BLACK);
        box1.setForeground(Color.white);
        box2.setBounds(10,70,150,30);
        box2.setBackground(Color.BLACK);
        box2.setForeground(Color.white);
        box3.setBounds(10,102,100,30);
        box3.setBackground(Color.BLACK);
        box3.setForeground(Color.white);
        box4.setBounds(10,134,100,30);
        box4.setBackground(Color.BLACK);
        box4.setForeground(Color.white);
        box5.setBounds(10,166,100,30);
        box5.setBackground(Color.BLACK);
        box5.setForeground(Color.white);
        box6.setBounds(10,198,100,30);
        box6.setBackground(Color.BLACK);
        box6.setForeground(Color.white);
        box7.setBounds(10,230,100,30);
        box7.setBackground(Color.BLACK);
        box7.setForeground(Color.white);
        box8.setBounds(10,262,100,30);
        box8.setBackground(Color.BLACK);
        box8.setForeground(Color.white);
        box9.setBounds(10,294,100,30);
        box9.setBackground(Color.BLACK);
        box9.setForeground(Color.white);
        box10.setBounds(10,326,100,30);
        box10.setBackground(Color.BLACK);
        box10.setForeground(Color.white);
        //combo box
        combo1.setBounds(240,38,150,30);
        combo1.setBackground(Color.BLACK);
        combo1.setForeground(Color.white);
        combo2.setBounds(240,70,150,30);
        combo2.setBackground(Color.BLACK);
        combo2.setForeground(Color.white);
        combo3.setBounds(240,102,100,30);
        combo3.setBackground(Color.BLACK);
        combo3.setForeground(Color.white);
        combo4.setBounds(240,134,100,30);
        combo4.setBackground(Color.BLACK);
        combo4.setForeground(Color.white);
        combo5.setBounds(240,166,100,30);
        combo5.setBackground(Color.BLACK);
        combo5.setForeground(Color.white);
        combo6.setBounds(240,198,100,30);
        combo6.setBackground(Color.BLACK);
        combo6.setForeground(Color.white);
        combo7.setBounds(240,230,100,30);
        combo7.setBackground(Color.BLACK);
        combo7.setForeground(Color.white);
        combo8.setBounds(240,262,100,30);
        combo8.setBackground(Color.BLACK);
        combo8.setForeground(Color.white);
        combo9.setBounds(240,294,100,30);
        combo9.setBackground(Color.BLACK);
        combo9.setForeground(Color.white);
        combo10.setBounds(240,326,100,30);
        combo10.setBackground(Color.BLACK);
        combo10.setForeground(Color.white);
        //add button
        add.setBounds(120,400,150,30);
        add.setBackground(Color.decode("#069C54"));
        add.setForeground(Color.white);
        add.setBorder(BorderFactory.createLineBorder(Color.decode("#069C54")));
        //table panel
        table_panel.setBounds(500,6,480,640);
        table_panel.setBackground(Color.black);
        table_panel.setLayout(null);
        //table
        String headers[] = new String[] {"Items","Quantity","Price"};
        dm.setColumnIdentifiers(headers);
        JTable table = new JTable();
        table.setModel(dm);
        JScrollPane pane = new JScrollPane(table);
        table.setBackground(Color.black);
        table.setForeground(Color.white);
        table.getTableHeader().setBackground(Color.decode("#069C54"));
        table.getTableHeader().setForeground(Color.WHITE);
        table.setBorder(BorderFactory.createLineBorder(Color.decode("#069C54")));
        pane.getViewport().setBackground(Color.black);
        pane.setBounds(5,85,450,500);
        pane.setBorder(BorderFactory.createLineBorder(Color.decode("#069C54")));
        //total button
        total.setBounds(150,600,150,30);
        total.setBackground(Color.decode("#069C54"));
        total.setForeground(Color.white);
        total.setBorder(BorderFactory.createLineBorder(Color.decode("#069C54")));

        //total amount
        total_amt.setBounds(1050,480,400,50);
        total_amt.setFont(font_2);
        total_amt.setForeground(Color.decode("#069C54"));
        //print slip
        Reset.setBounds(1050,550,200,30);
        Reset.setBackground(Color.decode("#069C54"));
        Reset.setForeground(Color.white);
        Reset.setBorder(BorderFactory.createLineBorder(Color.decode("#069C54")));
        //image
        ImageIcon logo = new ImageIcon("home.png");
        Image image = logo.getImage();
        Image newimg = image.getScaledInstance(250,250,java.awt.Image.SCALE_SMOOTH);
        logo = new ImageIcon(newimg);
        //set image
        JLabel label = new JLabel();
        label.setIcon(logo);
        label.setBounds(1010,100,250,250);
        //image label 2
        JLabel label_2 = new JLabel("FOOD CORE");
        label_2.setBounds(1015,360,300,40);
        label_2.setForeground(Color.decode("#069C54"));
        label_2.setFont(font_3);
        //image label 3
        JLabel label_3 = new JLabel("Since 2018");
        label_3.setBounds(1150,390,200,30);
        label_3.setForeground(Color.decode("#069C54"));

        //panel adder
        header.add(first_label);
        body_panel.add(menu_body);
        menu_body.add(menu_inner_panel);
        menu_inner_panel.add(items);
        menu_inner_panel.add(quantity);
        menu_inner_panel.add(box1);
        menu_inner_panel.add(box2);
        menu_inner_panel.add(box3);
        menu_inner_panel.add(box4);
        menu_inner_panel.add(box5);
        menu_inner_panel.add(box6);
        menu_inner_panel.add(box7);
        menu_inner_panel.add(box8);
        menu_inner_panel.add(box9);
        menu_inner_panel.add(box10);
        menu_inner_panel.add(combo1);
        menu_inner_panel.add(combo2);
        menu_inner_panel.add(combo3);
        menu_inner_panel.add(combo4);
        menu_inner_panel.add(combo5);
        menu_inner_panel.add(combo6);
        menu_inner_panel.add(combo7);
        menu_inner_panel.add(combo8);
        menu_inner_panel.add(combo9);
        menu_inner_panel.add(combo10);
        menu_inner_panel.add(add);
        body_panel.add(table_panel);
        table_panel.add(pane);
        table_panel.add(total);
        body_panel.add(total_amt);
        body_panel.add(Reset);
        body_panel.add(label);
        body_panel.add(label_2);
        body_panel.add(label_3);
        //frame adder
        frame.add(header);
        frame.add(body_panel);
        frame.setVisible(true);

        //methods
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String item = "";
                Object Quantity = "0";
                int prices = 0;
                if(box1.isSelected()){
                    item = box1.getText();
                    Quantity = combo1.getSelectedItem();
                    String q = Quantity.toString();
                    prices = 200;
                    if(q.equals("1"))
                    {
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("2")){
                        prices = 2*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("3")){
                        prices = 3*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("4")){
                        prices = 4*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("5")){
                        prices = 5*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else{
                        JOptionPane.showMessageDialog(frame,"enter amount");
                    }
                }
                if(box2.isSelected()){
                    item = box2.getText();
                    Quantity = combo2.getSelectedItem();
                    String q = Quantity.toString();
                    prices = 500;
                    if(q.equals("1"))
                    {
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("2")){
                        prices = 2*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("3")){
                        prices = 3*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("4")){
                        prices = 4*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("5")){
                        prices = 5*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else{
                        JOptionPane.showMessageDialog(frame,"enter amount");
                    }
                }
                if(box3.isSelected()){
                    item = box3.getText();
                    Quantity = combo3.getSelectedItem();
                    String q = Quantity.toString();
                    prices = 1500;
                    if(q.equals("1"))
                    {
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("2")){
                        prices = 2*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("3")){
                        prices = 3*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("4")){
                        prices = 4*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("5")){
                        prices = 5*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else{
                        JOptionPane.showMessageDialog(frame,"enter amount");
                    }

                }
                if(box4.isSelected()){
                    item = box4.getText();
                    Quantity = combo4.getSelectedItem();
                    String q = Quantity.toString();
                    prices = 100;
                    if(q.equals("1"))
                    {
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("2")){
                        prices = 2*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("3")){
                        prices = 3*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("4")){
                        prices = 4*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("5")){
                        prices = 5*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else{
                        JOptionPane.showMessageDialog(frame,"enter amount");
                    }

                }
                if(box5.isSelected()){
                    item = box5.getText();
                    Quantity = combo5.getSelectedItem();
                    String q = Quantity.toString();
                    prices = 25;
                    if(q.equals("1"))
                    {
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("2")){
                        prices = 2*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("3")){
                        prices = 3*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("4")){
                        prices = 4*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("5")){
                        prices = 5*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else{
                        JOptionPane.showMessageDialog(frame,"enter amount");
                    }

                }
                if(box6.isSelected()){
                    item = box6.getText();
                    Quantity = combo6.getSelectedItem();
                    String q = Quantity.toString();
                    prices = 150;
                    if(q.equals("1"))
                    {
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("2")){
                        prices = 2*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("3")){
                        prices = 3*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("4")){
                        prices = 4*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("5")){
                        prices = 5*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else{
                        JOptionPane.showMessageDialog(frame,"enter amount");
                    }

                }
                if(box7.isSelected()){
                    item = box7.getText();
                    Quantity = combo7.getSelectedItem();
                    String q = Quantity.toString();
                    prices = 20;
                    if(q.equals("1"))
                    {
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("2")){
                        prices = 2*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("3")){
                        prices = 3*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("4")){
                        prices = 4*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("5")){
                        prices = 5*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else{
                        JOptionPane.showMessageDialog(frame,"enter amount");
                    }

                }
                if(box8.isSelected()){
                    item = box8.getText();
                    Quantity = combo8.getSelectedItem();
                    String q = Quantity.toString();
                    prices = 300;
                    if(q.equals("1"))
                    {
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("2")){
                        prices = 2*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("3")){
                        prices = 3*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("4")){
                        prices = 4*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("5")){
                        prices = 5*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else{
                        JOptionPane.showMessageDialog(frame,"enter amount");
                    }

                }
                if(box9.isSelected()){
                    item = box9.getText();
                    Quantity = combo9.getSelectedItem();
                    String q = Quantity.toString();
                    prices = 60;
                    if(q.equals("1"))
                    {
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("2")){
                        prices = 2*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("3")){
                        prices = 3*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("4")){
                        prices = 4*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("5")){
                        prices = 5*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else{
                        JOptionPane.showMessageDialog(frame,"enter amount");
                    }

                }
                if(box10.isSelected()){
                    item = box10.getText();
                    Quantity = combo10.getSelectedItem();
                    String q = Quantity.toString();
                    prices = 900;
                    if(q.equals("1"))
                    {
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("2")){
                        prices = 2*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("3")){
                        prices = 3*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("4")){
                        prices = 4*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else if(q.equals("5")){
                        prices = 5*prices;
                        String price = String.valueOf(prices);
                        insert(item,q,price);

                    }
                    else{
                        JOptionPane.showMessageDialog(frame,"enter amount");
                    }

                }
            }
        });

        total.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = 0;
                for (int i = 0; i < table.getRowCount(); i++){
                     total = total + Integer.parseInt(table.getValueAt(i,2).toString());
                     String item = (String) table.getValueAt(i,0);
                     String qty = (String) table.getValueAt(i,1);
                     String price = (String) table.getValueAt(i,2);
                     connect obj = new connect();
                     obj.insertData(item,qty,price);
                }
                total_amt.setText("Total amount = "+ total);
            }

        });
        Reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model=(DefaultTableModel)table.getModel();
                model.setRowCount(0);
               int total=0;
                total_amt.setText("Total amount = "+ total);
//        box1.setSelected(false);
                Component[] components = menu_inner_panel.getComponents();
//                menu_inner_panel.getComponents();

                for (Component comp : components) {

                    if (comp instanceof JCheckBox) {
                        JCheckBox box = (JCheckBox) comp;
                        box.setSelected(false);
                    }
                    if(comp instanceof JComboBox)
                    {
                        JComboBox cb=(JComboBox) comp;
                        cb.setSelectedIndex(0);
                    }
                }
            }
        });
    }
}
