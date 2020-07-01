package AtSchool;

import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsExample {
    @Test
    public void example() {
        List<Integer> l1 = new LinkedList<>(), l2 = new LinkedList<>();
        Integer a;
        for (int i = 0; i < 10; i++) {
            l1.add(i);
            l2.add(i);
        }
        System.out.println(l1);
        System.out.println(l2);
        System.out.println("3 встречается раз " + Collections.frequency(l1, 3));
        System.out.println("5 встречается раз " + Collections.frequency(l2, 5));
        System.out.println(l1);
        System.out.println(l2);
        System.out.println("Меняем порядок");
        Collections.reverse(l1);
        Collections.reverse(l2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println("Заполняем одинаковыми значениями");
        Collections.fill(l1, 3);
        Collections.fill(l2, 5);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println("3 встречается раз " + Collections.frequency(l1, 3));
        System.out.println("5 встречается раз " + Collections.frequency(l2, 5));
    }
}
