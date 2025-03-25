package javaswing;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class ButtonInSwing extends JFrame implements  ActionListener{

    JButton btn;
    JLabel label;

     ButtonInSwing(){

        ImageIcon btnicon = new ImageIcon(getClass().getResource("/javaswing/newicon.png"));
        ImageIcon licon = new ImageIcon(getClass().getResource("/javaswing/kind.png"));
    

        label = new JLabel();
        label.setIcon(licon);
        label.setBounds(50,150,500,500);
        label.setVisible(true);


        btn = new JButton();
        btn.setBounds(200,100,200,75);
        btn.setText("Click Me!!");  
        btn.setIcon(btnicon);           
        btn.setFocusable(false);
       // btn.addActionListener(e -> System.out.println("Yoo! Hoo :) ..!!"));
        btn.setHorizontalTextPosition(JButton.CENTER);
       btn.setVerticalTextPosition(JButton.BOTTOM);
       btn.setFont(new Font("MV Boli",Font.BOLD , 17));
       btn.setIconTextGap(-5);
       btn.setForeground(Color.cyan);
       btn.setBackground(Color.orange);
       btn.setBorder(BorderFactory.createEtchedBorder());
      // btn.setEnabled(false);
      btn.addActionListener(this);
    


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(btn);
        this.add(label);

        }

        @Override 
       public void actionPerformed(ActionEvent e){
            if(e.getSource() == btn){
                //System.out.println("Yaa Hoo!!");
                label.setVisible(false);
            }
       }

}