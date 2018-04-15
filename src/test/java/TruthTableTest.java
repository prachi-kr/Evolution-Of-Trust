import org.junit.Test;

import static org.junit.Assert.*;

public class TruthTableTest {

    @Test
    public void shouldGetScore2_2ForCooperateAndCooperate() {
        assertEquals(new OutputPair(2, 2), TruthTable.getScore(new InputPair(Input.COOPERATE, Input.COOPERATE)));
    }

    @Test
    public void checkScoreForCooperateAndCheat() {
        assertEquals(new OutputPair(-1, 3), TruthTable.getScore(new InputPair(Input.COOPERATE, Input.CHEAT)));
    }

    @Test
    public void checkScoreForCheatAndCooperate() {
        assertEquals(new OutputPair(3, -1), TruthTable.getScore(new InputPair(Input.CHEAT, Input.COOPERATE)));
    }

    @Test
    public void checkScoreForCheatAndCheat() {
        assertEquals(new OutputPair(0, 0), TruthTable.getScore(new InputPair(Input.CHEAT, Input.CHEAT)));
    }
}