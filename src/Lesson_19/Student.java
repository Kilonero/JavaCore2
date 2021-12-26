package Lesson_19;

public class Student {
    private String name;
    private int sball;

    public Student(String name, int sball) {
        this.name = name;
        this.sball = sball;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                ", sball=" + sball +
                '}';
    }
}
