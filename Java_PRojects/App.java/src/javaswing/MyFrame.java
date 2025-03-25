package javaswing;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
public class MyFrame extends JFrame {
    public MyFrame(){
       this.setTitle("FucK");
        JButton clickB = new JButton("click ME",new ImageIcon("src/javaswing/logo.png"));
        clickB.setBounds(130,100,200,60);  
       this.setSize(400,500);  
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       ImageIcon image = new ImageIcon("logo.png"); 
       this.setIconImage(image.getImage()); 
       this.add(clickB);
        final JTextField textFiled = new JTextField();
       textFiled.setBounds(50,25,150,30);
        clickB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                textFiled.setText("fuck man!! i make it..");
            }
        });
       this.getContentPane().setBackground(new Color(0,0,0));
       this.add(textFiled);
       this.setLayout(null);
       this.setVisible(true);
    }  
}
