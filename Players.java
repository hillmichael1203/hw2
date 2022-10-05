import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToeController;
import cs331Helper.cs331TicTacToePlayer;
import cs331Helper.cs331TicTacToeSquare;

public class Players implements cs331TicTacToePlayer {

    // member variables
    private String symbol;
    private cs331TicTacToeBoard board;
    private cs331TicTacToeController controller;

    // parameterized constructor
    Players(cs331TicTacToeBoard inBoard, String inSymbol, cs331TicTacToeController inController) {
        board = inBoard;
        symbol = inSymbol;
        controller = inController;
    }

    public void selectSquare(int row, int col) {
        // setting square
        cs331TicTacToeSquare square = board.squareAt(row, col);
        square.markSquare(symbol);
        // preparing next turn
        board.clearHighlights();
        controller.setControllerMessage("Player " + symbol + " finsihed their turn");
        controller.finishedTurn();

    }

    // returning symbol
    public String getSymbol() {
        return this.symbol;
    }

}
