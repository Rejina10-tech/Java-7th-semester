// final class Calculator
class Calculator {
    // final String name;
    String name;

    public Calculator() {

    }

    public Calculator(String n) {
        name = n;
    }

    // final public void printDetails()
    public void printDetails() {
        System.out.println(name);
    }
}

class IntegerCalculator extends Calculator {
    int a, b;

    public IntegerCalculator() {

    }

    public IntegerCalculator(int x, int y, String n) {
        super(n);
        a = x;
        b = y;

    }

    public void printDetails() {
        super.printDetails();
        System.out.println(a + b);

    }
}

public class E {
    public static void main(String args[]) {
        IntegerCalculator ic = new IntegerCalculator(5, 10, "Test");
        ic.name = "ABC";
        ic.printDetails();
    }
}