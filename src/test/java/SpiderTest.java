import edu.csc413.bugs.Spider;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SpiderTest {

    @Test
    public void getNameTest() {
        Spider spider1 = new Spider("spider1");
        Spider spider2 = new Spider("spider2");
        assertThat(spider1.getName(), equalTo("spider1"));
        assertThat(spider2.getName(), equalTo("spider2"));
    }

    @Test
    public void getNumLegsTest() {
        Spider spider1 = new Spider("spider1");
        Spider spider2 = new Spider("spider2");
        assertThat(spider1.getNumLegs(), equalTo(8));
        assertThat(spider2.getNumLegs(), equalTo(8));
    }

    @Test
    public void specialTraitTest(){
        Spider spider1 = new Spider("Spider1");
        Spider spider2 = new Spider("Spider2");
        assertThat(spider1.specialTrait(), equalTo("webs"));
        assertThat(spider2.specialTrait(), equalTo("webs"));
    }

    @Test
    public void canFlyTest(){
        Spider spider1 = new Spider("Spider1");
        Spider spider2 = new Spider("Spider2");
        assertThat(spider1.canFly(), equalTo(false));
        assertThat(spider2.canFly(), equalTo(false));
    }
}
