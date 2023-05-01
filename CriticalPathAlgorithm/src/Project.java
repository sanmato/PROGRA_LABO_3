import java.util.ArrayList;
import java.util.List;

public class Project {
    private List<Task> tasks;
    private Task startTask;
    private Task endTask;
    private int numTasks;

    public Project() {
        this.tasks = new ArrayList<>();
        this.startTask = null;
        this.endTask = null;
        this.numTasks = 0;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void addTask(Task task) {
        tasks.add(task);
        numTasks++;
    }

    public Task getStartTask() {
        return startTask;
    }

    public void setStartTask(Task startTask) {
        this.startTask = startTask;
    }

    public Task getEndTask() {
        return endTask;
    }

    public void setEndTask(Task endTask) {
        this.endTask = endTask;
    }

    public int getNumTasks() {
        return numTasks;
    }
}

