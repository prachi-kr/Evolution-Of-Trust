import java.io.IOException;

class Game {
    private final Player firstPlayer;
    private final Player secondPlayer;
    private final int numberOfMoves;


    Game(Player firstPlayer, Player secondPlayer, int numberOfMoves) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.numberOfMoves = numberOfMoves;
    }

    void start() throws IOException {
        Input firstPlayerInput;
        Input secondPlayerInput = secondPlayer.getPlayerInput();
        for (int i = 0; i < numberOfMoves; i++) {
            firstPlayerInput = firstPlayer.getPlayerInput(secondPlayerInput);
            secondPlayerInput = secondPlayer.getPlayerInput(firstPlayerInput);
            OutputPair outputPair = TruthTable.getScore(new InputPair(firstPlayerInput, secondPlayerInput));
            addScore(outputPair);
        }
        displayScore();
    }

    private void addScore(OutputPair outputPair) {
        outputPair.workWithOutput(firstPlayer::addToScore, true);
        outputPair.workWithOutput(secondPlayer::addToScore, false);
    }

    private void displayScore() {
        System.out.println(firstPlayer.getScore() + "," + secondPlayer.getScore());
    }
}
