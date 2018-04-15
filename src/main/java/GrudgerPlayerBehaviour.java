public class GrudgerPlayerBehaviour implements PlayerBehaviour {

    private boolean isCheater;
    private CheaterPlayerBehaviour cheaterPlayerBehaviour;
    private CooperativePlayerBehaviour cooperativePlayerBehaviour;

    GrudgerPlayerBehaviour() {
        this.isCheater = false;
        this.cheaterPlayerBehaviour = new CheaterPlayerBehaviour();
        this.cooperativePlayerBehaviour = new CooperativePlayerBehaviour();
    }

    @Override
    public Input getInput(Input input) {
        Input myNewInput = cooperativePlayerBehaviour.getInput(input);

        if (isCheater)
            myNewInput = cheaterPlayerBehaviour.getInput(input);

        if (input == Input.CHEAT && !isCheater)
            isCheater = true;

        return myNewInput;
    }
}
