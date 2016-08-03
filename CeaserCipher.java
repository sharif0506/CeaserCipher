package encryption.ceasercipher;

/**
 *
 * @author sharif rahman
 */
public class CeaserCipher {

    int asciiValue = 0;
    char aCharecter;

    public String encryptText(String plainText) {

        char[] myArray = new char[plainText.length()];
        String cipherText = null;
        for (int i = 0; i < (plainText.length()); i++) {
            aCharecter = plainText.charAt(i);
            asciiValue = (int) aCharecter;
            if (asciiValue >= 65 && asciiValue <= 90) {
                aCharecter = encryptUpperCaseCharecter(aCharecter);
                myArray[i] = aCharecter;
            } else if (asciiValue >= 97 && asciiValue <= 122) {
                aCharecter = encryptLowerCaseCharecter(aCharecter);
                myArray[i] = aCharecter;
            } else {
                myArray[i] = aCharecter;
            }
        }
        cipherText = String.valueOf(myArray);
        return cipherText;
    }

    private char encryptUpperCaseCharecter(char aCharecter) {
        asciiValue = (int) aCharecter;
        asciiValue = asciiValue - 65;
        asciiValue = asciiValue + 3;
        asciiValue = asciiValue % 26;
        asciiValue = asciiValue + 65;
        aCharecter = (char) asciiValue;
        return aCharecter;
    }

    private char encryptLowerCaseCharecter(char aCharecter) {
        asciiValue = (int) aCharecter;
        asciiValue = asciiValue - 97;
        asciiValue = asciiValue + 3;
        asciiValue = asciiValue % 26;
        asciiValue = asciiValue + 97;
        aCharecter = (char) asciiValue;
        return aCharecter;
    }

}
