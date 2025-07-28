import java.util.*;
class Pattern7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++){  
            //int space = a-(i+1); 
            //int star = (2*i)+1;
            for(int j=a-i-1;j>0;j--){ 
                System.out.print("_"+" ");
            }
            for(int j=0;j< (2 * i) + 1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

/* 
i=0 space =2 star=1   
i=1 space=1  star=3    
i=2 space=0 star=5*/