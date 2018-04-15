public class CooperativePlayerBehaviour implements PlayerBehaviour {

    @Override
    public Input getInput(Input inputOfOther) {
        return Input.COOPERATE;
    }
}
