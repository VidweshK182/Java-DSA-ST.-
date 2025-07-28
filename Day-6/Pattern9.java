import java.util.*;

class Pattern9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int row=1;row<=n;row++){
            int sp = n-row;
            int st = (2*row)-1;
            int cval=1;
            for(int col=1;col<=sp;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=st;col++){
                System.out.print(cval);
                if(col<=(st/2)){
                    cval++;
                }
                else{
                    cval--;
                }
            }
        System.out.println();    
        }
    }
}
