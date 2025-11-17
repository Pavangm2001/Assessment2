// Solution for Question-2 //

class A {

    public int pub = 10;
    protected int pro = 20;
    int def = 30;
    private int pri = 40;

    // method to display private variable
    public void showPrivate() {
        System.out.println("Private: " + pri);
    }
}


public class AccessModifiers {

    public static void main(String[] args) {
        A obj = new A();

        System.out.println("Public: " + obj.pub);
        System.out.println("Protected: " + obj.pro);
        System.out.println("Default: " + obj.def);

        obj.showPrivate();
    }
}
