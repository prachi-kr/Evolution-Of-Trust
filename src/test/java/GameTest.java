import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {

    @Mock
    private InputReader reader;

    @Test
    public void shouldReturn0_0ForCHEATCHEAT() throws IOException {
        Game game = new Game(reader, 1);
        when(reader.read()).thenReturn(new InputPair(Input.CHEAT, Input.CHEAT));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        game.start();

        assertEquals("0,0\n", outputStream.toString());
    }

    @Test
    public void shouldReturn2_2ForCOOPERATECOOPERATE() throws IOException {
        Game game = new Game(reader, 1);
        when(reader.read()).thenReturn(new InputPair(Input.COOPERATE, Input.COOPERATE));
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        game.start();

        assertEquals("2,\n", outputStream.toString());
    }

}
