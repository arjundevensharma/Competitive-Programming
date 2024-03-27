package ISC4U;
import java.io.*;
import java.util.*;

public class ArjunSharmaWordHunt {
	
	/**
     * This program facilitates a 'word hunt' game, according to specified guidelines.
     * 
     * @author Arjun Sharma
     */
	
	//2d string arraylist representing grid of problem
    static ArrayList<ArrayList<String>> grid = new ArrayList<>(5);

    //3d boolean array tracking visited notes for depth-first search
    static boolean[][][] visited = new boolean[5][5][2];

    //arrays with possible movement directions defining adjacent node locations within the grid array
    static int[] dx = {1, -1, 0, 0, 0, 0, 0, 0, 1, -1};
    static int[] dy = {0, 0, 1, -1, 0, 0, 1, -1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1, 0, 0, 0, 0};

    public static void main(String[] args) throws IOException, InterruptedException {
        //welcome
        System.out.println("Welcome to Arjun's Word Hunt!");
        System.out.println("In this game, you will search for words in a 3D grid. Each word found will score points based on its coordinates in the grid.");

        //delay for readability
        Thread.sleep(2000); 

        Scanner in = new Scanner(System.in);

        //filename containing word grid
        String filename = "DATA41.txt";
        //scanner object reads from file
        Scanner fileIn = new Scanner(new File(filename));

        //initialize the grid two arraylist with empty size 2 arraylists within all 5 arraylists
        for (int i = 0; i < 5; i++) {
            grid.add(new ArrayList<>(Collections.nCopies(2, "")));
        }

        //populate grid with file data
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                grid.get(j).set(i, fileIn.nextLine());
            }
        }

        //amount of words searched
        int testCases = 5;

        //process user input for each word search / usability
        while (testCases -- > 0) {
            System.out.print("Enter a word to search in the grid: ");
            String s = in.next(); //making the program interactive
            System.out.println("\nSearching for '" + s + "'...");

            //delay for effect
            Thread.sleep(1000); 

            //score for found word calculated through depth-first search algorithm on every character in the grid
            int score = solve(s);
            System.out.println("The word '" + s + "' has a score of: " + score);
            System.out.println("----------------------------\n");

            //delay between words
            Thread.sleep(1500); 
        }

        // Closing statement for the game
        System.out.println("Thank you for playing Arjun's Word Hunt Game!");
    }

    /**
     * Method to find the highest score for a given keyword in the grid.
     * It initiates a depth-first search from each cell in the grid to find the maximum points.
     *
     * @param keyword The keyword to search for in the grid.
     * @return The maximum score achievable for the given keyword.
     */
    public static int solve(String keyword) {
        // Variable to keep track of the maximum points
        int max_pts = 0;

        // Triple nested loop to try starting the search from every cell in the grid
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    // Updating the maximum points
                	if (grid.get(k).get(i).charAt(j) == keyword.charAt(0)) {
                		max_pts = Math.max(max_pts, dfs(keyword, k, j, i, 0)); 
                	}
                }
            }
        }
        // Returning the maximum points founz
        return max_pts;
    }

    /**
     * Depth-first search algorithm to find the word in the grid, recursively searching for the word
     *
     * @param keyword The remaining part of the keyword to search for.
     * @param x       The current x-coordinate in the grid.
     * @param y       The current y-coordinate in the grid.
     * @param z       The current z-coordinate in the grid.
     * @param points  The pts accumulated so far.
     * @return The max points obtainable from the current position.
     */
    public static int dfs(String keyword, int x, int y, int z, int pts) {
        //check if node hasn't been visited before, if node exists on grid, and if node corresponds to the correct character in searched word
        if (x < 0 || x >= 5 || y < 0 || y >= 5 || z < 0 || z >= 2) return 0;
        if (visited[x][y][z] || grid.get(x).get(z).charAt(y) != keyword.charAt(0)) return 0;

        //base case; when one character is left, add the point value (coordinates) associated with that node and return the total points
        if (keyword.length() == 1) return pts + (x + y + z + 3);

        //current position is visited
        visited[x][y][z] = true;
        //max points stored from this pos
        int max_pts = 0;

        //dfs all adjacent nodes
        for (int i = 0; i < 10; i++) {
        	//dfs adjacent nodes
            int new_pts = dfs(keyword.substring(1), x + dx[i], y + dy[i], z + dz[i], pts + (x + y + z + 3));
            //take the max points of all adjacent nodes
            max_pts = Math.max(max_pts, new_pts);
        }

        //reset visited status so that outermost dfs calls aren't limited
        visited[x][y][z] = false;
        //return max obtainable points from position
        return max_pts;
    }
}