import javax.swing.*;
import java.awt.*;

class p1 extends JPanel{
  
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;

    public p1()
    {
       b2 = new JButton("b2");
       b3 = new JButton("b3");
       b4 = new JButton("b4");
       b5 = new JButton("b5");
       b6 = new JButton("b6");
       
       GridLayout g= new GridLayout(5,1);
       this.setLayout(g);
       this.add(b2);
      this.add(b3);
       this.add(b4);
       this.add(b5);
        this.add(b6);
    }

}


class p2 extends JPanel{
  
    JButton b1;
   

    public p2()
    {
       b1 = new JButton("b1");
      
       
       GridLayout g= new GridLayout(1,1);
       this.setLayout(g);
       this.add(b1);
      
    }

}

class Sframe extends JFrame
{
  p1 a;
  p2 b;

  
    public Sframe()
   {
      a= new p1();
      b=new p2();
      GridLayout g= new GridLayout(1,2);
       this.getContentPane().setLayout(g);
       this.getContentPane().add(b);
       this.getContentPane().add(a);   
      

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
   }

}


public class Z
 {

    public static void main(String[] args) {
    Sframe s =new Sframe();
    

    }
}
