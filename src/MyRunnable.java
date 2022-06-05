public class MyRunnable implements Runnable {

    public int[] array;

    public MyRunnable() {
        System.out.println("constructor called");
       this.array = new int[6];
    }



    @Override
    public void run() {
        System.out.println("Run() called for thread" + Thread.currentThread().getName());
        for (int i = 0; i < 6; i++) {

            System.out.println(i + " for thead " + Thread.currentThread().getName());

        }
    }
}
