package AtSchool;

public class BigBadWoolf implements Hunter, Animal, SocialAnimal {
    @Override
    public void chasePray(Animal prey) {

    }

    @Override
    public void prepareAmbush() {
        System.out.println("Терпеливый охотник дождется добычи");
    }

    @Override
    public void fightEnemy(Animal enemy) {
        System.out.println("Волк собирается драться!");
    }

    @Override
    public void investigateTraces() {
        System.out.println("Волк разыскивает добычу, нюхает следы");
    }

    @Override
    public void leadHunt(SocialAnimal... huntingGroup) {

    }

    @Override
    public void followLeader(SocialAnimal leader) {

    }

    @Override
    public void takePlaceInHierarhy(int priority) {

    }
}
