import javafx.scene.paint.Color;
import java.lang.ModuleLayer.Controller;
import java.util.ResourceBundle.Control;

import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToeGame;
import cs331Helper.cs331TicTacToeController;

public class myTicTacToe implements cs331TicTacToeGame {

    public cs331TicTacToeBoard board = new cs331TicTacToeBoard();
    public cs331TicTacToeController controller = new cs331TicTacToeController();

    myTicTacToe() {
        // initializing controller variables
        controller.setControllerMessage("Select a square to start playing!");
        controller.addPlayer(new Players(board, "X", controller));
        controller.addPlayer(new Players(board, "O", controller));
    }

    public void invalidSquareChosen(int row, int col) {
        // flashing color when player selects square already chosen
        controller.setControllerMessage("Square chosen has already been taken. Try again.");
        board.squareAt(row, col).flashColor(Color.CRIMSON);
    }

    public void playerWins() {
        // displaying message using polymorphism
        controller.setControllerMessage("Player " + ((Players) controller.getWinningPlayer()).getSymbol() + " wins!");
    }

    public void restartGame() {
        // resetting game board
        board.clearSymbols();
        controller.playAgain();
        controller.setControllerMessage("Select a square to start playing!");

    }

    public void noWinner() {
        controller.setControllerMessage("It's a tie.");

    }
}