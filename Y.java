import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

class TestFrame extends JFrame {
    JButton b1;

    public TestFrame() {

        b1 = new JButton("b1");

        this.getContentPane().add(b1);
         
        b1.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        System.out.println("clicked");
                    }
                 } );

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}

 
 
 
 

 

public class Y {
    public static void main(String args[]) {
        TestFrame t = new TestFrame();

    }
}
