package lecture09.java;

public class Main {

    public static void main(String[] args) {
        JavaPerson person = new JavaPerson("who-hoo", 100);
        System.out.println(person.getName());
        person.setAge(10);
        System.out.println(person.getAge());
    }
}
