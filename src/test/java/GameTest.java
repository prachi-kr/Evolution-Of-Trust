import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GameTest {

    @Mock
    private UserPlayerBehaviour userPlayerBehaviour;


    @Test
    public void shouldReturnCorrectScoreForDetectivePlayerAndGrudgerPlayer() throws IOException {
        Game game = new Game(new Player(new DetectivePlayerBehaviour()), new Player(new GrudgerPlayerBehaviour()), 7);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        game.start();

        assertEquals("3,7\n", outputStream.toString());
    }

    @Test
    public void shouldReturnCorrectScoreForDetectivePlayerAndCopyCatPlayer() throws IOException {
        Game game = new Game(new Player(new DetectivePlayerBehaviour()), new Player(new CopyCatPlayerBehaviour()), 6);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        game.start();

        assertEquals("8,8\n", outputStream.toString());
    }

    @Test
    public void shouldReturnCorrectScoreForDetectivePlayerAndCooperativePlayer() throws IOException {
        Game game = new Game(new Player(new DetectivePlayerBehaviour()), new Player(new CooperativePlayerBehaviour()), 5);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        game.start();

        assertEquals("12,4\n", outputStream.toString());
    }

    @Test
    public void shouldReturnCorrectScoreForDetectivePlayerAndCheaterPlayer() throws IOException {
        Game game = new Game(new Player(new DetectivePlayerBehaviour()), new Player(new CheaterPlayerBehaviour()), 5);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        game.start();

        assertEquals("-3,9\n", outputStream.toString());
    }

    @Test
    public void shouldReturnCorrectScoreForGrudgerPlayerAndCopyCatPlayerPlayer() throws IOException {
        Game game = new Game(new Player(new GrudgerPlayerBehaviour()), new Player(new CopyCatPlayerBehaviour()), 5);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        game.start();

        assertEquals("10,10\n", outputStream.toString());
    }

    @Test
    public void shouldReturnCorrectScoreForGrudgerPlayerAndCheaterPlayerPlayer() throws IOException {
        Game game = new Game(new Player(new GrudgerPlayerBehaviour()), new Player(new CheaterPlayerBehaviour()), 7);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        game.start();

        assertEquals("-1,3\n", outputStream.toString());
    }

    @Test
    public void shouldReturnCorrectScoreForGrudgerPlayerAndCooperativePlayer() throws IOException {
        Game game = new Game(new Player(new GrudgerPlayerBehaviour()), new Player(new CooperativePlayerBehaviour()), 6);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        game.start();

        assertEquals("12,12\n", outputStream.toString());
    }

    @Test
    public void shouldReturnCorrectScoreForCopyCatPlayerAndCheaterPlayer() throws IOException {
        Game game = new Game(new Player(new CopyCatPlayerBehaviour()), new Player(new CheaterPlayerBehaviour()), 7);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        game.start();

        assertEquals("-1,3\n", outputStream.toString());
    }

    @Test
    public void shouldReturnCorrectScoreForCopyCatPlayerAndCooperativePlayer() throws IOException {
        Game game = new Game(new Player(new CopyCatPlayerBehaviour()), new Player(new CooperativePlayerBehaviour()), 6);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        game.start();

        assertEquals("12,12\n", outputStream.toString());
    }

    @Test
    public void shouldReturnCorrectScoreForCheaterPlayerAndCooperativePlayer() throws IOException {
        Game game = new Game(new Player(new CheaterPlayerBehaviour()), new Player(new CooperativePlayerBehaviour()), 4);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        game.start();

        assertEquals("12,-4\n", outputStream.toString());
    }

    @Test
    public void shouldReturnCorrectScoreForUserPlayerAndCooperativePlayer() throws IOException {
        Game game = new Game(new Player(userPlayerBehaviour), new Player(new CooperativePlayerBehaviour()), 5);
        when(userPlayerBehaviour.getInput(any())).thenReturn(Input.CHEAT)
                .thenReturn(Input.CHEAT)
                .thenReturn(Input.COOPERATE)
                .thenReturn(Input.CHEAT)
                .thenReturn(Input.COOPERATE);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        game.start();

        assertEquals("13,1\n", outputStream.toString());
    }

    @Test
    public void shouldReturnCorrectScoreForUserPlayerAndCheaterPlayer() throws IOException {
        Game game = new Game(new Player(userPlayerBehaviour), new Player(new CheaterPlayerBehaviour()), 6);
        when(userPlayerBehaviour.getInput(any())).thenReturn(Input.CHEAT)
                .thenReturn(Input.CHEAT)
                .thenReturn(Input.COOPERATE)
                .thenReturn(Input.CHEAT)
                .thenReturn(Input.COOPERATE)
                .thenReturn(Input.COOPERATE);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        game.start();

        assertEquals("-3,9\n", outputStream.toString());
    }

    @Test
    public void shouldReturnCorrectScoreForUserPlayerAndGrudgerPlayer() throws IOException {
        Game game = new Game(new Player(userPlayerBehaviour), new Player(new GrudgerPlayerBehaviour()), 4);
        when(userPlayerBehaviour.getInput(any())).thenReturn(Input.COOPERATE)
                .thenReturn(Input.COOPERATE)
                .thenReturn(Input.CHEAT)
                .thenReturn(Input.CHEAT);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        game.start();

        assertEquals("7,3\n", outputStream.toString());
    }

    @Test
    public void shouldReturnCorrectScoreForUserPlayerAndDetectivePlayer() throws IOException {
        Game game = new Game(new Player(userPlayerBehaviour), new Player(new DetectivePlayerBehaviour()), 4);
        when(userPlayerBehaviour.getInput(any())).thenReturn(Input.CHEAT)
                .thenReturn(Input.CHEAT)
                .thenReturn(Input.COOPERATE)
                .thenReturn(Input.CHEAT);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        game.start();

        assertEquals("8,0\n", outputStream.toString());
    }

    @Test
    public void shouldReturnCorrectScoreForUserPlayerAndCopyCatPlayer() throws IOException {
        Game game = new Game(new Player(userPlayerBehaviour), new Player(new CopyCatPlayerBehaviour()), 4);
        when(userPlayerBehaviour.getInput(any())).thenReturn(Input.CHEAT)
                .thenReturn(Input.CHEAT)
                .thenReturn(Input.COOPERATE)
                .thenReturn(Input.COOPERATE);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        game.start();

        assertEquals("4,4\n", outputStream.toString());
    }
}
