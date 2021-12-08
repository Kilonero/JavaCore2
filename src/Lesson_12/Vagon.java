package Lesson_12;

public class Vagon {
    private String tip;
    private String status;
    private int number;
    private int price;

    public Vagon() {
    }

    public Vagon(String tip, String status, int number, int price) {
        this.tip = tip;
        this.status = status;
        this.number = number;
        this.price = price;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "Вагон: " + tip + " / Cтатус места: " + status + " / Номер места: " + number + " / Цена: " + price;
    }





}
