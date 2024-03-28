import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();
        int[][] tiles = new int[2][C];

        // Reading the tile colors
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < C; j++) {
                tiles[i][j] = scanner.nextInt();
            }
        }

        int totalPerimeter = 0;

        // Iterate through each tile
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < C; j++) {
                if (tiles[i][j] == 1) { // If the tile is wet (black)
                    totalPerimeter += calculateExposedSides(tiles, i, j, C);
                }
            }
        }

        System.out.println(totalPerimeter);
        scanner.close();
    }

    private static int calculateExposedSides(int[][] tiles, int row, int col, int C) {
        int exposedSides = 3; // A triangle has 3 sides

        // Check left side
        if (col > 0 && tiles[row][col - 1] == 1) {
            exposedSides--;
        }

        // Check right side
        if (col < C - 1 && tiles[row][col + 1] == 1) {
            exposedSides--;
        }

        // Check opposite row
        if (row == 0 && col < C && tiles[1][col] == 1) {
            exposedSides--;
        } else if (row == 1 && col < C && tiles[0][col] == 1) {
            exposedSides--;
        }

        return exposedSides;
    }
}