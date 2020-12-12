import java.util.Scanner;

class UltraMain {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] array = string.split(" ");
        boolean ordered = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(array[i - 1]) < 0) {
                ordered = false;
                break;
            }
        }
        System.out.println(ordered);

    }
}