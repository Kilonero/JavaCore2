package Lesson_18.Dz;

public class Prymougolnik extends Figure {
    private int shirina;
    private int dlina;

    public Prymougolnik(int shirina, int dlina) {
        this.shirina = shirina;
        this.dlina = dlina;
    }

    public int getShirina() {
        return shirina;
    }

    public int getDlina() {
        return dlina;
    }

    @Override
    public double getPloshad() {
        return dlina * shirina;
    }
}
