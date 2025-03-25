package javaswing;

//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<....NOTE'S.....>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FirstSwingThings {
    public FirstSwingThings(){

        
       /*  JFrame frame = new JFrame(); // Create a Frame..
        frame.setTitle("FucK");  // Set title of the Frame...
        JButton clickB = new JButton("click ME",new ImageIcon("src/javaswing/logo.png"));  // Create an Button
        clickB.setBounds(130,100,200,60);  // Size of a Button amd position...
        
        frame.setSize(500,500);   // size of the frame...
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // it is necessary to close the frame by this method otherwise
                                                              // while you click on the close buttom it seems like you have closed the app
                                                              // but it was not it running internally , so we have to close it, it is must....
       // frame.setResizable(false);  // By this we can prevent frame from being resized...
        //<<<<<<<<<<<<<<<<.......... Setting Image's................>>>>>>>>>>>>>>>>>>
        ImageIcon labelimage = new ImageIcon("labelimg.png");
        ImageIcon image = new ImageIcon("src/javaswing/logo.png");  // create an object of imageicone  defineing the path or name of the image... 

        frame.setIconImage(image.getImage());   // add the imageIcon with frame by seticonImage and get method...

        frame.add(clickB);   // add the button in the Frame after creating the button...
        final JTextField textFiled = new JTextField();
       textFiled.setBounds(50,25,150,30);

        clickB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                textFiled.setText("fuck man!! i make it..");
            }
        });
        frame.getContentPane().setBackground(Color.white);
        JLabel label = new JLabel();
        label.setText("Heyy!! what the hell...");
       // label.setBounds(95,150,150,50);
      //  label.setSize(150,25);
        label.setIcon(labelimage);
        frame.add(textFiled);
        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true);  // Set the visibility of the panel true in case we don't do, the frame will not showed up...
    */



    //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<......   J_LABEL   ........>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

   /* ImageIcon image = new ImageIcon("src/javaswing/labelimg.png");
    ImageIcon image2 = new ImageIcon("src/javaswing/logo.png");

    Border border = BorderFactory.createLineBorder(Color.black,5);    // Set border for the lable...


    JLabel label = new JLabel("Bro, do you even code..!!");
    //label.setText("Whater You Want Write..!!");    // Another way to write anything on the label...
    label.setIcon(image);
   // label.setHorizontalTextPosition(JLabel.CENTER);   // Set text  LEFT , RIGHT , CENTER of image...
    label.setVerticalTextPosition(JLabel.BOTTOM);          // set text TOP , BOTTOM , CENTER of image...
    label.setForeground(Color.red);                     // Set Font color...
    label.setFont(new Font("MV Boli",Font.BOLD,20));            // Set font size, family and Font style...
    label.setIconTextGap(-200);         // Set Icon To Text Gap....
    label.setBackground(Color.orange);     // set Bacground color...
    label.setOpaque(true);         // set true if you want  the bacground color to D33isplay...
    label.setBorder(border);        // add the border after intiliazing the border...
    label.setVerticalAlignment(JLabel.CENTER);                 // set Vertical alignment of the color and text both...
    label.setHorizontalAlignment(JLabel.CENTER);               // set Horizontal alignment of the text and the color as well...
   // label.setBounds(0,0,500,200);            // Set the bounds of the panel according to the content and position on the Frame...    */



   //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<............J_ PANEL.........>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

  /*  ImageIcon image3 = new ImageIcon("src/javaswing/logo.png");

   JLabel label = new JLabel();
   label.setText("Hello,Buddy..!!");
   label.setIcon(image3);
//    label.setVerticalAlignment(JLabel.TOP);
//    label.setHorizontalAlignment(JLabel.RIGHT);
label.setBounds(3,15,150,60);

   JPanel redpanel = new JPanel();
   redpanel.setBackground(Color.red);
   redpanel.setBounds(0,0,250,250);
   redpanel.setLayout(null);
   redpanel.add(label);
   
   JPanel bluepanPanel = new JPanel();
   bluepanPanel.setBackground(Color.blue);
   bluepanPanel.setBounds(250,0,250,250);

   JPanel greenpanel = new JPanel();
   greenpanel.setBackground(Color.green);
   greenpanel.setBounds(0,250,250,250);

   JPanel blackpanel = new JPanel();
   blackpanel.setBackground(Color.black);
   blackpanel.setBounds(250,250,250,250);   */




   ImageIcon image2 = new ImageIcon("src/javaswing/logo.png");


    JFrame frame = new JFrame();
    frame.setTitle("FucK");
    frame.setIconImage(image2.getImage());
    frame.setSize(500,500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);           // set the layout Manager to null , So that you can customized the panel manually...
    frame.setVisible(true);
    // frame.add(redpanel);
    // frame.add(bluepanPanel);
    // frame.add(greenpanel);
    // frame.add(blackpanel);
    // frame.add(label);
    //frame.pack();           // TO set the label default size ... [and more important add the pack method after the label...]


}

    public static void main(String[] args) {
        new ButtonInSwing();
    }
}