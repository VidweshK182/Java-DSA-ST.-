import java.util.*;
class Assign1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        byte a = sc.nextByte();
        short b = sc.nextShort();
        int c = sc.nextInt();
        long d = sc.nextLong();
        float e = sc.nextFloat();
        double f = sc.nextDouble();
        System.out.println("Byte:"+a+",Range:"+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE );
        System.out.println("Short:"+b+",Range:" + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Int:" + c + ",Range:" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long:" + d + ",Range:" + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Float:" + e + ",Range:" + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Double:" + f + ",Range:" + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
    }
}
