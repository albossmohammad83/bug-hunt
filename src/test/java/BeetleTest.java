import edu.csc413.bugs.Beetle;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class BeetleTest {

    @Test
    public void getNameTest() {
        Beetle beetle1 = new Beetle("Beetle1");
        Beetle beetle2 = new Beetle("Beetle2");
        assertThat(beetle1.getName(), equalTo("Beetle1"));
        assertThat(beetle2.getName(), equalTo("Beetle2"));
    }

    @Test
    public void getNumLegsTest() {
        Beetle beetle1 = new Beetle("Beetle1");
        Beetle beetle2 = new Beetle("Beetle2");
        assertThat(beetle1.getNumLegs(), equalTo(6));
        assertThat(beetle2.getNumLegs(), equalTo(6));
    }

    @Test
    public void canFlyTest(){
        Beetle beetle1 = new Beetle("Beetle1");
        Beetle beetle2 = new Beetle("Beetle2");
        assertThat(beetle1.canFly(), equalTo(true));
        assertThat(beetle2.canFly(), equalTo(true));
    }

    @Test
    public void specialTraitTest(){
        Beetle beetle1 = new Beetle("Beetle1");
        Beetle beetle2 = new Beetle("Beetle2");
        assertThat(beetle1.specialTrait(), equalTo("strong"));
        assertThat(beetle2.specialTrait(), equalTo("strong"));
    }

}
