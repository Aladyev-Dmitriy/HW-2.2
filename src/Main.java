public class Main {
    public static void main(String[] args) {

        int balance = 5000;
        int refill = 17000;
        int bonusCost = 1;
        int bonus;

        if (refill > 1000) {
            bonus = bonusCost * (refill / 100);
        } else {
            bonus = 0;
        }

        System.out.println("Бонус составил =" + (bonus));
        System.out.println("Баланс=" + (balance + refill + bonus));
    }
}