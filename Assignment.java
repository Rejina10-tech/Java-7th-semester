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
    JButton b7;
    JButton b8;

    public TestFrame() {

        b1 = new JButton("b1");
        b2 = new JButton("b2");
        b3 = new JButton("b3");
        b4 = new JButton("b4");
        b5 = new JButton("b5");
        b6 = new JButton("b6");
        b7 = new JButton("b7");
        b8 = new JButton("b8");

        

        // FlowLayout fl=new FlowLayout();
        // this.getContentPane().setLayout(fl);
        // GridLayout gl = new GridLayout(2, 3);
        // this.getContentPane().setLayout(gl);
        //BorderLayout bl=new BorderLayout();
        //this.getContentPane().setLayout(bl);
        GridBagLayout gb1 =new GridBagLayout();
        this.getContentPane().setLayout(gb1);



        this.getContentPane().add(b1, new GridBagConstraints(0,0,1,1,0.2,0.2,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));
        this.getContentPane().add(b2, new GridBagConstraints(1,0,1,1,0.2,0.2,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));
        this.getContentPane().add(b3, new GridBagConstraints(2,0,1,1,0.2,0.2,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));
        this.getContentPane().add(b4, new GridBagConstraints(3,0,1,1,0.2,0.2,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));
       this.getContentPane().add(b5, new GridBagConstraints(4,0,1,1,0.2,0.2,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));
       this.getContentPane().add(b6, new GridBagConstraints(0,1,2,4,0.4,0.8,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));
       this.getContentPane().add(b7, new GridBagConstraints(2,1,3,2,0.6,0.4,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));
       this.getContentPane().add(b8, new GridBagConstraints(2,3,3,2,0.6,0.4,GridBagConstraints.CENTER,GridBagConstraints.BOTH,new Insets(0,0,0,0),0,0));

        

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}

public class Assignment {
    public static void main(String args[]) {
        TestFrame t = new TestFrame();

    }
}
   
