import challenge_9.MorseCode;
import org.apache.cassandra.streaming.StreamOut;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MorseCodeTest {

    @Test
    public void transformTextToMorseCode(){

        MorseCode morseCodeTest = new MorseCode();

        String text = "Chocapic. Es una marca de cereales?";

        String morseText= morseCodeTest.textConversor(text);

        System.out.println(morseText);

        assertEquals(morseText, "———— ——— —·—· ·— ·——· ·· —·—· ·—·—·—  · ···  " +
                "··— —· ·—  —— ·— ·—· —·—· ·—  —·· ·  " +
                "—·—· · ·—· · ·— ·—·· · ··· ··——··");

    }

    @Test
    public void transformMorseCodeToText(){

        MorseCode morseCodeTest = new MorseCode();

        String text = "———— ——— —·—· ·— ·——· ·· —·—· ·—·—·—  · ···  ··— —· ·—  —— ·— ·—· —·—· ·—  —·· ·  " +
                "—·—· · ·—· · ·— ·—·· · ··· ··——··";

        String normalText= morseCodeTest.textConversor(text);

        System.out.println(normalText);

        assertEquals(normalText, "CHOCAPIC. ES UNA MARCA DE CEREALES?");

    }
}
