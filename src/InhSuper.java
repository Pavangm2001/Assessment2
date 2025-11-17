// Solution for Question-1 //

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

   public  void sound() {
        System.out.println("Dog barks");
    }

   public  void show() {
        super.sound(); // calling parent class method
        sound();       // calling child class method
    }
}

public class InhSuper {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.show();
    }
}
