package encryption.ceasercipher;

import java.util.Scanner;

/**
 *
 * @author sharif rahman
 */
public class CeaserCipherDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CeaserCipher cipher = new CeaserCipher();
        String inputText;
        System.out.println("Please enter some texts here:");
        Scanner input = new Scanner(System.in);
        inputText = input.nextLine();
        System.out.println("The encrypted text is:");
        System.out.println(cipher.encryptText(inputText));

    }

}
