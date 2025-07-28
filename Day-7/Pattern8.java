//Snake pattern numbers

import java.util.*;
 class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int val;
                if (col % 2 == 0) {
                    val = col * n + row + 1;
                } else {
                    val = (col + 1) * n - row;
                }
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}