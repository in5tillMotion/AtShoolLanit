package AtSchool;

import org.junit.Test;

public class UpperLimit<T extends Number> {
    @Test
    public void example() {
        UpperLimit<Integer> ul1 = new UpperLimit<>();
        UpperLimit<Double> ul2 = new UpperLimit<>();
        // Ошибка
        // UpperLimit<String> ul3 = new UpperLimit<>();
    }

}
