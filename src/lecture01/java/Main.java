package lecture01.java;

public class Main {

    public static void main(String[] args) {
        long number1 = 10L;
        final long number2 = 10L;
        Long number3 = 1_000L;
        Person person = new Person("who-hoo");

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(person);
    }
}
