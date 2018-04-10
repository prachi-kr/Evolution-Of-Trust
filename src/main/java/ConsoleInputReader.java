import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputReader implements InputReader {
    @Override
    public InputPair read() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input=reader.readLine();
        input.replaceAll(" ","");
        String[] stringArray=input.split(",");
        InputPair inputPair= new InputPair(Input.valueOf(stringArray[0].toLowerCase()),Input.valueOf(stringArray[1].toLowerCase()));
        return inputPair;
    }
}
