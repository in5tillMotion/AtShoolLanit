package AtSchool;

import org.junit.Test;

public class ThrowEx {
    @Test
    public void example(){
        try {
            thisMethodWillThrowException();
        } catch (Exception e) {
            System.out.println("Исключение было перехвачено повторно");
            e.printStackTrace();
        }
    }

    public void thisMethodWillThrowException(){
        try {
            System.out.println("Выбрасываем тестовое исключение");
            throw new NullPointerException("Созданное для примера исключение");
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено внутри метода. Оно будет выброшенно повторно");
            throw e;
        }
    }
}
