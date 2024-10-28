abstract class Calculator {

    String name;

    public Calculator() {
    }

    public Calculator(String name) {
        this.name = name;
    }

    public abstract void add();

    public abstract void subtract();

    public void printName() {
        System.out.println(name);
    }

}

class IntegerCalculator extends Calculator {
    int a, b;

    public IntegerCalculator() {

    }

    public IntegerCalculator(int x, int y, String name) {
        super(name);
        a = x;
        b = y;
    }

    public void add() {
        System.out.println(a + b);
    }

    public void subtract() {
        System.out.println(a - b);
    }
}

class ComplexCalculator extends Calculator {
    int a[];
    int b[];

    public ComplexCalculator() {

    }

    public ComplexCalculator(int[] a, int[] b, String name) {
        super(name);
        this.a = a;

        this.b = b;

    }

    public void add() {
        String c = (a[0] + b[0]) + "+" + (a[1] + b[1]) + "i";
        System.out.println(c);
    }

    public void subtract() {
        String c = (a[0] - b[0]) + "+" + (a[1] - b[1]) + "i";
        System.out.println(c);
    }
}

public class I {
    public static void main(String[] args) {
        IntegerCalculator ic = new IntegerCalculator(5, 10, "TEST1");
        ic.add();
        ic.subtract();
        ic.printName();
        int[] a = { 10, 20 };
        int[] b = { 5, 6 };
        ComplexCalculator cc = new ComplexCalculator(a, b, "TEST2");
        cc.add();
        cc.subtract();
        cc.printName();
    }
}
