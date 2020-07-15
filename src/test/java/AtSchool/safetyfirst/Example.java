package AtSchool.safetyfirst;

import org.junit.Test;

public class Example {
    @Test
    public void unsafe() {
        TypeUnsafe dataInteger = new TypeUnsafe(new Object[10]);
        dataInteger.add(0, 3);
        dataInteger.add(1, "asdf");
        dataInteger.add(2, 3.5);
        dataInteger.add(3, new Object());
        dataInteger.add(4, 6);
        dataInteger.add(5, 7);
        dataInteger.info();
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            if (dataInteger.get(i) instanceof Integer){
                sum += (Integer) dataInteger.get(i);
            }
        }
    }

    @Test
    public void safe() {
        TypeSafe<Integer> data = new TypeSafe<>(new Integer[10]);
        data.add(0, 3);
        //Ошибки компиляции
        //data.add(1, "asdf");
        //data.add(2, 3.5);
        //data.add(3, new Object());
        data.add(1, 6);
        data.add(2, 7);
        data.info();
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += data.get(i);
        }
    }
}
