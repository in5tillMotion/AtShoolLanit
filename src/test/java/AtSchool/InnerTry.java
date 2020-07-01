package AtSchool;

import org.junit.Test;

public class InnerTry {
    @Test
    public void example(){
        try{
            int a = 13;
            int[] array = new int[6];
            try{
                int b = 0;
                //исключение ArithmeticException сгенерируется во внешнем блоке try
                array[100] = a/b;
                //Этот оператор не сможет его перехватить
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("catch внутренний");
                System.out.println(e);
            }
            //Но его сможет перехватить этот
        }catch (ArithmeticException e){
            System.out.println("catch наружный");
            System.out.println(e);
        }
    }
}
