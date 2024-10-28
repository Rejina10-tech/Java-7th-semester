
class shape {
    private String color;

    public shape() {

    }

    public shape(String c) {
        color = c;

    }

}

class circle extends shape {
    public  String name;
    float r;

    public circle() {

    }

    public circle(String n, float r, String c) {
        // super(c);
        color=c;
        name = n;
        this.r = r;

    }

    public void printArea() {
        System.out.println(name);
        System.out.println(3.14f * r * r);
        System.out.println(color);
    }
}

public class G {
    public static void main(String args[]) {
        circle c1 = new circle("c1", 5.5f,"red");
        circle c2 = new circle("c2", 6.5f,"blue");
        circle c3 = new circle("c3", 7.5f,"yello");
        c3.color = "green";
        c1.printArea();
        c2.printArea();
        c3.printArea();
    }

}