package AtSchool.CoolerEnums;

public enum PredefinedColors {
    RED(255, 0, 0, "Максимально красный"),
    GREEN(0, 255, 0, "Максимально зеленый"),
    BLUE(0, 0, 255, "Максимально синий"),
    BLACK(255, 255, 255, "Темнее черного"),
    WHITE(0, 0, 0, "Белый");
    private int red, green, blue;
    private String desc;

    PredefinedColors(int red, int green, int blue, String desc) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return desc +" {" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }

    public void method(){
        System.out.println("Этот метод делает что-то крутое, только еще ен ясно что");
    }
}
