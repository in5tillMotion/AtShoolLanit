package AtSchool;

public class Fianl {
    final int ONE_FINAL_VARIABLE = 1;
    final int SECOND_FINAL_VARIABLE;

    public Fianl(int SECOND_FINAL_VARIABLE) {
        this.SECOND_FINAL_VARIABLE = SECOND_FINAL_VARIABLE;
    }

    public Fianl() {
        SECOND_FINAL_VARIABLE = 1;
    }

    public void method() {
        //Повторное присваивание для "Завершённых" переменных невозможно
        //ONE_FINAL_VARIABLE = 2;
        //SECOND_FINAL_VARIABLE = 1;
    }

}
