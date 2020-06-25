package AtSchool.StaticMembers;

public class ClassWithStaticMembers {
    public static int staticVariable;

    public static void staticMethod() {
        //Не статические переменные - a b не доступны из статического контекста
        //Не статические методы method1() method2() тоже не доступны
        staticVariable = 5;
        //Статическая переменная доступна из статического контекста
    }

    public int a;
    private int b;

    public void method1() {
        staticMethod();
        System.out.println(staticVariable);
        //При этом из не статического контекста доступны все элементы статического
    }

    private void method2() {
    }
}
