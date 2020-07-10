package AtSchool;

import org.junit.Test;

public class Nature {
    @Test
    public void example() {
        Hunter hunter = new BigBadWoolf();
        hunter.prepareAmbush();
        hunter.investigateTraces();
        hunter.fightEnemy(new BigBadWoolf());
    }
}
