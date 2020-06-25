package AtSchool.AccessControl;

public class CLassWithPrivateMembers {
    private int privateMember;

    private void privateMethod(){
        ClassWithPublicMembers classWithPublicMembers = new ClassWithPublicMembers();
        privateMember = classWithPublicMembers.publicMember;
        classWithPublicMembers.publicMethod();
    }
}
