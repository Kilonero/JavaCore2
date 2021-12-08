package Lesson_10_books;

public class CardDemo {

    public static void main(String[] args) {
        Card visa = new Card("12345", "123", 1000);
        Card masterCard = new Card("10293", "420", 2000);
        Card alfaBank = new Card("34567", "840", 3000);
        Card[] cards = {visa, masterCard, alfaBank};

        printCards(cards);
        int mon = depositMoney(cards, "12345", "123", 100);
        System.out.println("Осталось на карте: " + mon);
        printCards(cards);
        mon = withdrawMoney(cards, "34567", "840", 500);
        System.out.println("Осталось: " + mon);
        printCards(cards);


    }

    static void printCards(Card[] cards) {
        System.out.println("Cards: ");
        for (int i = 0; i < cards.length; i++) {
            System.out.println(cards[i]);
        }
    }

    static int depositMoney(Card[] cards, String pan, String pin, int amount) {
        int money = 0;
        Card card = new Card(pan, pin);
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].equals(card)) {
               money = cards[i].deposit(amount);
            }
        }
        return money;
    }
    static int withdrawMoney(Card[] cards, String pan, String pin, int amount) {
        int money = 0;
        Card card = new Card(pan, pin);
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].equals(card)) {
                money = cards[i].withDraw(amount);
            }
        }
        return money;
    }
}


