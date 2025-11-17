// Solution for Question-3 //


class Student {

    private String name;
    private int age;
    private int roll_no;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNo() {
        return roll_no;
    }

    public void setRollNo(int roll_no) {
        this.roll_no = roll_no;
    }

}

public class Encapsulation {

    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Pavan G M");
        s.setAge(24);
        s.setRollNo(500);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Roll No: " + s.getRollNo());
    }
}
