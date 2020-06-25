package AtSchool.AccessControl;

public class ClassWithPublicMembers {
    public int publicMember;
    private int privateMember;

    public void publicMethod(){
        CLassWithPrivateMembers cLassWithPrivateMembers = new CLassWithPrivateMembers();
        //Ошибка
        //cLassWithPrivateMembers.privateMethod();
    }
}
