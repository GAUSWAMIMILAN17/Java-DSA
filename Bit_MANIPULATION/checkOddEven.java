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

    public static int setIthBit(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = 1<<i;
        return (n & (~bitMask));
    }

    public static int updateIthBit(int n, int i, int newBit) {
//        if(newBit == 0){
//            return clearIthBit(n, i);
//        }
//        else {
//            return setIthBit(n, i);
//        }

        n = clearIthBit(n,i);
        int bitMask = newBit<<i;
        return (n | bitMask);
    }

    static void main() {
//        OddEven(10);
//        OddEven(11);
//        System.out.println(getIthBit(10,2));
//        System.out.println(setIthBit(10,2));
//        System.out.println(clearIthBit(10,1));
        System.out.println(updateIthBit(10,2,1));
    }
}
