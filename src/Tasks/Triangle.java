package Tasks;

public class Triangle {

    public static void main(String[] args) {
        printTriangle();

    }

    public static void printTriangle() {
        int rows = 7;
        for (int row = 1; row <= rows; row++) {
            for (int column = rows - 1; column >= row; column--) {
                for (int k = 1; k <= (2 * row - 1); k++) {
                    if ((row == rows) || ((k == 1) || k == (2 * row - 1))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();

            }
        }
    }
}
