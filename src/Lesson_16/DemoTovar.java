package Lesson_16;

public class DemoTovar {
    public static void main(String[] args) {
        ProdTovar moloko = new ProdTovar("Зяба", 2, 10);
        PromTovar molotok = new PromTovar( "Тор",660, 10);

        Tovar[] vse = new Tovar[2];
        vse[0] = moloko;
        vse[1] = molotok;

        for (int i = 0; i < vse.length; i++) {
            vse[i].printInfo();
        }
    }
}
