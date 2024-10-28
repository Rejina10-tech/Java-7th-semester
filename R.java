import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

class TestFrame extends JFrame {
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    

    public TestFrame() {

        b1 = new JButton("b1");
        b2 = new JButton("b2");
        b3 = new JButton("b3");
        b4 = new JButton("b4");
        b5 = new JButton("b5");
        

        // FlowLayout fl=new FlowLayout();
        // this.getContentPane().setLayout(fl);
        // GridLayout gl = new GridLayout(2, 3);
        // this.getContentPane().setLayout(gl);
        BorderLayout bl=new BorderLayout();
        this.getContentPane().setLayout(bl);


        this.getContentPane().add(b1,BorderLayout.NORTH);

        this.getContentPane().add(b2,BorderLayout.SOUTH);

        this.getContentPane().add(b3,BorderLayout.EAST);

        this.getContentPane().add(b4,BorderLayout.WEST);

        this.getContentPane().add(b5,BorderLayout.CENTER);

       

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}

public class R {
    public static void main(String args[]) {
        TestFrame t = new TestFrame();

    }
}
