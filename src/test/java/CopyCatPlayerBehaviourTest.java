import org.junit.Test;

import static org.junit.Assert.*;

public class CopyCatPlayerBehaviourTest {

    @Test
    public void shouldReturnFirstInputAsCooperate() {
        CopyCatPlayerBehaviour copyCatPlayerBehaviour = new CopyCatPlayerBehaviour();
        assertEquals(Input.COOPERATE, copyCatPlayerBehaviour.getInput(Input.COOPERATE));
    }

    @Test
    public void shouldReturnCheatWhenInputOfOtherIsCheatInPreviousRoundAndCooperateInThisRound() {
        CopyCatPlayerBehaviour copyCatPlayerBehaviour = new CopyCatPlayerBehaviour();
        copyCatPlayerBehaviour.getInput(Input.CHEAT);
        assertEquals(Input.CHEAT, copyCatPlayerBehaviour.getInput(Input.COOPERATE));
    }

    @Test
    public void shouldReturnCheatWhenInputOfOtherIsCheatInPreviousRoundAndCheatInThisRound() {
        CopyCatPlayerBehaviour copyCatPlayerBehaviour = new CopyCatPlayerBehaviour();
        copyCatPlayerBehaviour.getInput(Input.CHEAT);
        assertEquals(Input.CHEAT, copyCatPlayerBehaviour.getInput(Input.CHEAT));
    }

    @Test
    public void shouldReturnCooperateWhenInputOfOtherIsCooperateInPreviousRoundAndCooperateInThisRound() {
        CopyCatPlayerBehaviour copyCatPlayerBehaviour = new CopyCatPlayerBehaviour();
        copyCatPlayerBehaviour.getInput(Input.COOPERATE);
        assertEquals(Input.COOPERATE, copyCatPlayerBehaviour.getInput(Input.COOPERATE));
    }

    @Test
    public void shouldReturnCooperateWhenInputOfOtherIsCooperateInPreviousRoundAndCheatInThisRound() {
        CopyCatPlayerBehaviour copyCatPlayerBehaviour = new CopyCatPlayerBehaviour();
        copyCatPlayerBehaviour.getInput(Input.COOPERATE);
        assertEquals(Input.COOPERATE, copyCatPlayerBehaviour.getInput(Input.CHEAT));
    }


}