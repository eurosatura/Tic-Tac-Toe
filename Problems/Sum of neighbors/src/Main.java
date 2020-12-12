import java.util.Scanner;
class Main {

    private static String input;
    private static Scanner scanner = new Scanner(System.in);;
    private static boolean stop = false;
    private static StringBuilder string = new StringBuilder();
    private static String stringFirst;
    private static String[] allLines;

    public static void main(String[] args) {
        // put your code here
        inputData();
        int[][] matrix = getMatrix();
        matrix = fillTheMatrix(matrix);

        printTheMatrix(changeTheMatrix(matrix));



    }

    public static void printTheMatrix(int[][] matrix) {
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix[0].length; i++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.print("\n");
        }
    }

    public static int[][] changeTheMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] changedMatrix = new int[rows][cols];
        for (int j = 0; j < rows; j++) {
            for (int i = 0; i < cols; i++) {
                changedMatrix[j][i] =
                matrix[(j - 1 + rows) % rows][i] +
                matrix[(j + 1 + rows) % rows][i] +
                matrix[j][(i - 1 + cols) % cols] +
                matrix[j][(i + 1 + cols) % cols];
            }
        }
        return changedMatrix;
    }

    public static int[][] fillTheMatrix(int[][] matrix) {

        int counter = 0;
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[j][i] = Integer.parseInt(allLines[counter]);
                counter++;
            }
        }
        return matrix;
    }

    public static int[][] getMatrix() {

        String[] firstLine = stringFirst.split(" ");
        allLines = string.toString().split(" ");
        int cols = firstLine.length;
        int rows = allLines.length / cols;
        int[][] matrix = new int[rows][cols];
        return matrix;
    }

    public static void inputData() {

        while (!stop) {
            input = scanner.nextLine();
            if (input.equals("end")) {
                stop = true;
                break;
            }
            if (string.length() == 0) {
                string.append(input + " ");
                stringFirst = input;
            } else {
                string.append(input + " ");
            }
        }
    }
}