import java.io.*;

public class TicTacToeDriver {
	
	public static void main(String[] args) throws IOException {
		
		TicTacToe game = new TicTacToe();
		
		int currentPlayer = 1; // let 1 represent cross, -1 represent circle
		int row, col;
		
		// for reading user input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {

			// print string representation of game board
		    System.out.println(game.toString());

		    // ask current player to make their move
			System.out.println("Enter the row number you want to mark "
					+ "(first row number is 1): ");
			row = Integer.parseInt(br.readLine());

		    System.out.println("Enter the column number you want to mark "
		    		+ "(first column number is 1): ");
		    col = Integer.parseInt(br.readLine());
		    
		    // update game board to set the mark if that space is empty
		    if (game.setMark(currentPlayer, row-1, col-1)) {
			    // switch to the other player
			    currentPlayer = currentPlayer * -1;		    	
		    } else {
		    	// tell same player to try again
		    	System.out.println("Invalid input! Try again.");
		    }

		     
		} while (game.checkGameStatus(row-1, col-1) == 0); // status 0 = playing, 1 = won, 2 = draw

		// print ending game board
		System.out.println(game.toString());
		
		// game ended means it's either a win or a draw
		if (game.getGameStatus() == 1) {
			System.out.println("You won!");
		} else {
			System.out.println("It's a draw..."); //TODO: Draw doesn't work
		}
		
	}
	
}
