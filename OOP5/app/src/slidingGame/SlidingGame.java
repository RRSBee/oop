package slidingGame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * A template of a sliding game
 */
public class SlidingGame implements Configuration {

	public static final int N = 3, SIZE = N * N, HOLE = SIZE;
	/**
	 * The board is represented by a 2-dimensional array; the position of the hole
	 * is kept in 2 variables holeX and holeY
	 */
	private int[][] board;
	private int holeX, holeY;
	private int manhattanDist = 1337;

	/**
	 * A constructor that initializes the board with the specified array
	 *
	 * @param start: a one dimensional array containing the initial board. The
	 *               elements of start are stored row-wise.
	 */
	public SlidingGame(int[] start) {
		board = new int[N][N];

		assert start.length == N * N : "Length of specified board incorrect";

		for (int p = 0; p < start.length; p++) {
			board[p % N][p / N] = start[p];
			if (start[p] == HOLE) {
				holeX = p % N;
				holeY = p / N;
			}
		}
		printPuzzle(start, 'x', true);
	}

	public void printPuzzle(int[] puzzle, char holeChar,boolean printSize) {

		// Print puzzle size
		if (printSize) { System.out.println(N + "x" + N); }
		// Print upper part of frame
		System.out.print("+");
		for (int i = 0; i < (puzzle.length - N + 1); i++) { System.out.print("-"); }
		System.out.print("+\n");

		// Print 'blocks' and side frames
		for (int p = 0; p < puzzle.length; p++) {
			if (p == 0) { System.out.print("|\s"); }
			System.out.print(((puzzle[p] == HOLE) ? Character.toString(holeChar) : puzzle[p]) + "\s");
			if ((p + 1) % N == 0 && p != (puzzle.length-1)) { System.out.print("|\n|\s"); }
		}
		System.out.print("|\n");

		// Print lower part of frame
		System.out.print("+");
		for (int i = 0; i < (puzzle.length - N + 1); i++) { System.out.print("-"); }
		System.out.print("+\n");
	}

	public int getManhattanDistance() {
		return manhattanDist;
	}

	/**
	 * Converts a board into a printable representation. The hole is displayed as a
	 * space
	 *
	 * @return the string representation
	 */
	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		for (int row = 0; row < N; row++) {
			for (int col = 0; col < N; col++) {
				int puzzel = board[col][row];
				buf.append(puzzel == HOLE ? "  " : puzzel + " ");
			}
			buf.append("\n");
		}
		return buf.toString();
	}

	@Override
	public boolean equals(Object o) {
		throw new UnsupportedOperationException("equals : not supported yet.");
	}

	@Override
	public boolean isSolution() {
		/* The given sliding game is a solution only if all numbers appear in a chronologic order
			AND the empty block is in the bottom-right corner. */

		throw new UnsupportedOperationException("successors : not supported yet.");
	}

	@Override
	public Collection<Configuration> successors() {
		throw new UnsupportedOperationException("successors : not supported yet.");
	}

	@Override
	public int compareTo(Configuration g) {
		throw new UnsupportedOperationException("compareTo : not supported yet.");
	}

	@Override
	public Configuration getParent() {
		throw new UnsupportedOperationException("parent: Not supported yet.");
	}

}
