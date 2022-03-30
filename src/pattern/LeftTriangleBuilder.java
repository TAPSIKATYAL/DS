package pattern;

// Java code to demonstrate left star triangle
public class LeftTriangleBuilder {
    // Function to demonstrate printing pattern
    public static void drawLeftTriangle(int rows) {
        int a, col;

        for (a = 0; a < rows; a++) {
            for (col = rows - 1 - a; col > 0; col--) {
                System.out.print(" ");
            }

            for (col = 0; col <= a; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[]) {
        int input = 6;
        drawLeftTriangle(input);
    }
}
