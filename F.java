class circle {
    public static String name;
    float r;

    public circle() {

    }

    public circle(String n, float r) {
        name = n;
        this.r = r;

    }

    public void printArea() {
        System.out.println(name);
        System.out.println(3.14f * r * r);
    }
}

public class F {
    public static void main(String args[]) {
        circle c1 = new circle("c1", 5.5f);
        circle c2 = new circle("c2", 6.5f);
        circle c3 = new circle("c3", 7.5f);
        c3.name="hello";
        c1.printArea();
        c2.printArea();
        c3.printArea();
    }

}