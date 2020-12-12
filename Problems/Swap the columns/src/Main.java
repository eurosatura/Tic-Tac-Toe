import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int swapFrom = scanner.nextInt();
        int swapTo = scanner.nextInt();
        int temp;

        for (int i = 0; i < rows; i++) {
            temp = matrix[i][swapTo];
            matrix[i][swapTo] = matrix[i][swapFrom];
            matrix[i][swapFrom] = temp;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}