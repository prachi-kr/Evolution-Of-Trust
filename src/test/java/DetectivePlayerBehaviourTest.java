import org.junit.Test;

import static org.junit.Assert.*;

public class DetectivePlayerBehaviourTest {

    @Test
    public void shouldReturnCooperateCheatCooperateCooperateInFirst4RoundsWhenInputOfOtherIsAlwaysCooperate() {
        DetectivePlayerBehaviour detectivePlayerBehaviour = new DetectivePlayerBehaviour();
        assertEquals(Input.COOPERATE, detectivePlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.CHEAT, detectivePlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.COOPERATE, detectivePlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.COOPERATE, detectivePlayerBehaviour.getInput(Input.COOPERATE));
    }

    @Test
    public void shouldReturnCooperateCheatCooperateCooperateInFirst4RoundsWhenInputOfOtherIsAlwaysCheat() {
        DetectivePlayerBehaviour detectivePlayerBehaviour = new DetectivePlayerBehaviour();
        assertEquals(Input.COOPERATE, detectivePlayerBehaviour.getInput(Input.CHEAT));
        assertEquals(Input.CHEAT, detectivePlayerBehaviour.getInput(Input.CHEAT));
        assertEquals(Input.COOPERATE, detectivePlayerBehaviour.getInput(Input.CHEAT));
        assertEquals(Input.COOPERATE, detectivePlayerBehaviour.getInput(Input.CHEAT));
    }

    @Test
    public void shouldReturnCooperateCheatCooperateCooperateInFirst4RoundsWhenInputOfOtherIsCooperateCheatCooperateCooperate() {
        DetectivePlayerBehaviour detectivePlayerBehaviour = new DetectivePlayerBehaviour();
        assertEquals(Input.COOPERATE, detectivePlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.CHEAT, detectivePlayerBehaviour.getInput(Input.CHEAT));
        assertEquals(Input.COOPERATE, detectivePlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.COOPERATE, detectivePlayerBehaviour.getInput(Input.COOPERATE));
    }

    @Test
    public void shouldActLikeCopyCatAfter4thRoundWhenInputOfOtherIsCheatInRound2() {
        DetectivePlayerBehaviour detectivePlayerBehaviour = new DetectivePlayerBehaviour();
        assertEquals(Input.COOPERATE, detectivePlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.CHEAT, detectivePlayerBehaviour.getInput(Input.CHEAT));
        assertEquals(Input.COOPERATE, detectivePlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.COOPERATE, detectivePlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.COOPERATE, detectivePlayerBehaviour.getInput(Input.CHEAT));
        assertEquals(Input.CHEAT, detectivePlayerBehaviour.getInput(Input.COOPERATE));
    }

    @Test
    public void shouldActLikeCheatPlayerAfter4thRoundWhenInputOfOtherIsAlwaysCooperate() {
        DetectivePlayerBehaviour detectivePlayerBehaviour = new DetectivePlayerBehaviour();
        assertEquals(Input.COOPERATE, detectivePlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.CHEAT, detectivePlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.COOPERATE, detectivePlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.COOPERATE, detectivePlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.CHEAT, detectivePlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.CHEAT, detectivePlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.CHEAT, detectivePlayerBehaviour.getInput(Input.COOPERATE));
    }

    @Test
    public void shouldActLikeAlwaysCheatTill6thRoundAndCopyCatAfter6thRoundWhenInputOfOtherIsCheatIn6thRound() {
        DetectivePlayerBehaviour detectivePlayerBehaviour = new DetectivePlayerBehaviour();
        assertEquals(Input.COOPERATE, detectivePlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.CHEAT, detectivePlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.COOPERATE, detectivePlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.COOPERATE, detectivePlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.CHEAT, detectivePlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.CHEAT, detectivePlayerBehaviour.getInput(Input.CHEAT));
        assertEquals(Input.CHEAT, detectivePlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.COOPERATE, detectivePlayerBehaviour.getInput(Input.COOPERATE));
        assertEquals(Input.COOPERATE, detectivePlayerBehaviour.getInput(Input.CHEAT));
        assertEquals(Input.CHEAT, detectivePlayerBehaviour.getInput(Input.COOPERATE));
    }
}