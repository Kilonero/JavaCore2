package Lesson_16;

public class ProdTovar extends Tovar {
    private int expire;

    public ProdTovar(String name, int price, int expire) {
        super(name, price);
        this.expire = expire;
    }

    public int getExpire() {
        return expire;
    }

    public void setExpire(int expire) {
        this.expire = expire;
    }

    @Override
    public String toString() {
        return "ProdTovar{" +
                "expire=" + expire +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void printInfo() {
        System.out.println(name + " " + price + " " + expire);
    }
}
