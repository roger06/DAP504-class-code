import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 *
 * Scanner would be a better class name but don't want to
 * confuse it with java.util.Scanner;
 */

public class MyScanner {


    public  int getUserInput() {

    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        int userNum = scanner.nextInt();
        return userNum;

    }




}
