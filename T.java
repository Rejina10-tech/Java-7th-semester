import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TestFrame extends JFrame implements ActionListener {
    JButton b1;
    
    public TestFrame() {

        b1 = new JButton("b1");
        
        b1.addActionListener(this);
        // FlowLayout fl=new FlowLayout();
        // this.getContentPane().setLayout(fl);
        // GridLayout gl = new GridLayout(2, 3);
        // this.getContentPane().setLayout(gl);
        BorderLayout bl=new BorderLayout();
        this.getContentPane().setLayout(bl);
        this.getContentPane().add(b1,BorderLayout.CENTER);

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent ae)
    {
        System.out.println("Clicked");
    }
}

public class T {
    public static void main(String args[]) {
        TestFrame t = new TestFrame();

    }
}
