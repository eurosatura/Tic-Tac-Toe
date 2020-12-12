import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
        int[] numbers; // initialize the array
        numbers = new int[] {12, 17, 8, 101, 33};
        System.out.println(Arrays.toString(numbers));

 */

        String str1 = "aaabbcccdaa";
        String str2 = " ";

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            System.out.println(str2.length() - 1);
            if (ch != str2.charAt(str2.length() - 1)) {
                str2 += ch;
            }
        }
    }
}