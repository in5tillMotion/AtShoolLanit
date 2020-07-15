package AtSchool.safetyfirst;

import java.lang.reflect.Array;

public class TypeSafe<T> {
    T[] genericData;

    public TypeSafe(T[] genericData) {
        this.genericData = genericData;
    }

    public void info() {
        //Все перебираемые элементы принадлежат к одному классу
        for (T el : genericData) {
            System.out.println(el.toString());
        }
    }

    //Можно добавить только элемент совместимый с типповым параметром Т
    public void add(int i, T el) {
        genericData[i] = el;
    }

    public T get(int i) {
        return genericData[i];
    }
}
