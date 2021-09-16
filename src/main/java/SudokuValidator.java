import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://www.codewars.com/kata/529bf0e9bdf7657179000008/train/java
 * <p>
 * Sudoku Solution Validator
 * Write a function validSolution/ValidateSolution/valid_solution() that accepts a 2D array representing a Sudoku board,
 * and returns true if it is a valid solution, or false otherwise. The cells of the sudoku board may also contain 0's,
 * which will represent empty cells. Boards containing one or more zeroes are considered to be invalid solutions.
 * The board is always 9 cells by 9 cells, and every cell only contains integers from 0 to 9.
 */


public class SudokuValidator {

    public static void main(String[] args) {
        System.out.println("code");

        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}};

//        System.out.println(check(sudoku));

        sudoku[0][0]++;
        sudoku[1][1]++;
        sudoku[0][1]--;
        sudoku[1][0]--;
//        System.out.println(check(sudoku));

        sudoku[0][0]--;
        sudoku[1][1]--;
        sudoku[0][1]++;
        sudoku[1][0]++;
        sudoku[4][4] = 0;
//        System.out.println(check(sudoku));


        sudoku = new int[][]{{6, 4, 5, 9, 7, 8, 2, 1, 3},
                {9, 7, 8, 3, 1, 2, 5, 4, 6},
                {3, 1, 2, 6, 4, 5, 8, 7, 9},
                {4, 2, 3, 7, 5, 6, 9, 8, 1},
                {1, 8, 9, 4, 2, 3, 6, 5, 7},
                {7, 5, 6, 1, 8, 9, 3, 2, 4},
                {5, 3, 4, 8, 6, 7, 1, 9, 2},
                {2, 9, 1, 5, 3, 4, 7, 6, 8},
                {8, 6, 7, 2, 9, 1, 4, 3, 5}};
//        System.out.println(check(sudoku));

        int[][] sudoku1 = new int[][]{{3, 1, 2, 4, 5, 6, 7, 8, 9},
                {6, 4, 5, 7, 8, 9, 1, 2, 3},
                {9, 7, 8, 1, 2, 3, 4, 5, 6},
                {4, 2, 3, 5, 6, 7, 8, 9, 1},
                {7, 5, 6, 8, 9, 1, 2, 3, 4},
                {1, 8, 9, 2, 3, 4, 5, 6, 7},
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {2, 9, 1, 3, 4, 5, 6, 7, 8},
                {8, 6, 7, 9, 1, 2, 3, 4, 5}};

        int[][] sudoku2 = new int[][]
                {{9, 8, 7, 3, 1, 2, 5, 6, 4},
                        {6, 5, 4, 9, 7, 8, 2, 3, 1},
                        {3, 2, 1, 6, 4, 5, 8, 9, 7},
                        {1, 9, 8, 4, 2, 3, 6, 7, 5},
                        {7, 6, 5, 1, 8, 9, 3, 4, 2},
                        {4, 3, 2, 7, 5, 6, 9, 1, 8},
                        {8, 7, 6, 2, 9, 1, 4, 5, 3},
                        {2, 1, 9, 5, 3, 4, 7, 8, 6},
                        {5, 4, 3, 8, 6, 7, 1, 2, 9}};
        int[][] sudoku3 = new int[][]{{4, 6, 5, 9, 8, 7, 3, 2, 1}, {1, 3, 2, 6, 5, 4, 9, 8, 7}, {7, 9, 8, 3, 2, 1, 6, 5, 4}, {8, 1, 9, 4, 3, 2, 7, 6, 5}, {2, 4, 3, 7, 6, 5, 1, 9, 8}, {5, 7, 6, 1, 9, 8, 4, 3, 2}, {3, 5, 4, 8, 7, 6, 2, 1, 9}, {6, 8, 7, 2, 1, 9, 5, 4, 3}, {9, 2, 1, 5, 4, 3, 8, 7, 6}};
        int[][] sudoku4 = new int[][]{{1, 3, 2, 5, 4, 6, 9, 8, 7}, {4, 6, 5, 8, 7, 9, 3, 2, 1}, {7, 9, 8, 2, 1, 3, 6, 5, 4}, {5, 7, 6, 9, 8, 1, 4, 3, 2}, {2, 4, 3, 6, 5, 7, 1, 9, 8}, {8, 1, 9, 3, 2, 4, 7, 6, 5}, {3, 5, 4, 7, 6, 8, 2, 1, 9}, {6, 8, 7, 1, 9, 2, 5, 4, 3}, {9, 2, 1, 4, 3, 5, 8, 7, 6}};
        int[][] sudoku5 = new int[][]{{2, 3, 1, 4, 6, 5, 9, 8, 7}, {5, 6, 4, 7, 9, 8, 3, 2, 1}, {8, 9, 7, 1, 3, 2, 6, 5, 4}, {3, 4, 2, 5, 7, 6, 1, 9, 8}, {6, 7, 5, 8, 1, 9, 4, 3, 2}, {9, 1, 8, 2, 4, 3, 7, 6, 5}, {4, 5, 3, 6, 8, 7, 2, 1, 9}, {7, 8, 6, 9, 2, 1, 5, 4, 3}, {1, 2, 9, 3, 5, 4, 8, 7, 6}};
        int[][] sudoku6 = new int[][]{{5, 6, 4, 7, 9, 8, 2, 3, 1}, {8, 9, 7, 1, 3, 2, 5, 6, 4}, {2, 3, 1, 4, 6, 5, 8, 9, 7}, {9, 1, 8, 2, 4, 3, 6, 7, 5}, {6, 7, 5, 8, 1, 9, 3, 4, 2}, {3, 4, 2, 5, 7, 6, 9, 1, 8}, {1, 2, 9, 3, 5, 4, 7, 8, 6}, {7, 8, 6, 9, 2, 1, 4, 5, 3}, {4, 5, 3, 6, 8, 7, 1, 2, 9}};
        int[][] sudoku7 = new int[][]{{6, 4, 5, 7, 9, 8, 2, 3, 1}, {9, 7, 8, 1, 3, 2, 5, 6, 4}, {3, 1, 2, 4, 6, 5, 8, 9, 7}, {4, 2, 3, 5, 7, 6, 9, 1, 8}, {1, 8, 9, 2, 4, 3, 6, 7, 5}, {7, 5, 6, 8, 1, 9, 3, 4, 2}, {5, 3, 4, 6, 8, 7, 1, 2, 9}, {2, 9, 1, 3, 5, 4, 7, 8, 6}, {8, 6, 7, 9, 2, 1, 4, 5, 3}};
        int[][] sudoku8 = new int[][]{{4, 6, 5, 8, 7, 9, 2, 1, 3}, {7, 9, 8, 2, 1, 3, 5, 4, 6}, {1, 3, 2, 5, 4, 6, 8, 7, 9}, {2, 4, 3, 6, 5, 7, 9, 8, 1}, {5, 7, 6, 9, 8, 1, 3, 2, 4}, {8, 1, 9, 3, 2, 4, 6, 5, 7}, {3, 5, 4, 7, 6, 8, 1, 9, 2}, {9, 2, 1, 4, 3, 5, 7, 6, 8}, {6, 8, 7, 1, 9, 2, 4, 3, 5}};
        int[][] sudoku9 = new int[][]{{2, 3, 1, 4, 6, 5, 9, 8, 7}, {5, 6, 4, 7, 9, 8, 3, 2, 1}, {8, 9, 7, 1, 3, 2, 6, 5, 4}, {3, 4, 2, 5, 7, 6, 1, 9, 8}, {9, 1, 8, 2, 4, 3, 7, 6, 5}, {6, 7, 5, 8, 1, 9, 4, 3, 2}, {4, 5, 3, 6, 8, 7, 2, 1, 9}, {7, 8, 6, 9, 2, 1, 5, 4, 3}, {1, 2, 9, 3, 5, 4, 8, 7, 6}};
        int[][] sudoku10 = new int[][]{{6, 4, 5, 7, 9, 8, 3, 2, 1}, {3, 1, 2, 4, 6, 5, 9, 8, 7}, {9, 7, 8, 1, 3, 2, 6, 5, 4}, {4, 2, 3, 5, 7, 6, 1, 9, 8}, {7, 5, 6, 8, 1, 9, 4, 3, 2}, {1, 8, 9, 2, 4, 3, 7, 6, 5}, {8, 6, 7, 9, 2, 1, 5, 4, 3}, {5, 3, 4, 6, 8, 7, 2, 1, 9}, {2, 9, 1, 3, 5, 4, 8, 7, 6}};

        int[][] sudoku11 = new int[][]{{4, 8, 6, 7, 3, 1, 9, 5, 2},
                                       {1, 5, 3, 4, 9, 7, 6, 2, 8},
                                       {6, 1, 8, 9, 5, 3, 2, 7, 4},
                                       {9, 4, 2, 3, 8, 6, 5, 1, 7},
                                       {5, 9, 7, 8, 4, 2, 1, 6, 3},
                                       {8, 3, 1, 2, 7, 5, 4, 9, 6},
                                       {3, 7, 5, 6, 2, 9, 8, 4, 1},
                                       {7, 2, 9, 1, 6, 4, 3, 8, 5},
                                       {2, 6, 4, 5, 1, 8, 7, 3, 9}};
        System.out.println(check(sudoku1));
        System.out.println(check(sudoku2));
        System.out.println(check(sudoku3));
        System.out.println(check(sudoku4));
        System.out.println(check(sudoku5));
        System.out.println(check(sudoku6));
        System.out.println(check(sudoku7));
        System.out.println(check(sudoku8));
        System.out.println(check(sudoku9));
        System.out.println(check(sudoku10));
        System.out.println(check(sudoku11));

    }

    public static boolean check(int[][] sudoku) {
       return checkCell(sudoku,0,2) && checkCell(sudoku,3,5) && checkCell(sudoku,6,8) && checkHorVer(sudoku);
    }

    public static boolean checkCell(int[][] sudoku, int start, int end) {
        int[] gauge = new int[sudoku.length];
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                int variable = sudoku[i][j];
                if (!matchesRange(variable)) {
                    return false;
                }
                gauge[--variable] = 1;
            }
        }
        if (containZeroValue(gauge)) {
            return false;
        }
        return true;
    }

    public static boolean checkHorVer(int[][] sudoku) {

        for (int i = 0; i < sudoku.length; i++) {
            int[] vertical = new int[sudoku.length];
            int[] horizontal = new int[sudoku.length];
            for (int j = 0; j < sudoku[i].length; j++) {
                int variableHor = sudoku[i][j];
                int variableVert = sudoku[j][i];
                if (!matchesRange(variableHor) || !matchesRange(variableVert)) {
                    return false;
                }
                horizontal[--variableHor] = 1;
                vertical[--variableVert] = 1;
            }
            if (containZeroValue(horizontal) || containZeroValue(vertical)) {
                return false;
            }
        }
        return true;
    }

    private static boolean containZeroValue(int[] line) {
        for (int j = 0; j < line.length; j++) {
            if (line[j] != 1) {
                return true;
            }
        }
        return false;
    }

    private static boolean matchesRange(int val) {
        if (val < 1 || val > 9) {
            return false;
        }
        return true;
    }
}
