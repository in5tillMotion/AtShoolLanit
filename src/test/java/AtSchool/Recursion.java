package AtSchool;

import org.junit.Test;

public class Recursion {

    @Test
    public void example() {
        System.out.println("Фaктopиaл 3 равен " + fact(3));
        System.out.println("Фaктopиaл 4 равен " + fact(4));
        System.out.println("Фaктopиaл 5 равен " + fact(5));
    }

    // это рекурсивный метод
    int fact(int n) {
        int result;
        if (n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}
