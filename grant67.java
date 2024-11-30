import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class grant67 { //Maximum Path Sum II
    public static void main(String[] args) throws FileNotFoundException {
        int totalRows = 100;
        int totalColumns = 100;
        int[][] triangle = new int[totalRows][totalColumns];
        File file = new File("HW7\\0067_triangle.txt");
        Scanner scanner = new Scanner(file);
        int row = 0;
        while (scanner.hasNextLine() && row < totalRows) {
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            for (int i = 0; i < numbers.length; i++) {
                triangle[row][i] = Integer.parseInt(numbers[i]);
            }
            row++;
        }
        scanner.close();
        for (int i = totalRows - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
            }
        }
        System.out.println(triangle[0][0]);
    }
}
