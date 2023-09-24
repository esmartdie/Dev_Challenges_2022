import challenge_19.TimeConverter;
import org.testng.annotations.Test;

import java.sql.Time;

public class TimeConverterTest {

    @Test
    public void conversorMilliseconds(){

        int day = 10;
        int hour = 8;
        int minute = 55;
        int seconds = 100;

        long testMilliseconds = TimeConverter.milliseconds(day, hour, minute, seconds);

        System.out.println(testMilliseconds);

    }
}
