package Lesson_8;

public class Lesson091_1 {
    public static void main(String[] args) {
        Pramogolnic p0 = new Pramogolnic();
        p0.dlina = 12;
        p0.shirina = 10;
        Pramogolnic p1 = new Pramogolnic();
        p1.dlina = 9;
        p1.shirina = 5;
        Pramogolnic p2 = new Pramogolnic();
        p2.dlina = 7;
        p2.shirina = 3;


        Pramogolnic[] pramogolnics = new Pramogolnic[3];
        pramogolnics[0] = p0;
        pramogolnics[1] = p1;
        pramogolnics[2] = p2;
        int sumSquare = square(pramogolnics);
        System.out.println(sumSquare);
        printPramogolnic(pramogolnics);

    }
    static int square(Pramogolnic[] pramogolnics) {
        int sum = 0;
        for (int i = 0; i < pramogolnics.length; i++) {
            sum = sum + pramogolnics[i].plo();


        }
        return sum;

    }
    static void printPramogolnic(Pramogolnic[] pramogolnic) {
        for (int i = 0; i < pramogolnic.length; i++) {
            System.out.println(pramogolnic[i]);

        }
    }
}

