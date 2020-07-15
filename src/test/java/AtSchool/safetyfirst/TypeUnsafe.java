package AtSchool.safetyfirst;

public class TypeUnsafe {
    Object[] data;

    public TypeUnsafe(Object[] data) {
        this.data = data;
    }

    public void info() {
        for (Object obj : data) {
            if (obj != null)
                System.out.println(obj.toString());
            else
                System.out.println("null");
        }
    }

    //Можно добавить любой элемент,
    // что в дальнейшем может привести к проблемам при обработке данных
    public void add(int i, Object o) {
        data[i] = o;
    }

    public Object get(int i) {
        return data[i];
    }
}
