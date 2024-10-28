import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class TestFrame extends JFrame {
   
    
    public TestFrame() {
        //  TFH m=new TFH();
        // this.addMouseListener(m);
        TFH2 m=new TFH2();
        this.addMouseListener(m);
       

        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
   
}
class TFH implements MouseListener{
    public void mouseExited(MouseEvent me)
    {
        System.out.println("exited");
    } 
     public void mouseEntered(MouseEvent me)
    {
        System.out.println("entered");
    }
     public void mouseReleased(MouseEvent me)
    {
        System.out.println("released");
    }
     public void mouseClicked(MouseEvent me)
    {
        System.out.println("clicked");
    }  
     public void mousePressed(MouseEvent me)
    {
        System.out.println("pressed");
    }  

}
class TFH2 extends MouseAdapter{
    
     public void mouseClicked(MouseEvent me)
    {
        System.out.println("clicked");
    }  
     
}


public class U {
    public static void main(String args[]) {
        TestFrame t = new TestFrame();

    }
}
