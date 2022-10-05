import javafx.scene.paint.Color;
import java.lang.ModuleLayer.Controller;
import java.util.ResourceBundle.Control;

import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToeGame;
import cs331Helper.cs331TicTacToeController;

public class myTicTacToe implements cs331TicTacToeGame {

    cs331TicTacToeBoard board = new cs331TicTacToeBoard();
    cs331TicTacToeController controller = new cs331TicTacToeController();

    myTicTacToe() {
        controller.setControllerMessage("Select a square to start playing!");
        controller.addPlayer(new Players(board, "X", controller));
        controller.addPlayer(new Players(board, "O", controller));
    }

    public void invalidSquareChosen(int row, int col) {
        controller.setControllerMessage("Square chosen has already been taken. Try again.");
        board.squareAt(row, col).flashColor(Color.CRIMSON);
    }

    public void playerWins() {
        controller.setControllerMessage("Player " + ((Players) controller.getWinningPlayer()).getSymbol() + " wins!");
    }

    public void restartGame() {
        board.clearSymbols();
        controller.playAgain();
        controller.setControllerMessage("Select a square to start playing!");

    }

    public void noWinner() {
        controller.setControllerMessage("It's a tie.");

    }
}