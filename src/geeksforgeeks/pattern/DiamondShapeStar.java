package geeksforgeeks.pattern;

public class DiamondShapeStar {
    public static void drawPyramid(int input) {
        int printSpace = input;
        for (int row = 0; row < input; row++) {
            for (int col = 1; col < printSpace; col++) {
                System.out.print(" ");
            }
            printSpace--;
            for (int col = 0; col < 2*row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int printStar = input-1;
        for(int row = 0; row<input-1;row++)
        {
            for (int col = 0; col <= row; col++) {
                System.out.print(" ");
            }
            for(int col=0;col<(2*printStar)-1;col++)
            {
                System.out.print("*");
            }
            System.out.println();
            printStar--;
        }
    }

    public static void main(String args[]) {
        int input = 6;
        drawPyramid(input);
    }
}
