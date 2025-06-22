public class Mainn {
    public static void main(String[] args) {

        MultiThread2 thready = new MultiThread2();
        MultiThread3 thready2 = new MultiThread3();

        // Capture start time
        long startTime = System.currentTimeMillis();

        thready.run();
        thready2.run();

        try {
            // Wait for both threads to complete
            thready.join();
            thready2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Capture end time
        long endTime = System.currentTimeMillis();

        // Calculate and print duration
        long duration = endTime - startTime;
        System.out.println("Total time taken for thready and thready2: " + duration + " milliseconds");
    }
}