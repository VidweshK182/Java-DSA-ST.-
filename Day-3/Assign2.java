import java.util.*;

class Assign2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the negative number:");
        int a = sc.nextInt();
        if(a<0){
            System.out.println("Signed("+a+">>2):"+(a>>2));
            System.out.println("Unsigned(" + a + ">>>2):" + (a >>> 2));
        }
    }
}
