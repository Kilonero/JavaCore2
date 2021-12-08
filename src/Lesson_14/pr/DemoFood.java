package Lesson_14.pr;

public class DemoFood {
    public static void main(String[] args) {
        Cola light = new Cola("light");
        Pizza peperoni = new Pizza("peperoni");
        Lunch lunch = new Lunch();
        lunch.add(light);
        lunch.add(peperoni);
        Food[] foods = lunch.getFoods();

        for (int i = 0; i < lunch.getCount(); i++) {
            foods[i].eat();

        }
    }
}


