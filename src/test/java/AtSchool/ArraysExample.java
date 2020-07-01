package AtSchool;

import org.junit.Test;

import java.util.Arrays;

public class ArraysExample {
    @Test
    public void example(){
        int[] arr1 = new int[5], arr2 = new int[5];
        Arrays.fill(arr1, 3);
        Arrays.fill(arr2, 5);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.equals(arr1, arr2));
    }
}
