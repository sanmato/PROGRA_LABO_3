public class CriticalPathAlgorithm {

    public static void calculate(Task task) {
        task.earliestStart = 0;
        calculateEST(task);
        task.latestFinish = task.earliestFinish;
        task.latestStart = task.latestFinish - task.duration;
        calculateLST(task);
        task.slack = task.latestStart - task.earliestStart;
    }

    private static void calculateEST(Task task) {
        int max = 0;
        for(Task dependency : task.dependencies) {
            if(dependency.earliestFinish == -1) {
                calculateEST(dependency);
            }
            max = Math.max(max, dependency.earliestFinish);
        }
        task.earliestStart = max;
        task.earliestFinish = max + task.duration;
    }

    private static void calculateLST(Task task) {
        if(task.dependencies.isEmpty()) {
            task.latestFinish = task.earliestFinish;
            task.latestStart = task.latestFinish - task.duration;
        } else {
            int min = Integer.MAX_VALUE;
            for (Task dependency : task.dependencies) {
                if(dependency.latestStart == -1) {
                    calculateLST(dependency);
                }
                min = Math.min(min, dependency.latestStart);
            }
            task.latestFinish = min;
            task.latestStart = min - task.duration;
        }
    }
}
