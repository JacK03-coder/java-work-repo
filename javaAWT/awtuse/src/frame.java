
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
public class frame {
    frame(){
        Color back = new Color(250,150,46);
        Color fore = new Color(33,55,15);
        Font  font = new Font("Times New Roman", Font.BOLD,15);

        JFrame f1 = new JFrame("jacK's");
        f1.setBounds(150,50,900,500);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.getContentPane().setLayout(null);


        JTextField tf = new JTextField("Jack's first Text Field");
        tf.setBounds(150,150,350,70);
        tf.setVisible(true);
         tf.setHorizontalAlignment(JTextField.CENTER);
         tf.setBackground(back);
         tf.setForeground(fore);
         tf.setFont(font);

         f1.add(tf);
    }
    public static void main(String[] args) {
        frame newFrame = new frame(); 
        
    }
}
