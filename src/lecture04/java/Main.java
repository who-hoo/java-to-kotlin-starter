package lecture04.java;

public class Main {

    public static void main(String[] args) {
        JavaMoney money1 = new JavaMoney(2_000L);
        JavaMoney money2 = new JavaMoney(1_000L);
        JavaMoney money3 = new JavaMoney(1_000L);
        JavaMoney money4 = money2;

        System.out.println(money1.compareTo(money2) > 0);
        System.out.println("money2 == money3 = " + (money2 == money3));
        System.out.println("money2 == money4 = " + (money2 == money4));
        System.out.println("money2 equals money3 = " + money2.equals(money3));
        System.out.println("money2 equals money4 = " + money2.equals(money4));

        System.out.println(money1.plus(money2));
    }
}
