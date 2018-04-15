public class CheaterPlayerBehaviour implements PlayerBehaviour {


    @Override
    public Input getInput(Input inputOfOther) {
        return Input.CHEAT;
    }
}
