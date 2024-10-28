import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

class TestFrame extends JFrame {
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;

    public TestFrame() {

        b1 = new JButton("b1");
        b2 = new JButton("b2");
        b3 = new JButton("b3");
        b4 = new JButton("b4");
        b5 = new JButton("b5");
        b6 = new JButton("b6");

        // FlowLayout fl=new FlowLayout();
        // this.getContentPane().setLayout(fl);
        GridLayout gl = new GridLayout(2, 3);
        this.getContentPane().setLayout(gl);

        this.getContentPane().add(b1);

        this.getContentPane().add(b2);

        this.getContentPane().add(b3);

        this.getContentPane().add(b4);

        this.getContentPane().add(b5);

        this.getContentPane().add(b6);

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}

public class Q {
    public static void main(String args[]) {
        TestFrame t = new TestFrame();

    }
}
