package lecture06.java;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // for-each
        List<Long> numbers = Arrays.asList(1L, 2L, 3L);
        for (Long number : numbers) {
            System.out.println(number);
        }

        // for(up)
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }

        // for(down)
        for (int i = 3; i >= 1; i--) {
            System.out.println(i);
        }

        // for(step)
        for (int i = 1; i <= 5; i += 2) {
            System.out.println(i);
        }

        // while
        int i = 1;
        while (i <= 3) {
            System.out.println(i++);
        }
    }
}
