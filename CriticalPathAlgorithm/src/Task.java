import java.util.ArrayList;
import java.util.List;

public class Task {
    int duration;
    int earliestStart;
    int earliestFinish;
    int latestStart;
    int latestFinish;
    int slack;
    List<Task> dependencies;

    public Task(int duration) {
        this.duration = duration;
        this.dependencies = new ArrayList<>();
    }
}
