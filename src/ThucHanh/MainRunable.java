package ThucHanh;

public class MainRunable {
    public static void main(String[] args) {
        System.out.println("Main thread running ... ");

        RunnableDemo runnableDemo = new RunnableDemo("Thread-1-HR-Database");
        runnableDemo.start();

        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-2-Send-Email");
        runnableDemo.start();

        System.out.println("Main thread stopped");
    }
}
