import java.util.*;

class Assign6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row:");
        int a = sc.nextInt();
        System.out.print("Enter column:");
        int b = sc.nextInt();
        int [] [] arr = new int[a][b];
        for(int[] i : arr){
            for (int j=0;j<b;j++) {
                i[j] = sc.nextInt();
        }
        }
        //Input

        System.out.println(Arrays.deepToString(arr)); //Print
        System.out.print("Diagonal Elements:");
        for (int i=0;i<a;i++) {
            for (int j = 0; j < b; j++) {
                if(i==j){
                    System.out.print(+arr[i][j]+" ");
                }
            }
        }

    }
}
