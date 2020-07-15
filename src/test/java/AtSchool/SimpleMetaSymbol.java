package AtSchool;

import org.junit.Test;

public class SimpleMetaSymbol  {

    void setSomeValue(UpperLimit<?> val){

    }

    @Test
    public void example() {
        UpperLimit<Integer> ul1 = new UpperLimit<>();
        UpperLimit<Double> ul2 = new UpperLimit<>();
        setSomeValue(ul1);
        setSomeValue(ul2);
    }
}
