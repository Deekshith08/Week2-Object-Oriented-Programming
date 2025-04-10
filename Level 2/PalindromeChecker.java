//3
/*Create a PalindromeChecker class with an attribute text. Add methods to:
Check if the text is a palindrome.
Display the result.
 */

import java.util.Scanner;
public class PalindromeChecker {
    String text;

    public boolean isPalindrome(){
        StringBuilder s = new StringBuilder(text).reverse();
        if((s.toString()).equals(text)) return true;
        else return false;
    }

    public void printResult(){
        if(isPalindrome()) System.out.println("Its a palindrome");
        else System.out.println("Its not a palindrome");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String text = input.nextLine();
        PalindromeChecker p = new PalindromeChecker();
        p.text = text;
        p.printResult();

        input.close();
    }
}
