package AtSchool;

import org.junit.Test;

import java.util.Random;

public class PoorRandom {
    @Test
    public void exampleConstructors(){
        Random rnd3 = new Random();
        Random rnd1 = new Random(756);
        Random rnd2 = new Random(756);
        for (int i = 0; i < 100; i++) {
            System.out.println(rnd1.nextInt() + " = " + rnd2.nextInt());
        }
    }
    @Test
    public void DamnBall(){
        Random rnd3 = new Random();
        System.out.println("Я стану программистом?");
        System.out.println(rnd3.nextBoolean());
        System.out.println("Я пишу хороший код?");
        System.out.println(rnd3.nextBoolean());
        System.out.println("Хороший ли это пример?");
        System.out.println(rnd3.nextBoolean());
    }
}
