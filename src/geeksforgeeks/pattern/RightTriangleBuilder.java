package geeksforgeeks.pattern;

// Java code to demonstrate right star triangle
public class RightTriangleBuilder {
    // Function to demonstrate printing pattern
    public static void drawRightTriangle(int rows) {
        int a, col;

        for (a = 0; a < rows; a++) {
            for (col = 0; col <= a; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    // Driver Function
    public static void main(String args[]) {
        int rows = 6;
        drawRightTriangle(rows);
    }
}
