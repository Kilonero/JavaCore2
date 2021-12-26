package Lesson_16;

public class PromTovar extends Tovar {
    private int discount;


    public PromTovar(String name, int price, int discount) {
        super(name, price);
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "PromTovar{" +
                "discount=" + discount +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void printInfo() {
        System.out.println(name + " " + (price - price * discount/100));
    }
}
