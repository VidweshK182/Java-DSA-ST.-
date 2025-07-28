import java.util.*;

class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int num = (2 * i) + 1;
            for (int j = 0; j <= a - i - 1; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= num; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
