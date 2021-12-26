package Lesson_19;

import java.util.ArrayList;
import java.util.List;

public class DemoStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("ivan", 7));
        students.add(new Student("dima", 9));
        students.add(new Student("pasha", 10));


        Student student = findByBall(students, 15);
        System.out.println(student);

    }

    static Student findByBall(List<Student> students, int ball) {
        Student result = null;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getSball() == ball) {
                result = students.get(i);
                break;
            }
        }
        return result;
    }
}
