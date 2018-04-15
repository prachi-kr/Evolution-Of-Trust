import org.junit.Test;

import static org.junit.Assert.*;

public class CheaterPlayerBehaviourTest {

    @Test
    public void shouldReturnCheatWhenInputOfOtherIsCheat() {
        assertEquals(Input.CHEAT, new CheaterPlayerBehaviour().getInput(Input.CHEAT));
    }

    @Test
    public void shouldReturnCheatWhenInputOfOtherIsCooperate() {
        assertEquals(Input.CHEAT, new CheaterPlayerBehaviour().getInput(Input.COOPERATE));
    }
}