public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCEDFCA";
        boolean exists = exist(board, word);
        System.out.println("Does the word '" + word + "' exist in the board? " + exists);
    }

    private static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(char[][] board, String word, int i, int j, int index) {
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || word.charAt(index) != board[i][j]) {
            return false;
        }
        return dfs(board, word, i + 1, j, index + 1) ||
               dfs(board, word, i - 1, j, index + 1) ||
               dfs(board, word, i, j + 1, index + 1) ||
               dfs(board, word, i, j - 1, index + 1);
    }
}
