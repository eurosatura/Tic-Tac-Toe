import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String[][] string = new String[4][4];
        for (int i = 0; i < 4; i++) {
            string[i] = scanner.nextLine().split("");
        }
        boolean var = false;
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (string[i][j].equals(string[i - 1][j])
                && string[i][j].equals(string[i][j - 1])
                && string[i][j].equals(string[i - 1][j - 1])) {
                    var = true;
                    break;
                }
            }
        }
        System.out.println(var ? "NO" : "YES");


    }
}