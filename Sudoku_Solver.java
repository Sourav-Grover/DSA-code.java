public class Sudoku_Solver {

	public static void main(String[] args) {
		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		SudokuSolver(grid, 0, 0);
	}

	public static void SudokuSolver(int[][] grid, int row, int col) {
		if (col == 9) {
			row++;
			col = 0;
		}
		if (row == 9) {
			Display(grid);
			return;
		}
		if (grid[row][col] != 0) {
			SudokuSolver(grid, row, col + 1);
		} else {
			for (int val = 1; val <= 9; val++) {
				if (isitsafe(grid, row, col, val)) {
					grid[row][col] = val;
					SudokuSolver(grid, row, col + 1);
					grid[row][col] = 0; // backtracking(undo) step
				}
			}
		}

	}

	public static boolean isitsafe(int[][] grid, int row, int col, int val) {
		// row
		for (int c = 0; c < grid[0].length; c++) {
			if (grid[row][c] == val) {
				return false;
			}
		}
		// col
		for (int r = 0; r < grid[0].length; r++) {
			if (grid[r][col] == val) {
				return false;
			}
		}

		// 3*3 Matrix
		int r = row - row % 3;
		int c = col - col % 3;
		for (int i = r; i < r + 3; i++) {
			for (int j = c; j < c + 3; j++) {
				if (grid[i][j] == val) {
					return false;
				}
			}
		}

		return true;
	}

	public static void Display(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}

	}

}
