package lecture03.java;

public class Main {

    public static void printAgeIfPerson(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;
            System.out.println(person.getAge());
        }
    }

    public static String personInformation(Person person) {
        return String.format("사람의 이름은 %s이고 나이는 %s세 입니다.",
                person.getName(),
                person.getAge());
    }

    public static void main(String[] args) {
        int number1 = 4;
        long number2 = number1; // 더 큰 타입으로 암시적으로 형변환
        System.out.println(number1 + number2);

        Person person = new Person("who-hoo", 100);
        printAgeIfPerson(person);

        System.out.println(personInformation(person));
    }
}
