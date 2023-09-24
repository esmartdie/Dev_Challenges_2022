import challenge_12.Palindrome;
import org.testng.annotations.Test;

public class PalindromeTest {

    @Test
    public void isPalindrome_1(){

        boolean berta = Palindrome.isItAPalindrome("Ana lleva al oso la avellana.");
        System.out.println(berta);
    }

    @Test
    public void isPalindrome_2(){

        boolean berta = Palindrome.isItAPalindrome("Adivina ya te opina, ya ni miles origina, ya ni cetro me domina, ya ni monarcas, a repaso ni mulato carreta, acaso nicotina, ya ni cita vecino, anima cocina, pedazo gallina, cedazo terso nos retoza de canilla goza, de pánico camina, ónice vaticina, ya ni tocino saca, a terracota luminosa pera, sacra nómina y ánimo de mortecina, ya ni giros elimina, ya ni poeta, ya ni vida");
        System.out.println(berta);
    }

    @Test
    public void isPalindrome_3(){

        boolean berta = Palindrome.isItAPalindrome("¿Qué os ha parecido el reto?");
        System.out.println(berta);
    }
}
