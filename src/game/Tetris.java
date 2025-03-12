package game;

/*
CLASS: YourGameNameoids
DESCRIPTION: Extending Game, YourGameName is all in the paint method.
NOTE: This class is the metaphorical "main method" of your program,
      it is your control center.

*/
import java.awt.*;
import java.util.ArrayList;

class Tetris extends Game {
	static int counter = 0;
	BoardManager boardManager = new BoardManager();

  public Tetris() {
    super("Tetris!",800,600);
    this.setFocusable(true);
	this.requestFocus();
  }
  
	public void paint(Graphics brush) {

	  boardManager.showBoard(brush);

	}
	public static void main (String[] args) {
   		Tetris a = new Tetris();
		a.repaint();
  }





	public class BoardManager {

		private ArrayList<Block> blockList;


		public BoardManager(){}

		public void addBlock(Polygon polyogn){

		}

		public void showBoard(Graphics brush){

			brush.setColor(Color.black);
			brush.fillRect(0, 0, width, height);
			brush.setColor(Color.gray);
			brush.fillRect(1, 1, 251, 1);
			brush.fillRect(1, 1, 1, 501);
			brush.fillRect(251, 1, 1, 501);
			brush.fillRect(1, 501, 250, 1);

			for (int i = 0; i < 19; i++) {
				for (int j = 0; j < 9; j++) {
					brush.fillRect(23 + 25 * j, 26 + 25 * i, 7, 1);
					brush.fillRect(26 + 25 * j, 23 + 25 * i, 1, 7);

				}
			}
		}
	}
}