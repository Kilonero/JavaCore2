package Lesson_13;

public class Uvlaghnitel {
    private String name;
    private String zapravlen;
    private String state;

    public Uvlaghnitel() {
        this.zapravlen = "Не заправлен";
        this.state = "Выключен";
    }

    public Uvlaghnitel(String name) {
        this();
        this.name = name;
    }

    public void turnOn() {
        if(zapravlen.equals("Заправлен")) {
            state = "Включен";
        }
    }

    public void turnOff() {
        state = "Выключен";
    }

    public void nalitVodi() {
        zapravlen = "Заправлен";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZapravlen() {
        return zapravlen;
    }

    public void setZapravlen(String zapravlen) {
        this.zapravlen = zapravlen;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Uvlaghnitel{" +
                "name='" + name + '\'' +
                ", zapravlen='" + zapravlen + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
