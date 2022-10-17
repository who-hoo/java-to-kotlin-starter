package lecture12.java;

import lecture12.kotlin.Person;

public class Main {

    public static void main(String[] args) {
        Person baby1 = Person.Factory.newBaby("baby1");
        Person baby2 = Person.newBaby("baby2");
    }
}
