import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
 class App {
    App(){

        Font newfont = new Font("papyrus",Font.BOLD,20);
        Color newcolor = new Color(200,15,30);
        ImageIcon newimage = new ImageIcon("backgroundimg.jpg");

        // creating frame's...
        JFrame f1 = new JFrame("Jack's APp");
        f1.setVisible(true);    
        f1.setBounds(150,50,900,500);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Right now i don't know what it will do...
        ImageIcon newicon = new ImageIcon("icon.png");
        f1.setIconImage(newicon.getImage());
        //f1.setResizable(false);-->> to make pannel resizable you know...

        GroupLayout newlayout  = new GroupLayout(f1.getContentPane());
        f1.getContentPane().setLayout(newlayout);

        f1.getContentPane().setLayout(null);

        // creating panel....
        JPanel p1 = new JPanel();
        
        // creating Label...
        JLabel l1 = new JLabel();
        l1.setText("hey JacK..");
        l1.setBounds(0,0,900,500);
        l1.setFont(newfont);
        l1.setIcon(newimage);

        JLabel l2 = new JLabel();
        l2.setBounds(20,50,150,30);
        l2.setText(l1.getText());
        l2.setFont(newfont);


        // Adding things in the panel....
        f1.add(p1);
        f1.add(l1);
        f1.add(l2);

    }
    public static void main(String[] args) {
        App app = new App();
    }
}
 