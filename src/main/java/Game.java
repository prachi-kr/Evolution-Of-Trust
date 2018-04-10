import java.io.IOException;

public class Game {

    InputReader inputReader;
    int numberOfMoves;
    int playerOneScore;
    int playerTwoScore;

    public Game(InputReader inputReader, int numberOfMoves) {
        this.inputReader = inputReader;
        this.numberOfMoves = numberOfMoves;
    }

    void start() throws IOException {
        for (int i = 0; i < numberOfMoves; i++) {
            OutputPair outputPair = TruthTable.getScore(inputReader.read());
            playerOneScore += outputPair.FirstOutput;
            playerTwoScore += outputPair.SecondOutput;
            System.out.println(playerOneScore + "," + playerTwoScore);
        }
    }
}
