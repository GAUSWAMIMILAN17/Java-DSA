package Patterns;

public class solidRectagle {

    static void main() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print((char)('A' + j-1));
            }
            System.out.println();
        }
    }
}
