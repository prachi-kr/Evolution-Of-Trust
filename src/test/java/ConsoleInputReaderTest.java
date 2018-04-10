import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

public class ConsoleInputReaderTest {

    @Test
    public void shouldReadInputFromUser() throws IOException {
            System.setIn(new ByteArrayInputStream("CHEAT,COOPERATE".getBytes()));
            assertEquals(new InputPair(Input.CHEAT, Input.COOPERATE), new ConsoleInputReader().read());
        }
    }
