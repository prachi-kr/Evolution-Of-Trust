import java.util.Objects;

public class OutputPair {
    int FirstOutput;
    int SecondOutput;

    OutputPair(int firstOutput, int secondOutput) {
        FirstOutput = firstOutput;
        SecondOutput = secondOutput;
    }

    OutputPair() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OutputPair that = (OutputPair) o;
        return FirstOutput == that.FirstOutput &&
                SecondOutput == that.SecondOutput;
    }

    @Override
    public int hashCode() {

        return Objects.hash(FirstOutput, SecondOutput);
    }
}
