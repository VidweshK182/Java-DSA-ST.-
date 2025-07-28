import java.util.*;

class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
        for (int i = 1; i <= a; i++) {
            int val = b;
            for (int j = 1; j <= a; j++) {
                System.out.print(val + " ");
                val += 5;
            }
            System.out.println();
            b++;
        }
    }
}
