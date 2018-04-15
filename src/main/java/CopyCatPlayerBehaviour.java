public class CopyCatPlayerBehaviour implements PlayerBehaviour {

    private Input previousInputOfOther;

    CopyCatPlayerBehaviour() {
        this.previousInputOfOther = Input.COOPERATE;
    }

    @Override
    public Input getInput(Input inputOfOther) {
        Input myNewInput = previousInputOfOther;
        this.previousInputOfOther = inputOfOther;
        return myNewInput;
    }
}
