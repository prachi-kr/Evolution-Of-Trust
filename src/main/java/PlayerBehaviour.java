import java.io.IOException;

public interface PlayerBehaviour {
    Input getInput(Input inputOfOther) throws IOException;
}
