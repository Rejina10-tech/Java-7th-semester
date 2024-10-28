abstract class Shape {
  String name;
  float[] d = { 0.0f, 0.0f, 0.0f };

  public Shape() {

  }

  public void printName() {
    System.out.println(name);
  }

  abstract public void printArea();

}

class Circle extends Shape {

  public Circle(float r) {
    d[0] = r;
  }

  public void printArea() {
    super.printName();
    System.out.println(3.14f * d[0] * d[0]);
  }
}

class Rectangle extends Shape {
  public Rectangle() {

  }

  public Rectangle(float l, float w) {
    d[0] = l;
    d[1] = w;
  }

  public void printArea() {
    super.printName();
    System.out.println(d[0] * d[1]);
  }
}

public class O {
  public static void main(String args[]) {
    Circle c = new Circle(10f);
    c.name = "circle";
    c.printArea();

    Rectangle r = new Rectangle(5f, 10f);
    r.name = "rect";
    r.printArea();
  }
}
