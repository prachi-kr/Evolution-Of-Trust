public enum TruthTable{
    CHEAT_CHEAT(new InputPair(Input.CHEAT,Input.CHEAT),new OutputPair(0,0)),
    CHEAT_COOPERATE(new InputPair(Input.CHEAT,Input.COOPERATE),new OutputPair(3,-1)),
    COOPERATE_CHEAT(new InputPair(Input.COOPERATE,Input.CHEAT),new OutputPair(-1,3)),
    COOPERATE_COOPERATE(new InputPair(Input.COOPERATE,Input.COOPERATE),new OutputPair(2,2));

    private final InputPair inputPair;
    final OutputPair outputPair;

    TruthTable(InputPair inputPair, OutputPair outputPair) {
        this.inputPair=inputPair;
        this.outputPair=outputPair;
    }

    public static OutputPair getScore(InputPair inputPair) {
        OutputPair outputPair = new OutputPair();
        for(TruthTable value: TruthTable.values()) {
            if(value.inputPair.equals(inputPair)) {
                outputPair = value.outputPair;
            }
        }
        return outputPair;
    }

}
