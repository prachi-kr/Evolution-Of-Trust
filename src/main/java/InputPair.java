import java.util.Objects;

public class InputPair {
    private final Input Player1Input;
    private final Input Player2Input;


    InputPair(Input Player1Input, Input Player2Input) {
        this.Player1Input = Player1Input;
        this.Player2Input = Player2Input;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InputPair inputPair = (InputPair) o;
        return Player1Input == inputPair.Player1Input &&
                Player2Input == inputPair.Player2Input;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Player1Input, Player2Input);
    }
}
