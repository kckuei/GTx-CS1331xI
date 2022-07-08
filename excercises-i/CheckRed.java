public class CheckRed {

  public static boolean stillRed(String[][] board) {
    for (int r = 0; r < board.length; r++) {
        for (int c = 0; c < board[r].length; c++) {
            if (board[r][c] != null && board[r][c].equals("red")) {
                return true;
            }
        }
    }
    return false;
}

  public static void main(String[] arg) {
	String[][] board = {{"black","black"},{"red",null}};
	System.out.println(stillRed(board));
  }

}
