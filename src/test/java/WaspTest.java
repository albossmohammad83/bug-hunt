import edu.csc413.bugs.Wasp;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class WaspTest {

    @Test
    public void getNameTest() {
        Wasp wasp1 = new Wasp("wasp1");
        Wasp wasp2 = new Wasp("wasp2");
        assertThat(wasp1.getName(), equalTo("wasp1"));
        assertThat(wasp2.getName(), equalTo("wasp2"));
    }

    @Test
    public void getNumLegsTest() {
        Wasp wasp1 = new Wasp("wasp1");
        Wasp wasp2 = new Wasp("wasp2");
        assertThat(wasp1.getNumLegs(), equalTo(6));
        assertThat(wasp2.getNumLegs(), equalTo(6));
    }

    @Test
    public void canFlyTest(){
        Wasp wasp1 = new Wasp("wasp1");
        Wasp wasp2 = new Wasp("wasp2");
        assertThat(wasp1.canFly(), equalTo(true));
        assertThat(wasp2.canFly(), equalTo(true));
    }

    @Test
    public void specialTraitTest(){
        Wasp wasp1 = new Wasp("wasp1");
        Wasp wasp2 = new Wasp("wasp2");
        assertThat(wasp1.specialTrait(), equalTo("mean"));
        assertThat(wasp2.specialTrait(), equalTo("mean"));
    }
}
