package com.example.demo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pay_bill extends JFrame implements ActionListener{
	
	
    pay_bill(){
        JEditorPane j = new JEditorPane();
        j.setEditable(false);

        try {
            j.setPage("https://paytm.com/online-payments");
        }catch (Exception e) {
            j.setContentType("text/html");
            j.setText("<html>Could not load</html>");
        }

        JScrollPane scrollPane = new JScrollPane(j);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(scrollPane);
        setPreferredSize(new Dimension(800,800));
        setSize(800,800);
        setLocation(250,120);
        setVisible(true);
    }
    public static void main(String[] args){
        new pay_bill().setVisible(true);
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}