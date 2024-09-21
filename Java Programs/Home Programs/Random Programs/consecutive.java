import java.util.*;

public class consecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int b, c = 1;
        System.out.println("Enter the numbers");
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        a[3] = sc.nextInt();
        a[4] = sc.nextInt();
        Arrays.sort(a);
        for (b = 0; b <= 3; b++) {
            if (a[b] == a[b + 1] - 1) {
                c++;
            }
        }
        if (c == 5) {
            System.out.println("It can be arranged in cosecutive order");
        } else {
            System.out.println("It cannot be arranged in cosecutive order");
        }
    }
}