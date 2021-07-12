package HW2;

public class Main {
    public static void main(String[] args) {

        OnTaskDoneListener onTaskDoneListener = System.out::println;
        OnTaskErrorListener onTaskErrorListener = System.out::println;
        Worker worker = new Worker(onTaskDoneListener, onTaskErrorListener);
        worker.start();
    }
}
