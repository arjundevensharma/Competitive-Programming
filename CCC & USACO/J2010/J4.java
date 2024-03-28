import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) break; // End of input

            int[] temperatures = new int[n];
            for (int i = 0; i < n; i++) {
                temperatures[i] = scanner.nextInt();
            }

            int[] differences = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                differences[i] = temperatures[i + 1] - temperatures[i];
            }

            System.out.println(findShortestCycleLength(differences));
        }

        scanner.close();
    }

    private static int findShortestCycleLength(int[] differences) {
        for (int cycleLength = 1; cycleLength <= differences.length; cycleLength++) {
            boolean isCycle = true;
            for (int i = cycleLength; i < differences.length; i++) {
                if (differences[i] != differences[i % cycleLength]) {
                    isCycle = false;
                    break;
                }
            }
            if (isCycle) {
                return cycleLength;
            }
        }
        return differences.length;
    }
}