package challenge_50;

/*
 * Enunciado: Crea una función que sea capaz de encriptar y desencriptar texto
 * utilizando el algoritmo de encriptación de Karaca
 * (debes buscar información sobre él).
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KaracaEncryption {

    public String letsEncryptText (String text){

        if (!evaluateAlphabetCharacter(text)){
            System.out.println("The text hasn't any alphabetical character");
            return null;
        }else{
            StringBuilder reverseTextLowerCase = reverseText(text);

            for(int i=0; i<reverseTextLowerCase.length(); i++){

                char currentChar = reverseTextLowerCase.charAt(i);
                if(Character.isDigit(currentChar)){
                    reverseTextLowerCase.replace(i,i+1,"1lpp0");
                    i+=4;
                }else if(currentChar=='a'){
                    reverseTextLowerCase.setCharAt(i,'0');
                }
                else if(currentChar=='e'){
                    reverseTextLowerCase.setCharAt(i,'1');
                }
                else if(currentChar=='i'){
                    reverseTextLowerCase.setCharAt(i,'2');
                }
                else if(currentChar=='o'){
                    reverseTextLowerCase.setCharAt(i,'3');
                }
                else if(currentChar=='u'){
                    reverseTextLowerCase.setCharAt(i,'4');
                }
            }

            return appendCharsAtWordEnd(reverseTextLowerCase);
        }
    }

    private String appendCharsAtWordEnd (StringBuilder textEncrypt){

        String[] words = textEncrypt.toString().split(" ");
        StringBuilder encryptedText = new StringBuilder();

        for (String word : words) {
            encryptedText.append(word).append("aca ");
        }

        return encryptedText.toString().trim();
    }

    private StringBuilder reverseText(String text) {
        String[] wordArray = text.split(" ");
        StringBuilder reversedText = new StringBuilder();

        for (String word : wordArray) {
            StringBuilder reversedWord = new StringBuilder(word.toLowerCase()).reverse();
            reversedText.append(reversedWord).append(" ");
        }

        return new StringBuilder(reversedText.toString().trim());
    }


    private boolean evaluateAlphabetCharacter(String text){

        String regex = ".*[a-zA-Z].*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }


}
