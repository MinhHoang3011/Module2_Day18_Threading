package BaiTap;

public class MainNumber {
    public static void main(String[] args) {
        NumberGenerator num1 = new NumberGenerator();
        NumberGenerator num2 = new NumberGenerator();

        Thread thread = new Thread(num1);
        Thread thread1 = new Thread(num2);

        thread.setPriority(Thread.MAX_PRIORITY);
        thread.setPriority(Thread.MIN_PRIORITY);

        thread.start();
        thread1.start();
    }
}
