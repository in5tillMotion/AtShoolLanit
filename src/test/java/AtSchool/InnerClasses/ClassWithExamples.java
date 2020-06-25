package AtSchool.InnerClasses;

import org.junit.Test;

public class ClassWithExamples {
    @Test
    public void example(){
        //С не статически классом такое не прокатит.
        //NonStaticInner.Vnutreniy vnutreniy = new NonStaticInner.Vnutreniy();

        //Зато прокатит такое
        ClassWithNonStaticInner variableOfOuterlLass = new ClassWithNonStaticInner(3);
        ClassWithNonStaticInner.Vnutreniy vnutreniy = variableOfOuterlLass.publicMethod();
        vnutreniy.changeA(9999);
        variableOfOuterlLass.printA();
        // Это возможно потому, что каждый объект нестатического внутреннего класса содержит в себе ссылку
        // на объект внешнего класса в котором он был создан,
        // и осуществляет доступ к элемента внешнего класса по этой ссылке
    }
}
