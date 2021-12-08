package Lesson_14.dz;

public class HomePhone extends Phone {
    private String buzzer;

    public HomePhone(String name, int number, String buzzer) {
        super(name, number);
        this.buzzer = buzzer;

    }

    public String getBuzzer() {
        return buzzer;
    }

    public void setBuzzer(String buzzer) {
        this.buzzer = buzzer;
    }

    public void call() {
        System.out.println("Звенит звонок " + buzzer);

    }
}

