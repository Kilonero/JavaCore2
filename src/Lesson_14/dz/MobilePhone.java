package Lesson_14.dz;

public class MobilePhone extends Phone {
    private Melody melody;

    public MobilePhone(String name, int number, Melody melody) {
        super(name, number);
        this.melody = melody;

    }

    public Melody getMelody() {
        return melody;
    }

    public void setMelody(Melody melody) {
        this.melody = melody;
    }

    public void call() {
        System.out.println("Играет мелодия " + melody);

    }


}
