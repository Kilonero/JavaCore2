package Lesson_14.pr;

public class Lunch {
    private Food[] foods = new Food[5];
    private int count;

    public void add(Food food) {
        foods[count] = food;
        count++;
    }

    public Food[] getFoods() {
        return foods;
    }

    public int getCount() {
        return count;
    }
}
