package AtSchool;

import org.junit.Test;

public class ThrowsCheckedEx {

    @Test
    public void example(){
        try {
            someMethod();
        } catch (ClassNotFoundException e) {
            System.out.println("Перехватываем исключение из метода someMethod");
            e.printStackTrace();
        }
    }

    public void someMethod () throws ClassNotFoundException {
            System.out.println("Выбрасываем тестовое проверяемое исключение");
            throw new ClassNotFoundException("Созданное для примера исключение");
    }
}
