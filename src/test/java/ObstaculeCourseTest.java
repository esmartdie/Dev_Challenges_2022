import challenge_17.ObstaculeCourse;
import org.testng.annotations.Test;

public class ObstaculeCourseTest {

    @Test
    public void raceTest_1(){

        String[] actions = { "run", "run", "jump", "run", "jump", "run" };
        String track = "__|_|_";
        ObstaculeCourse.evaluateRace(actions,track);
    }

    @Test
    public void raceTest_2(){

        String[] actions = { "run", "run", "jump", "run", "jump", "run" };
        String track = "_|_|_|_|_|_|_";
        ObstaculeCourse.evaluateRace(actions,track);
    }

    @Test
    public void raceTest_3(){

        String[] actions = { "run", "run", "jump", "run", "jump", "run" };
        String track = "_|_|_|";
        ObstaculeCourse.evaluateRace(actions,track);
    }
}
