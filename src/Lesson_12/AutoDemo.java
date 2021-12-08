package Lesson_12;

public class AutoDemo {
    public static void main(String[] args) {
        Auto bmw = new Auto("BMW", 200);
        Auto mers = new Auto("Mersedes", 250);
        Auto[] autos = {bmw, mers};

        printAutos(autos);

        bmw.gaz();
        mers.tormoz();
        mers.tormoz();
        printAutos(autos);
        mers.setSpeed(130);
        printAutos(autos);

    }

    private static void printAutos(Auto[] autos) {
        for (int i = 0; i < autos.length; i++) {
            System.out.println(autos[i]);
        }

    }
}
