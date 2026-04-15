//LSB = 0 EVEN
//LSB = 1 ODD



package Bit_MANIPULATION;

public class checkOddEven {

    public static void OddEven(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println(" Even");
        } else  {
            System.out.println(" Odd");
        }
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }
        else {
            return 1;
        }
    }

    static void main() {
//        OddEven(10);
//        OddEven(11);
        System.out.println(getIthBit(10,2));
    }
}
