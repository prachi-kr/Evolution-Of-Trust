import org.junit.Test;

import static org.junit.Assert.*;

public class CooperativePlayerBehaviourTest {

    @Test
    public void shouldReturnCooperateWhenInputOfOtherIsCooperate() {
        assertEquals(Input.COOPERATE, new CooperativePlayerBehaviour().getInput(Input.COOPERATE));
    }

    @Test
    public void shouldReturnCooperateWhenInputOfOtherIsCheat() {
        assertEquals(Input.COOPERATE, new CooperativePlayerBehaviour().getInput(Input.CHEAT));
    }

}