import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[7];
        int duplicate = 0, duplicateNumber = 0;
        System.out.println("Enter 7 numbers from 1 to 6 and one duplicate of any number");
        for (int i = 0; i <= 6; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        for (int n = 0; n <= 5; n++) {
            if (array[n] == array[n + 1]) {
                duplicate++;
                duplicateNumber = array[n];
            }
        }
        if (duplicate > 1) {
            System.out.println("ERROR!There are two duplicate numbers");
        } else if (duplicate == 1) {
            System.out.println("The duplicate number is " + duplicateNumber);
        } else {
            System.out.println("There is no duplicate number");
        }
    }
}