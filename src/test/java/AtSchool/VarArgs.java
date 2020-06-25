package AtSchool;

import org.junit.Test;

public class VarArgs {
    @Test
    public void test() {
        methodA(17, 24, 40);
        methodA();
        methodA(1);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100);
        }
        methodA(array);
        //Так нельзя
        //methodA(array, 5);
    }


    public void methodA(int... a) {
        System.out.println("в метод передано " + a.length + " аргументов");
        for (int i = 0; i < a.length; i++) {
            System.out.println("аргумент " + i + ": " + a[i]);
        }
        System.out.println("------------------------------");
    }

    public void methodA(int a){
        System.out.println("Этот метод не содержит аргументов переменной длины");
        System.out.println("------------------------------");
    }
}
