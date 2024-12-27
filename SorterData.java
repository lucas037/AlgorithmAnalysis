import java.time.Duration;
import java.time.Instant;

public class SorterData {
    Instant start;
    Instant finish;
    Duration duration;

    public SorterData() {
        start = Instant.now();
        duration = Duration.ZERO;
    }

    public void finish() {
        finish = Instant.now();
        duration = Duration.between(start, finish);
    }

    public String toString() {
        String str = "";

        str += "Start: "+start+"\n";
        str += "End: "+finish+"\n";
        str += "Duration: "+duration+"\n";

        return str;
    }
}
