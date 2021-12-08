package Lesson_12;

public class VagonDemo {
    public static void main(String[] args) {
        Vagon mesto1 = new Vagon("Сидячий", "Занят", 45, 17);
        Vagon mesto2 = new Vagon("Плацкарт", "Свободен",32 , 25);
        Vagon mesto3 = new Vagon("Купе", "Свободен",56 , 50);
        Vagon[] mesta = {mesto1, mesto2, mesto3};


        printMesta(mesta);

    }

    private static void printMesta(Vagon[] mesta) {
        for (int i = 0; i < mesta.length; i++) {
            System.out.println(mesta[i]);

        }
    }
}

















// (сидячее, плацкарт, купе)