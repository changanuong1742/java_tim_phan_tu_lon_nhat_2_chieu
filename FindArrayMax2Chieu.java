import java.util.Scanner;

public class FindArrayMax2Chieu {
    public static void main(String[] args) {

        int[][] array = new int[3][3];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter " + array.length + " rows and " +
                array[0].length + " columns: ");
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = input.nextInt();
            }
        }


        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }

        int maxRow = 0;
        int indexOfMaxRow = 0;

        for (int column = 0; column < array[0].length; column++) {
            maxRow += array[0][column];
        }
        for (int row = 1; row < array.length; row++) {
            int totalOfThisRow = 0;
            for (int column = 0; column < array[row].length; column++)
                totalOfThisRow += array[row][column];
            if (totalOfThisRow > maxRow) {
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }
        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);

    }
}