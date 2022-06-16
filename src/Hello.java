public class Hello {

    public static void main(String[] args) {

        Thread rt = new Thread(new MyRunnable());

        rt.setName("Threadie Mercury");
        rt.start();

        Thread rt2 = new Thread(new MyRunnable());


        rt2.setName("Al-Thread Hitchcock");
        rt2.start();

        Thread rt3 = new Thread(() -> {
            
        });


//        MyThread thread = new MyThread();
//        thread.setName("Gerald");
//        thread.start();
//
//        MyThread thread2 = new MyThread();
//        thread2.setName("Bob");
//        thread2.start();



//        System.out.println("other thread = " + thread.getName());
//        System.out.println("Thread = " + Thread.currentThread().getName());




    } // end main()

    public static void loop(){
        for(int i = 10; i<20; i++){
            System.out.println(i);
        }
    }

}

