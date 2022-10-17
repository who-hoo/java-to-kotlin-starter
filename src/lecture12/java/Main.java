package lecture12.java;

public class Main {

    public static void main(String[] args) {
        moveSomething(new Movable() {

            @Override
            public void move() {
                System.out.println("뚜벅 뚜벅");
            }

            @Override
            public void fly() {
                System.out.println("파닥 파닥");
            }
        });
    }

    private static void moveSomething(Movable movable) {
        movable.move();
        movable.fly();
    }
}
