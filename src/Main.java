public class Main {
    public static void main(String[] args) {

        ThreadGroup group = new ThreadGroup("Group");

        Thread thread1 = new MyThread(group, "1");
        Thread thread2 = new MyThread(group, "2");
        Thread thread3 = new MyThread(group, "3");
        Thread thread4 = new MyThread(group, "4");

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Завершение потоков");
        group.interrupt();
    }
}
