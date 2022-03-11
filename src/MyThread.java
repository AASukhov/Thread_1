public class MyThread extends Thread{

    public MyThread (ThreadGroup threadGroup, String name) {
        super(threadGroup, name);
        start();
    }

    @Override
    public void run() {
        try{
            while(!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Всем привет! Я поток " + getName());
            }
        } catch (InterruptedException e) {
            System.out.println("Поток " + getName() + " прерван");
        }
        finally {
            System.out.printf("%s завершен\n", getName());
        }
    }
}
