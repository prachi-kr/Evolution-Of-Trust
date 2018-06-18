import java.util.Objects;
import java.util.function.IntConsumer;
import java.util.function.Supplier;



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


    public void workWithOutput(IntConsumer consumer, boolean isFirstOutput) {
        consumer.accept(isFirstOutput ? FirstOutput : SecondOutput);
    }
}
