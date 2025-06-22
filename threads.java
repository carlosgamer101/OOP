class threads{
    public static void main(String[] args){
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
        t.setName("My Thread");
        System.out.println("After name change: " + t);

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }   
}

class MyThread extends Thread {
    public void run() {
        System.out.println("My thread is running.");
    }
}