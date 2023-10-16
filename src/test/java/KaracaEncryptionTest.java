import challenge_50.KaracaEncryption;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.testng.AssertJUnit.assertNull;

public class KaracaEncryptionTest {
    @Test
    public void testEncryptTextWithAlphabets() {
        KaracaEncryption encryptor = new KaracaEncryption();
        String originalText = "placa";
        String expectedEncryptedText = "0c0lpaca";

        String encryptedText = encryptor.letsEncryptText(originalText);

        assertEquals(expectedEncryptedText, encryptedText);
    }

    @Test
    public void testEncryptTextWithDigitsAndSpaces() {
        KaracaEncryption encryptor = new KaracaEncryption();
        String originalText = "Este es el penúltimo reto de programación del año";
        String expectedEncryptedText = "1ts1aca s1aca l1aca 3m2tlún1paca 3t1raca 1daca nó2c0m0rg3rpaca l1daca 3ñ0aca";

        String encryptedText = encryptor.letsEncryptText(originalText);

        assertEquals(expectedEncryptedText, encryptedText);
    }

    @Test
    public void testEncryptTextWithNoAlphabets() {
        KaracaEncryption encryptor = new KaracaEncryption();
        String originalText = "123!@#";

        String encryptedText = encryptor.letsEncryptText(originalText);

        assertNull(encryptedText);
    }
}
