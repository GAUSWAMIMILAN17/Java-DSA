//rule

//~0 = 1
//~1 = 0

//(LSB) - Least Significant Bit
//(MSB) - Most Significant Bit

//hear example of 5
//in our computer binery is 00000101
//                         MSB     LSB

//MSB => 0 => our talk to +5
//if MSB => 1 => talk to -5

//~5 = 101 -> 010

//00000101 => 1's Comp => 11111010 => MSB is 1 => -6
// i 2's Comp => 11111010 1's Comp=> 00000101 => add 1 => 00000110 => +6

package Bit_MANIPULATION;

public class BineryOnesComplement {
    static void main() {
        System.out.println(~5);
    }
}
