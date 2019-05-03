import java.util.Scanner;
import java.util.stream.IntStream;

/***
 * Given a string. Find whether it is a palindrome, i.e. it reads the same both left-to-right and right-to-left.
 * Output “yes” if the string is a palindrome and “no” otherwise.
 *
 * Sample Input:
 * kayak
 *
 * Sample Output:
 * yes
 *
 *
 */


class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        String temp  = input.replaceAll("\\s+", "").toLowerCase();
        Boolean isPalindrome = IntStream.range(0, temp.length() / 2)
                .noneMatch(i -> temp.charAt(i) != temp.charAt(temp.length() - i - 1));

        if (isPalindrome) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
