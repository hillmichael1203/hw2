import cs331Helper.cs331TicTacToeFrame;
import javafx.application.Application;
import javafx.stage.Stage;

public class App1 extends Application {

    public void start(Stage stage) {

        cs331TicTacToeFrame frame = new cs331TicTacToeFrame(stage);

        frame.addGame(new myTicTacToe());

    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
