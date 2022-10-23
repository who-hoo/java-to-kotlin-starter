package lecture16.java;

public class Person {

    private final String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int nextYearAge() {
        System.out.println("멤버 함수");
        return this.age + 1;
    }

    public int getAge() {
        return age;
    }
}
