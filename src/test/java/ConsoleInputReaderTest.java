import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static junit.framework.TestCase.assertEquals;

public class ConsoleInputReaderTest {

    @Test
    public void shouldReadInputCHEATCOOPERATEFromUser() throws IOException {
        System.setIn(new ByteArrayInputStream("cheat,cooperate".getBytes()));
        assertEquals(new InputPair(Input.CHEAT, Input.COOPERATE), new ConsoleInputReader().readInputPair());
    }

    @Test
    public void shouldReadInputCHEATCHEATFromUser() throws IOException {
        System.setIn(new ByteArrayInputStream("CHEAT,CHEAT".getBytes()));
        assertEquals(new InputPair(Input.CHEAT, Input.CHEAT), new ConsoleInputReader().readInputPair());
    }

    @Test
    public void shouldReadInputCOOPERATECOOPERATEFromUser() throws IOException {
        System.setIn(new ByteArrayInputStream("COOPERATE,COOPERATE".getBytes()));
        assertEquals(new InputPair(Input.COOPERATE, Input.COOPERATE), new ConsoleInputReader().readInputPair());
    }

    @Test
    public void shouldReadInputCOOPERATECHEATFromUser() throws IOException {
        System.setIn(new ByteArrayInputStream("COOPERATE,CHEAT".getBytes()));
        assertEquals(new InputPair(Input.COOPERATE, Input.CHEAT), new ConsoleInputReader().readInputPair());
    }

    @Test
    public void shouldReadInputCHEATFromUser() throws IOException {
        System.setIn(new ByteArrayInputStream("cheat".getBytes()));
        assertEquals(Input.CHEAT, new ConsoleInputReader().readSingleInput());
    }

}