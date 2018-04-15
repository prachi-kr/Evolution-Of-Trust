import java.io.IOException;

public class UserPlayerBehaviour implements PlayerBehaviour {

    private ConsoleInputReader consoleInputReader;

    @Override
    public Input getInput(Input input) throws IOException {
        return consoleInputReader.readSingleInput();
    }
}
