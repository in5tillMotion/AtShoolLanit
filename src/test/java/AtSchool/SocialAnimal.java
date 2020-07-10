package AtSchool;

public interface SocialAnimal {
    void leadHunt(SocialAnimal... huntingGroup);

    void followLeader(SocialAnimal leader);

    void takePlaceInHierarhy(int priority);
}
