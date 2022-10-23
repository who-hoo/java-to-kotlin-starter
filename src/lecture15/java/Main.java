package lecture15.java;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] array = {100, 200};

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s %s%n", i, array[i]);
        }

        final List<Integer> numbers = Arrays.asList(100, 200);
        // 하나를 가져오기
        System.out.println(numbers.get(0));
        // for each
        for (Integer number : numbers) {
            System.out.println(number);
        }
        // 전통적인 for문
        for (int i = 0; i < numbers.size(); i++) {
            System.out.printf("%s %s%n", i, numbers.get(i));
        }
    }
}
