package Lesson_10_books;


public class Card {
    String pan;
    String pin;
    int amount;

    Card(String pan, String pin, int amount) {
        this.pan = pan;
        this.pin = pin;
        this.amount = amount;
    }

    Card(String pan, String pin) {
        this.pan = pan;
        this.pin = pin;
    }

    int getAmount() {
        return amount;
    }

    int deposit(int toDeposit) {
        amount = amount + toDeposit;
        return amount;
    }

    int withDraw(int toWithdraw) {
        amount = amount - toWithdraw;
        return amount;
    }

    public String toString() {
        String result = "pan: " + pan + " pin: " + pin + " amount: " + amount;

        return result;
    }

    boolean equals(Card card2) {
        boolean result = this.pan.equals(card2.pan) && this.pin.equals(card2.pin);
        return result;
    }
}

