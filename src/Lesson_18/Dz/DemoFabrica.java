package Lesson_18.Dz;

import java.util.ArrayList;
import java.util.List;

public class DemoFabrica {
    public static void main(String[] args) {
        Krug krug = new Krug(4);
        Kvadrat kvadrat = new Kvadrat(5);
        Prymougolnik prymougolnik = new Prymougolnik(6,7);


//        Fabrica[] abc = new Fabrica[3];
//        abc[0] = krug;
//        abc[1] = kvadrat;
//        abc[2] = prymougolnik;
//
//        for (int i = 0; i < abc.length; i++) {
//            abc[i].printInfo();
        //}


        List<Figure> figures = new ArrayList<>();
        figures.add(krug);
        figures.add(kvadrat);
        figures.add(prymougolnik);

        double sum = 0;

        for (int i = 0; i < figures.size(); i++) {
            Figure figure = figures.get(i);
            sum = sum + figure.getPloshad();
        }

        System.out.println(sum * 2);

    }
}


