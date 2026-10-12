class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (find(i, j, 0, board, word)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean find(int row, int col, int idx,
                        char[][] board, String word) {

        // Word completely matched
        if (idx == word.length()) {
            return true;
        }

        // Out of bounds or character doesn't match
        if (row < 0 || col < 0 ||
            row >= board.length || col >= board[0].length ||
            board[row][col] != word.charAt(idx)) {
            return false;
        }

        // Mark the current cell as visited
        char temp = board[row][col];
        board[row][col] = '#';

        // Explore all four directions
        boolean found =
                find(row - 1, col, idx + 1, board, word) ||
                find(row + 1, col, idx + 1, board, word) ||
                find(row, col - 1, idx + 1, board, word) ||
                find(row, col + 1, idx + 1, board, word);

        // Backtrack: restore the original character
        board[row][col] = temp;

        return found;
    }
}