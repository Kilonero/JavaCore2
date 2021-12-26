package Lesson_18;

public class Teacher extends Person {
    private String zvanie;

    public Teacher(String name, int age, String zvanie) {
        super(name, age);
        this.zvanie = zvanie;
    }

    public String getZvanie() {
        return zvanie;
    }

    public void setZvanie(String zvanie) {
        this.zvanie = zvanie;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", zvanie='" + zvanie + '\'' +
                '}';
    }
}
