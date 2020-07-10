package AtSchool;

public interface Animal {
    default void makeSomeNoise(){
        System.out.println("Издает звуки животного");
    }
}
