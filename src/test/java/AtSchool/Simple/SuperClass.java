package AtSchool.Simple;

public class SuperClass {
    public int variableOfSuperClass;

    public void superClassMethod(){
        System.out.println("Это метод, определенный в родительском классе");
    }

    //Доступ к этому методу есть только у родительского класса, его нельзя вызвать извне или из дочернего класса
    private void privateMethodOfSuperClass(){

    }
}
