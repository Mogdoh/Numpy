package sec02.exam03;

public class PrintThread extends Thread{
    @Override
    public void run() {
        while (true) {
            System.out.println("실행 중");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
        }
    }
}
