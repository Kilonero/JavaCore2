package Lesson_18;

public class Student extends Person {
    private int sball;

    public Student(String name, int age, int sball) {
        super(name, age);
        this.sball = sball;
    }

    public int getSball() {
        return sball;
    }

    public void setSball(int sball) {
        this.sball = sball;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sball=" + sball +
                '}';
    }
}
