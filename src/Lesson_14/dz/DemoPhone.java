package Lesson_14.dz;

public class DemoPhone {
    public static void main(String[] args) {
        Melody mc = new Melody("Scriptonit", "Baby mama");
        Phone iphone = new MobilePhone("iphone", 556978, mc);
        HomePhone lg = new HomePhone("lg", 456789, "bzz");

        Phone[] mob = {iphone, lg};
        for (int i = 0; i < mob.length; i++) {
            mob[i].call();

        }






    }

}
