import java.util.*;

public class determinant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix;
        int size, determinant;
        System.out.println("Enter the size");
        size = sc.nextInt();
        matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Enter numbers of row " + (i + 1) + " and of column " + (j + 1));
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " , ");
            }
            System.out.println();
        }
        if (size == 3) {
            int a, b, c, d, e, f, g, h, i;
            a = matrix[0][0];
            b = matrix[0][1];
            c = matrix[0][2];
            d = matrix[1][0];
            e = matrix[1][1];
            f = matrix[1][2];
            g = matrix[2][0];
            h = matrix[2][1];
            i = matrix[2][2];
            determinant = a * ((e * i) - (h * f)) - b * ((d * i) - (g * f)) + c * ((d * h) - (g * e));
            System.out.println("The determinant of this matrix is " + determinant);
        }
        if (size == 2) {
            int a, b, c, d;
            a = matrix[0][0];
            b = matrix[0][1];
            c = matrix[1][0];
            d = matrix[1][1];
            determinant = (a * d) - (d * b);
            System.out.println("The determinant of this matrix is " + determinant);
        }
    }
}