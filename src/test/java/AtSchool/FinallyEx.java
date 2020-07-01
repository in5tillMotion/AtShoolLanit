package AtSchool;

import org.junit.Test;

public class FinallyEx {
    @Test
    public int example(){
        try{
            System.out.println("Занимаем некоторые ресурсы в блоке try");
            System.out.println("Возникает какое-то исключение");
            throw new Exception("Какое-то исключение");

        } catch (Exception e) {
            System.out.println("Обрабатывается исключение");
            e.printStackTrace();
            System.out.println("Выполняется выход из метода оператором return");
            return 5;
        }
        finally {
            System.out.println("Перед выходом из метода выполняется блок finally");
            System.out.println("Занятые ресурсы освобождаются");
        }
        // недостижимый код
       // return 4;
    }
}
