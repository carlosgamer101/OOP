public class ThreadedArrayProcessing {

    public static void main(String[] args) {
        int[] numbers = new int[1000];

        // Fill the array with values 1 to 1000
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // Create and start two threads to process halves of the array
        Thread thread1 = new Thread(new SubArrayProcessor(numbers, 0, 499, "Thread 1"));
        Thread thread2 = new Thread(new SubArrayProcessor(numbers, 500, 999, "Thread 2"));

        thread1.start();
        thread2.start();

        // Wait for both threads to finish before exiting
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("Both threads completed.");
    }
}

class SubArrayProcessor implements Runnable {
    private int[] array;
    private int start;
    private int end;
    private String threadName;

    public SubArrayProcessor(int[] array, int start, int end, String threadName) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();

        // Example processing: just sum the values in the sub-array
        long sum = 0;
        for (int i = start; i <= end; i++) {
            sum += array[i];
        }

        long endTime = System.currentTimeMillis();

        System.out.println(threadName + " processed elements " + start + " to " + end +
                " in " + (endTime - startTime) + " ms. Sum: " + sum);
    }
}
