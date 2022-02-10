import edu.csc413.bugs.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TerrariumTest {

    @Test
    public void setUpBugsTest() {
        Terrarium terrarium = new Terrarium();
        terrarium.setUpBugs();
        assertThat(terrarium.getNumBugs(), equalTo(3));

    }

    @Test
    public void getNumBugsTest(){
        Terrarium terrarium = new Terrarium();
        terrarium.setUpBugs();
        assertThat(terrarium.getNumBugs(), equalTo(3));

    }

    @Test
    public void getBugTest(){
        Terrarium terrarium = new Terrarium();
        terrarium.setUpBugs();
        assertThat(terrarium.getBug(0).getName(), equalTo("Juice"));
        assertThat(terrarium.getBug(1).getName(), equalTo("Charlotte"));
        assertThat(terrarium.getBug(2).getName(), equalTo("Boris"));
    }

    @Test
    public void getBugWithNameTest(){
        Terrarium terrarium = new Terrarium();
        terrarium.setUpBugs();
        assertThat(terrarium.getBugWithName("Juice").getName(), equalTo("Juice"));
        assertThat(terrarium.getBugWithName("Charlotte").getName(), equalTo("Charlotte"));
        assertThat(terrarium.getBugWithName("Boris").getName(), equalTo("Boris"));
        assertThat(terrarium.getBugWithName("john"), equalTo(null));
    }

    @Test
    public void getBugsWithLegsTest(){
        Terrarium terrarium = new Terrarium();
        terrarium.setUpBugs();
        assertThat(terrarium.getBugsWithLegs(6).size(), equalTo(2));
        assertThat(terrarium.getBugsWithLegs(8).size(), equalTo(1));
        assertThat(terrarium.getBugsWithLegs(1).isEmpty(), equalTo(true));

    }


}

