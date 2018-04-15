import org.junit.Test;

import static org.junit.Assert.*;

public class GrudgerPlayerBehaviourTest {

    @Test
    public void shouldReturnCooperateAsFirstInput() {
        GrudgerPlayerBehaviour grudgerPlayerBehaviour = new GrudgerPlayerBehaviour();
        assertEquals(Input.COOPERATE, grudgerPlayerBehaviour.getInput(Input.COOPERATE));
    }

    @Test
    public void shouldReturnCooperateWhenInputOfOtherIsAlwaysCooperate() {
        GrudgerPlayerBehaviour grudgerPlayerBehaviour = new GrudgerPlayerBehaviour();
        assertEquals(Input.COOPERATE, grudgerPlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.COOPERATE, grudgerPlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.COOPERATE, grudgerPlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.COOPERATE, grudgerPlayerBehaviour.getInput(Input.COOPERATE));
    }

    @Test
    public void shouldReturnCheatOnceInputOfOtherIsCheat() {
        GrudgerPlayerBehaviour grudgerPlayerBehaviour = new GrudgerPlayerBehaviour();
        assertEquals(Input.COOPERATE, grudgerPlayerBehaviour.getInput(Input.CHEAT));
        assertEquals(Input.CHEAT, grudgerPlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.CHEAT, grudgerPlayerBehaviour.getInput(Input.CHEAT));
        assertEquals(Input.CHEAT, grudgerPlayerBehaviour.getInput(Input.COOPERATE));
    }

    @Test
    public void shouldReturnCooperateUntilInputOfOtherIsCheat() {
        GrudgerPlayerBehaviour grudgerPlayerBehaviour = new GrudgerPlayerBehaviour();
        assertEquals(Input.COOPERATE, grudgerPlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.COOPERATE, grudgerPlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.COOPERATE, grudgerPlayerBehaviour.getInput(Input.CHEAT));
        assertEquals(Input.CHEAT, grudgerPlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.CHEAT, grudgerPlayerBehaviour.getInput(Input.COOPERATE));
    }
}