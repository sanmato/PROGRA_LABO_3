


public class Main {
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


    public static void main(String[] args) {
        Task A = new Task(8);
        Task B = new Task(3);
        Task C = new Task(12);
        Task D = new Task(16);
        Task E = new Task(12);
        Task F = new Task(8);
        Task G = new Task(6);
        Task H = new Task(16);
        Task I = new Task(6);
        Task J = new Task(5);
        Task K = new Task(5);
        Task L = new Task(24);
        Task M = new Task(8);
        Task N = new Task(2);
        Task O = new Task(4);
        Task P = new Task(24);
        Task Q = new Task(12);
        Task R = new Task(24);
        Task S = new Task(88);
        Task T = new Task(6);
        Task U = new Task(4);
        Task V = new Task(4);
        Task W = new Task(6);
        Task X = new Task(8);

        A.dependencies.add(B);
        A.dependencies.add(C);
        B.dependencies.add(D);
        C.dependencies.add(E);
        D.dependencies.add(F);
        A.dependencies.add(G);
        C.dependencies.add(H);
        C.dependencies.add(I);
        E.dependencies.add(J);
        H.dependencies.add(J);
        F.dependencies.add(K);
        G.dependencies.add(K);
        I.dependencies.add(K);
        J.dependencies.add(L);
        K.dependencies.add(L);
        J.dependencies.add(M);
        K.dependencies.add(M);
        L.dependencies.add(N);
        M.dependencies.add(N);
        V.dependencies.add(O);
        M.dependencies.add(P);
        L.dependencies.add(Q);
        M.dependencies.add(Q);
        P.dependencies.add(R);
        N.dependencies.add(S);
        M.dependencies.add(T);
        R.dependencies.add(U);
        T.dependencies.add(U);
        S.dependencies.add(V);
        T.dependencies.add(V);
        Q.dependencies.add(W);
        O.dependencies.add(X);
        U.dependencies.add(X);
        W.dependencies.add(X);

        CriticalPathAlgorithm.calculate(A);

        System.out.println("Critical Path: ");
        printCriticalPath(A);

    }

    private  static void printCriticalPath(Task task) {
        System.out.println(" -> " + task + " (Duration: " + task.duration + ")");
        if(task.dependencies.isEmpty()) {
            return;
        }
        Task criticalDependency = null;
        for(Task dependency : task.dependencies) {
            if(dependency.slack == 0) {
                criticalDependency = dependency;
                break;
            }
        }
        if(criticalDependency != null) {
            printCriticalPath(criticalDependency);
        }
    }
}