package AtSchool.InnerClasses;

public class ClassWithNonStaticInner {
    private int a;

    public ClassWithNonStaticInner(int a) {
        this.a = a;
    }

    public void printA(){
        System.out.println("a: " + a);
    }

    public Vnutreniy publicMethod() {
        //Так нельзя
        //variableOfInnerClass = 1;

        //Так можно
        Vnutreniy vnutreniy = new Vnutreniy();
        return vnutreniy;
    }

    public static void staticMethodOfOuterClass() {
    }

    public class Vnutreniy {
        int variableOfInnerClass;

        public void someMethod() {
            a = 3;
            staticMethodOfOuterClass();
        }

        public void changeA(int newA){
            a = newA;
        }
    }
}
