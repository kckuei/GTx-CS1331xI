import java.util.Scanner;
import java.util.Objects;
import java.text.DecimalFormat;

public class Sandbox {

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
	DecimalFormat tForm = new DecimalFormat("##.00");
	System.out.println(tForm.format(12682.1));
	
	String funnyStr = "south, long island";
	funnyStr = funnyStr.replace("!"," ");
	funnyStr = funnyStr.replace("the beach","");
	funnyStr = funnyStr.replace(", long", "");
	funnyStr = funnyStr.replace("wal","roc");
	funnyStr = funnyStr.toUpperCase();
	System.out.println(funnyStr);
	
	String[][] board = {{"black","black"},{"red",null}};
	System.out.println(stillRed(board));
  }

}
