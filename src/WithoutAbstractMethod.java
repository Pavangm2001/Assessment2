// Solution for Question-5 //

abstract class Shape {
    void display() {
        System.out.println("This is a shape");
    }

    void info() {
        System.out.println("Shapes have different sizes and forms");
    }
}

class Circle extends Shape {
    // nothing to override
}

public class WithoutAbstractMethod {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.display();
        c.info();
    }
}
