package pattern;

import static java.lang.System.*;

public class PyramidBuilder {
    public static void drawPyramid(int n) {
        int x = 0;
        for (int row = 0; row < n; row++) {
            x = row + 1;
            for (int col = row; col < n - 1; col++) {
                System.out.print(" ");
                System.out.print(" ");
            }
            for (int col = 1; col <= x; col++) {
                System.out.print(row + col + " ");
            }
            for (int col = 1; col < x; col++) {
                System.out.print(x + row - col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int input = 5;
        drawPyramid(input);
    }
}
