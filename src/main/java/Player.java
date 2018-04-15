import java.io.IOException;

class Player {

    private int score;
    private PlayerBehaviour playerBehaviour;

    Player(PlayerBehaviour playerBehaviour) {
        this.score = 0;
        this.playerBehaviour = playerBehaviour;
    }

    int getScore() {
        return score;
    }

    void addToScore(int scoreToAdd) {
        this.score += scoreToAdd;
    }

    Input getPlayerInput() throws IOException {
        return getPlayerInput(Input.COOPERATE);
    }

    Input getPlayerInput(Input input) throws IOException {
        return playerBehaviour.getInput(input);
    }
}
