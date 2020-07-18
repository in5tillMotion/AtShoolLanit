package AtSchool;

import org.junit.Test;

public class Kotik {

    int satiety;
    String food;

    public Kotik(int satiety, String food) {
        this.satiety = satiety;
        this.food = food;
    }

    public Kotik() {
    }


    void sayMeow() {
        System.out.println("Котик Мяу-кает");
        satiety = satiety - 10;
    }

    void play() {
        System.out.println("Котик играется");
        satiety = satiety - 50;
    }

    void sleep() {
        System.out.println("Котик сладко спит");
        satiety = satiety - 60;
    }

    void chaseMouse() {
        System.out.println("Котик играет с мшыкой");
        satiety = satiety - 50;
    }

    void claw() {
        System.out.println("Котик точит когти");
        satiety = satiety - 10;
    }

    void wash() {
        System.out.println("Котик умывается");
        satiety = satiety - 10;
    }

    void eat() {
        eat(100, "kitekat");
    }

    void eat(int satiety) {
        this.satiety = satiety;

    }

    void eat(int satiety, String food) {
        this.satiety = satiety;
        this.food = food;
    }

    void liveAnotherDay() {
        int h = 6;
        for (int i = 0; i < 24; i++) {
            int flag = (int) (Math.random() * h + 1);
            if (satiety > 0) {
                switch (flag) {
                    case 1:
                        sayMeow();
                        break;
                    case 2:
                        eat();
                        break;
                    case 3:
                        play();
                        break;
                    case 4:
                        claw();
                        break;
                    case 5:
                        wash();
                        break;
                    case 6:
                        sleep();
                        break;

                    default:
                        throw new IllegalArgumentException("Incorrect value");
                }
            } else {
                System.out.println("Котик хочет кушать!!!");
                eat(100);
                System.out.println("Котик вдоволь наелся");
            }
        }
    }

    public static void main(String[] args) {
        Kotik kotik = new Kotik();
        kotik.liveAnotherDay();
    }
}


