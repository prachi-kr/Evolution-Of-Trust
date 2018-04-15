import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputReader implements InputReader {
    @Override
    public InputPair readInputPair() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String[] stringArray = input.split(",");
        return new InputPair(Input.valueOf(stringArray[0].toUpperCase()), Input.valueOf(stringArray[1].toUpperCase()));
    }

    @Override
    public Input readSingleInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        return Input.valueOf(input.toUpperCase());
    }
}
