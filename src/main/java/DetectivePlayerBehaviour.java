import java.util.Arrays;
import java.util.List;

public class DetectivePlayerBehaviour implements PlayerBehaviour {

    private final List<Input> initialInputs;
    private int round;
    private boolean isBehavingLikeCopyCat;
    private CopyCatPlayerBehaviour copyCatPlayerBehaviour;
    private CheaterPlayerBehaviour cheaterPlayerBehaviour;

    DetectivePlayerBehaviour() {
        this.initialInputs = Arrays.asList(Input.COOPERATE, Input.CHEAT, Input.COOPERATE, Input.COOPERATE);
        isBehavingLikeCopyCat = false;
        this.copyCatPlayerBehaviour = new CopyCatPlayerBehaviour();
        this.cheaterPlayerBehaviour = new CheaterPlayerBehaviour();
    }

    @Override
    public Input getInput(Input inputOfOther) {
        Input myNewInput;
        myNewInput = cheaterPlayerBehaviour.getInput(inputOfOther);

        if (round < 4) myNewInput = initialInputs.get(round);

        if (isBehavingLikeCopyCat) {
            if (round < 4) {
                copyCatPlayerBehaviour.getInput(inputOfOther);
            } else {
                myNewInput = copyCatPlayerBehaviour.getInput(inputOfOther);
            }
        }
        if (!isBehavingLikeCopyCat && inputOfOther == Input.CHEAT) {
            isBehavingLikeCopyCat = true;
            copyCatPlayerBehaviour.getInput(inputOfOther);
        }
        round++;
        return myNewInput;
    }
}
