package geeksforgeeks.pattern;

public class ReversePyramidStarPattern {
    public static void drawPyramid(int input) {
        int starCount = input;
        for (int row = 0; row < input; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(" ");
            }

            for (int col = 0; col < (2 * starCount) - 1; col++) {
                System.out.print("*");
            }
            starCount--;
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int input = 9;
        drawPyramid(input);
    }
}
